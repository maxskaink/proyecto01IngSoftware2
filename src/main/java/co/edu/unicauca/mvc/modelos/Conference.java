
package co.edu.unicauca.mvc.modelos;


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
    private boolean isOpen ;
    
    /**
     * 
     * @param name Nombre de la conferencia 
     * @param startDate Fecha inicio de la conferencia 
     * @param finishDate Fecha de finalizacion de la conferencia 
     * @param place Lugar de la conferencia
     * @param topic Tema de la conferencia
     * @param idConference  Atributo identificador de la conferencia (Generado en automatico)
     */
    public Conference(String name, Date startDate, Date finishDate, String place, String topic, int idConference) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.place = place;
        this.topic = topic;
        this.idConference = idConference;
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
    
    
}
