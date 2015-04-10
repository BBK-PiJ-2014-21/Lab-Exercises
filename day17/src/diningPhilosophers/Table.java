package diningPhilosophers;

/**
 *
 */
public class Table {
    private Boolean[] forks;

    public Table (int n) {
        forks = new Boolean[n];
    }

    public void setUp() {
        for(int i=0; i<forks.length; i++) {
            forks[i] = true;
        }
    }

    public Boolean[] getForks() {
        return forks;
    }

    public boolean getForks(int index) {
        return forks[index];
    }

}
