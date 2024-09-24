
package models;

/**
 *
 * @author santi
 */
public class Article {
    private String name;
    private int idAutor;
    private Conference conferencia;
    
    /**
     * @param name nombre del autor
     * @param idAutor identificador del archivo
     * @param conference identificador de la conferencia
     */
  
    
    public Article(String name, int idAutor, Conference conference) {
        this.name = name;
        this.idAutor = idAutor;
        this.conferencia = conferencia;
    }
    public Article copy(){
        return new Article(
                this.getName(),
                this.getIdAutor(),
                this.getConference().copy()
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
    public int getIdAutor() {return this.idAutor;}
    public Conference getConference() {return conferencia;}
    public void setConference(Conference conference) {this.conferencia = conference;}

}
