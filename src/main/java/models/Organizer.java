package models;

/**
 *
 * @author santi
 */
public class Organizer extends Author{

    public Organizer(String name, int id) {
        super(name, id);
    }

    public Organizer copy(){
        return new Organizer(
                this.getName(),
                this.getId()
        );
    }
    /**
     * @return the name
     */
    public String getName() {
        return super.getName();
    }

    /**
     * @return the id
     */
    public int getId() {
        return super.getId();
    }
    
    
}
