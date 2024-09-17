
package co.edu.unicauca.mvc.modelos;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Article {
    private String name;
    private File articuls;
    
    /**
     * 
     * @param name nombre del archivo
     * @param id identificador del archivo
     * @param article  archivo guardado en FIle
     */
  
    
    public Article(String name, File article) {
        this.name = name;
        this.articuls = article;
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



    /**
     * @return the articuls
     */
    public File getArticuls() {
        return articuls;
    }

    /**
     * @param articuls the articuls to set
     */
    public void addArticuls(File articls) {
        this.articuls  =articls ;
    }

   
}
