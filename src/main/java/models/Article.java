
package models;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Article {
    private String name;
    private final int idAuthor;
    private final int idConference;
    private String keyWords;
    private Date publishDate;

    
    /**
     * @param name author name
     * @param idAuthor author id who upload the article
     * @param idConference conference id
     */
  
    
    public Article(String name, int idAuthor, int idConference, String keyWords, Date publishDate) {
        this.name = name;
        this.idAuthor = idAuthor;
        this.idConference = idConference;
        this.keyWords = keyWords;
        this.publishDate = publishDate;
    }
    public Article copy(){
        return new Article(
                this.getName(),
                this.getIdAuthor(),
                this.getIdConference(),
                this.getKeyWords(),
                this.getPublishDate()
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
    public String getKeyWords() {return keyWords;}
    public void setKeyWords(String keyWords) {this.keyWords = keyWords;}
    public Date getPublishDate() {return publishDate;}
    public void setPublishDate(Date publishDate) {this.publishDate = publishDate;}
}
