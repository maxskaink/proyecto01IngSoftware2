package models;

/**
 *
 * @author Santiago Escandon
 */
public class Author {
    private String name;
    private int id;

    /** 
     * @param name user name
     * @param id id user, it comes from the users
     */
    public Author(String name, int id) {
        this.name = name;
        this.id = id;
        
    }
    public Author copy(){
        return new Author(
                this.getName(),
                this.getId()
        );
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
