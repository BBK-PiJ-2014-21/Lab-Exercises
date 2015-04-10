package selfOrderingList;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class ThreadedIntegerList {
    private Integer[] list;
    private int size;
    private boolean sorted;
    private boolean blockadd;
    boolean finished;

    public ThreadedIntegerList() {
        list = new Integer[10];
        size = 0;
        sorted = true;
        blockadd = false;
        finished = false;
    }

    public ThreadedIntegerList(int n) {
        list = new Integer[n];
        size = 0;
        sorted = true;
        blockadd = false;
        finished = false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void increaseSize() {
        Integer[] newList = new Integer[list.length * 2];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    public boolean add(int n) {
        if (!blockadd) {
            if (list[list.length - 1] != null) {
                increaseSize();
            }
            list[size] = n;
            size++;
            sorted = false;
            return true;
        } else {
            System.out.println("Waiting for getInt() to return. Please try again.");
            return false;
        }
    }

    public Integer getInt(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("The list size is " + size + ", cannot return index " + index);
            return null;
        }
        while (!sorted) {
            blockadd = true;
            try {
                System.out.println("sorted = " + sorted + "; WAITING...");
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                //
            }
        }
        blockadd = false;
        return list[index];
    }

    public boolean prettyPrint() {
        if (!sorted) {
            System.out.println("The list is not sorted. Please try again.");
            return false;
        } else {
            System.out.print("[ ");
            for (int i = 0; i < size; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println("]");
            return true;
        }
    }

    public void launch() {
        Scanner sc = new Scanner(System.in);
        Sorting sorting = new Sorting();
        Thread sorter = new Thread(sorting);
        sorter.start();
        do {
            System.out.println("1. add(int)");
            System.out.println("2. get(int)");
            System.out.println("3. prettyPrint()");
            System.out.println("(any other number to exit)");
            System.out.print(">> ");
            try {
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("Please enter an integer to add: ");
                        n = sc.nextInt();
                        add(n);
                        break;
                    case 2:
                        System.out.print("Please enter the index of the integer to get: ");
                        n = sc.nextInt();
                        System.out.println("I got " + getInt(n));
                        break;
                    case 3:
                        prettyPrint();
                        break;
                    default:
                        System.out.println("Goodbye.");
                        finished = true;
                        sorter.join();
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input.");
            } catch (InterruptedException ex) {
                // do nothing
            }
        } while (!finished);
        System.out.println("Thread.isAlive() : " + sorter.isAlive());
    }

    public class Sorting implements Runnable {
        /**
         * The sorting algorithm is purposely slow and naive (i.e. sorting a size 1 list)
         * in order to see the functionality in action.
         */
        @Override
        public void run() {
            while (!finished) {
                while (sorted) {
                    try {
                        System.out.println("SLEEPING... (sorted = " + sorted + ")");
                        Thread.sleep(8000);
                    } catch (InterruptedException ex) {
                        // back to the try block
                    }
                }
                System.out.println("SORTING... (sorted = " + sorted + ")");
                boolean bubble = false;
                while (!bubble) {
                    bubble = true;
                    for (int i = 0; i < size - 1; i++) {
                        if (list[i] > list[i + 1]) {
                            bubble = false;
                            Integer temp = list[i + 1];
                            list[i + 1] = list[i];
                            list[i] = temp;
                        }
                    }
                }
                sorted = true;
            }
        }

    }

}