
package models;

/**
 *
 * @author santi
 */
public class Article {
    private String name;
    private int idAutor;
    private int idConferencia;
    
    /**
     * @param name nombre del autor
     * @param idAutor identificador del archivo
     * @param idConferencia identificador de la conferencia
     */
  
    
    public Article(String name, int idAutor, int idConferencia) {
        this.name = name;
        this.idAutor = idAutor;
        this.idConferencia = idConferencia;
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
    public void setIdAutor(int idAutor) {this.idAutor = idAutor;}
    public int getIdConferencia() {return this.idConferencia;}
    public void setIdConferencia(int idConferencia) {this.idConferencia = idConferencia;}

   
}
