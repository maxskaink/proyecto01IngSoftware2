
package models;


import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author santi
 */
public class Conference {
    
    private String name;
    private Date startDate;
    private Date finishDate;
    private String place;
    private String topic;
    private int idConference;
    private int idOrganizer;
    private  boolean isOpen ;
    private String description;
    ArrayList <Article> articles;
    Organizer organizer;

    /**
     * 
     * @param name Nombre de la conferencia 
     * @param startDate Fecha inicio de la conferencia 
     * @param finishDate Fecha de finalizacion de la conferencia 
     * @param place Lugar de la conferencia
     * @param topic Tema de la conferencia
     * @param idConference  Atributo identificador de la conferencia (Generado en automatico)
     * @param organizer Class organizador
     *
     */
    public Conference(String name, String description, Date startDate,  Date finishDate, String place, String topic, int idConference, Organizer organizer) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.place = place;
        this.topic = topic;
        this.idConference = idConference;
        this.idOrganizer = idOrganizer;
        this.isOpen = false;
        this.description = description;
        this.articles = new ArrayList<Article>();
    }

    public Conference copy(){
        Conference conference = new  Conference(
                this.getName(),
                this.getDescription(),
                this.getStartDate(),
                this.getFinishDate(),
                this.getPlace(),
                this.getTopic(),
                this.getIdConference(),
                this.getOrganizer().copy()
        );
        for(Article articule: articles)
            conference.addArticle(articule.copy());
        return conference ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public int getIdConference() {
        return idConference;
    }
    public void setIdConference(int idConference) {
        this.idConference = idConference;
    }
    public boolean isOpen(){return this.isOpen;}
    public int getIdOrganizer() {
        return idOrganizer;
    }

    public void setIdOrganizer(int idOrganizer) {
        this.idOrganizer = idOrganizer;
    }
    public boolean setOpen(boolean open) {
        return this.isOpen = open;
    }
    public String getDescription() {
        return description;
    }
    public Organizer getOrganizer() { return this.organizer; }
    public void setOrganizer(Organizer organizer) { this.organizer = organizer; }
    public void setDescription(String description) { this.description = description; }
    public ArrayList<Article> getArticles() {return this.articles;}
    public void addArticle(Article article) {this.articles.add(article);}
    public void setArticules(ArrayList<Article> articles){this.articles = articles;}
}
