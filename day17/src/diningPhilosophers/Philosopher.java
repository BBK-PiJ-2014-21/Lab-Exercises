package diningPhilosophers;

/**
 *
 */
public class Philosopher implements Runnable {
    private Table table;
    private String name;
    private int id;

    public Philosopher(String name) {
        this.name = name;
    }

    public Philosopher(Table table, String name, int id) {
        this.table = table;
        this.name = name;
        this.id = id;
    }

    public void sit(Table table) {
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public boolean getLeftFork() {
        if (table.getForks()[id]) {
            table.getForks()[id] = false;
            return true;
        } else {
            return false;
        }
    }

    public void dropForks() {
        table.getForks()[id] = false;
        table.getForks()[id + 1 % table.getPhilosophers().length] = false;
    }

    public boolean getRightFork() {
        if (table.getForks()[id + 1 % table.getPhilosophers().length]) {      // TODO assign to local variable later
            table.getForks()[id + 1 % table.getPhilosophers().length] = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep((long) Math.random() * 2000);  // "think" for a random amount of ms
                if (!getLeftFork()) {
                    System.out.println(Thread.currentThread().getName() + " cannot take his left fork");
                } else {
                    getLeftFork();
                    if (!getRightFork()) {
                        System.out.println(Thread.currentThread().getName() + " cannot take his right fork");
                    } else {
                        getRightFork();
                    }
                }
                System.out.println("Eating...");
                Thread.sleep(1000); // eating
                System.out.println(Thread.currentThread().getName() + " has finished eating.");
                dropForks();
            }
        } catch(InterruptedException ex){
                //
        }
    }
}