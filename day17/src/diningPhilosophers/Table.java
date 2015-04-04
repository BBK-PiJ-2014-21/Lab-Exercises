package diningPhilosophers;

/**
 *
 */
public class Table {
    private Philosopher[] philosophers;
    private Boolean[] forks;

    public Table(Philosopher[] philosophers) {
        this.philosophers = philosophers;
        forks = new Boolean[philosophers.length];
    }

    public Philosopher[] getPhilosophers() {
        return philosophers;
    }

    public Boolean[] getForks() {
        return forks;
    }

}
