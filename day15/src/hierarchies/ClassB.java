package hierarchies;

/**
 *
 */
public class ClassB extends ClassA {
    
    @Override
    public void throwException() throws LevelB {
        throw new LevelB();
    }
}
