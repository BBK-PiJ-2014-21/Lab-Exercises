package selfOrderingList;

/**
 *
 */
public class ThreadedListLauncher {

    public static void main(String[] args) {
     // ThreadedIntegerList t = new ThreadedIntegerList();
        ThreadedIntegerListTwo t = new ThreadedIntegerListTwo();
        t.launch();
    }

}
