
package models;

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

    /**
     * 
     * @param name Conference name
     * @param startDate Started Date
     * @param finishDate End Date
     * @param place place of the conference
     * @param topic main topic of the conference
     * @param idConference id of the conference
     *
     */
    public Conference(String name, String description, Date startDate,  Date finishDate, String place, String topic, int idConference, int idOrganizer) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.place = place;
        this.topic = topic;
        this.idConference = idConference;
        this.idOrganizer = idOrganizer;
        this.isOpen = false;
        this.description = description;
    }

    public Conference copy(){
        return new  Conference(
                this.getName(),
                this.getDescription(),
                this.getStartDate(),
                this.getFinishDate(),
                this.getPlace(),
                this.getTopic(),
                this.getIdConference(),
                this.getIdOrganizer()
        );
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
    public void setDescription(String description) { this.description = description; }
}
