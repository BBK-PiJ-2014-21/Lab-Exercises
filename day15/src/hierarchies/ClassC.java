package hierarchies;

/**
 *
 */
public class ClassC extends ClassB {

    @Override
    public void throwException() throws LevelC {
        throw new LevelC();
    }
    
}
