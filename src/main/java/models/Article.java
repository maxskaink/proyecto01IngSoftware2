
package models;

/**
 *
 * @author santi
 */
public class Article {
    private String name;
    private final int idAuthor;
    private final int idConference;
    
    /**
     * @param name author name
     * @param idAuthor author id who upload the article
     * @param idConference conference id
     */
  
    
    public Article(String name, int idAuthor, int idConference) {
        this.name = name;
        this.idAuthor = idAuthor;
        this.idConference = idConference;
    }
    public Article copy(){
        return new Article(
                this.getName(),
                this.getIdAuthor(),
                this.getIdConference()
        );
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public int getIdAuthor() {return this.idAuthor;}
    public int getIdConference() {return idConference;}
}
