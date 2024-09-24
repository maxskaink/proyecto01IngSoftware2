
package models;

/**
 *
 * @author santi
 */
public class Article {
    private String name;
    private int idAutor;
    private int  idConferencia;
    
    /**
     * @param name nombre del autor
     * @param idAutor identificador del archivo
     * @param idConference identificador de la conferencia
     */
  
    
    public Article(String name, int idAutor, int idConference) {
        this.name = name;
        this.idAutor = idAutor;
        this.idConferencia = idConference;
    }
    public Article copy(){
        return new Article(
                this.getName(),
                this.getIdAutor(),
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
    public int getIdAutor() {return this.idAutor;}
    public int getIdConference() {return idConferencia;}
}
