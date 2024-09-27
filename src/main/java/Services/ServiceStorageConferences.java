/**
 * @file ServiceStorageConferences
 * @author Miguel Calambas
 * @brief It's the service to storage conferences generalizing the repositories
 */
package Services;

import PObserver.Subject;
import models.Conference;
import dataAccess.interfaces.IRepositoryConference;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 *
 * @author calam
 */
public class ServiceStorageConferences extends Subject {
    
    private  IRepositoryConference refRepository;
    
    public ServiceStorageConferences(IRepositoryConference repository){
        this.refRepository = repository;
    }

    /**
     *
     * @param obj Conference to valid
     * @return the result of operation
     */
    public boolean addConference(Conference obj) {
        Random random = new Random();
        //valid if the id exist, if the id exist return false
        if (this.getConferenceById(obj.getIdConference()) != null) {
            return false;
        }
        //Genereate id
        /**
        SimpleDateFormat formatoDia = new SimpleDateFormat("dd");
        String diaString = formatoDia.format(obj.getStartDate());
        int codeDay = Integer.parseInt(diaString);

        int idGenerate = obj.getIdConference()*10+ codeDay* 100 + random.nextInt(10);
        **/

        //Valid if the date is correct logic
        if(obj.getFinishDate().after(obj.getStartDate())){
            //obj.setIdConference(idGenerate);
            if(this.refRepository.addConference(obj)){
                this.notifyObservers();
                return true;
            }else return false;
        }

        return false;
    }

    /**
     *
     * @param newConference Conference to update
     * @param idConference id of old conference
     * @return Conference updated
     */
    public Conference updateConference(Conference newConference, int idConference){
        this.notifyObservers();
        Conference oldConference = (this.refRepository.updateConference(idConference, newConference));
        if (oldConference != null)
            this.notifyObservers();
        return oldConference;
    }

    /**
     *
     * @param idConference id of conference
     * @return Connfence deleted
     */
    public Conference deleteConferenceById(int idConference){
        this.notifyObservers();
        Conference conference = (this.refRepository.deleteConferenceById(idConference));
        if (conference != null)
            this.notifyObservers();
        return conference;
    }

    /**
     * @param id identify of Conference
     * @return the result of the operation successfully or failed, in bad case, the function return exception
     */
    public boolean alterOpenConference(int id) {
        Conference conference = getConferenceById(id);
        if (conference == null)
            throw new IllegalArgumentException("Conference not found with id: " + id);
        if (conference.isOpen())
            conference.setOpen(false);
        this.notifyObservers();
        return conference.setOpen(true);
    }

    /**
     * @param id
     * @return
     */
    public boolean isOpen(int id){
        return this.refRepository.getConferenceById(id).isOpen();
    }
    public List<Conference> listConferences(){
        return this.refRepository.getConferences();
    }
    
    public List<Conference> listConferencesByOrganizer(int idOrganizer) {
        return this.refRepository.getConferencesByOrganizer(idOrganizer);
    }

    
    public Conference getConferenceById(int id){
        return this.refRepository.getConferenceById(id);
    }
}
