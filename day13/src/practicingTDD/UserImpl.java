package practicingTDD;

/**
 * Class implementing the interface {@see User}
 */
public class UserImpl {
    private String name;
    private int id;
    
    public UserImpl(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
    
}
