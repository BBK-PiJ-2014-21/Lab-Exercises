package diningPhilosophers;

/**
 * If all the philosopher take the first fork with the same hand, deadlock might occur.
 * If one of them take the other fork first (i.e. a Righty and four Lefties) deadlock does not occur.
 */
public class Philosopher implements Runnable {
    private Table table;
    private String name;
    private final int ID;

    public Philosopher(Table table, String name, int id) {
        this.table = table;
        this.name = name;
        this.ID = id;
    }

    public void sit(Table table) {
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public boolean getLeftFork() {
        if (!table.getForks()[ID]) {
            return false;
        } else {
            table.getForks()[ID] = false;
            return true;
        }
    }

    public boolean getRightFork() {
        if (!table.getForks()[(ID+1)%table.getForks().length]) {
            return false;
        } else {
            table.getForks()[(ID+1)%table.getForks().length] = false;
            return true;
        }
    }

    public void dropForks() {
        table.getForks()[ID] = true;
        table.getForks()[(ID+1)%table.getForks().length] = true;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(getName() + " is thinking...");
                Thread.sleep((long) Math.random() * 10000);  // "think" for a random amount of ms
                Thread.sleep(5000);
   //             if(ID!=0) {
                    eatLefty();
   //             } else {
   //                 eatRighty();
   //             }
            }
        } catch(InterruptedException ex) {
            //
        }
    }

    public void eatLefty() {
        try {
            while(!getLeftFork()) {
                System.out.println(getName() + " can't take fork[" + ID + "]");
                Thread.sleep(100);
            }
            System.out.println(getName() + " has taken fork[" + ID + "]");
            Thread.sleep(50);  // this really help deadlock
            while(!getRightFork()) {
                System.out.println(getName() + " can't take fork[" + (ID+1)%table.getForks().length + "]");
                Thread.sleep(100);
            }
            System.out.println(getName() + " has taken fork[" + (ID+1)%table.getForks().length + "]");
            System.out.println(getName() + " is eating...");
            Thread.sleep((long) Math.random() * 5000);
            System.out.println(getName() + " has finished eating");
            dropForks();
        } catch (InterruptedException ex) {
            //
        }
    }

    public void eatRighty() {
        try {
            while(!getRightFork()) {
                System.out.println(getName() + " can't take fork[" + (ID+1)%table.getForks().length + "]");
                Thread.sleep(100);
            }
            System.out.println(getName() + " has taken fork[" + (ID+1)%table.getForks().length + "]");
            Thread.sleep(50);  // this really help deadlock
            while(!getLeftFork()) {
                System.out.println(getName() + " can't take fork[" + ID + "]");
                Thread.sleep(100);
            }
            System.out.println(getName() + " has taken fork[" + ID + "]");
            System.out.println(getName() + " is eating...");
            Thread.sleep((long) Math.random() * 5000);
            System.out.println(getName() + " has finished eating");
            dropForks();
        } catch (InterruptedException ex) {
            //
        }
    }

}

