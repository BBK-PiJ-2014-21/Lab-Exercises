package hierarchies;

/**
 *
 */
public class Launcher {

    public static void main(String[] args) throws LevelA {
        Launcher x = new Launcher();
        x.launch();
    }
    
    public void launch() throws LevelA {
        ClassA c = new ClassC();
        c.throwException();
    }
}
