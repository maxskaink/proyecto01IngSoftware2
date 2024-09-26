/**
 * @file ServiceStorageConferences
 * @author Miguel Calambas
 * @brief It's the service to storage conferences generalizing the repositories
 */
package Services;

import PObserver.Subject;
import models.Conference;
import dataAccess.interfaces.IRepositoryConference;
import java.util.List;

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

        //valid if the id exist, if the id exist return false
        if(this.getConferenceById(obj.getIdConference()) != null){
            return false;
        }
        //Valid if the date is correct logic
        else if(obj.getFinishDate().after(obj.getStartDate())){
            this.notifyObservers();
            return this.refRepository.addConference(obj);
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
        return (this.refRepository.updateConference(idConference, newConference));
    }

    /**
     *
     * @param idConference id of conference
     * @return Connfence deleted
     */
    public Conference deleteConferenceById(int idConference){
        this.notifyObservers();
        return this.refRepository.deleteConferenceById(idConference);
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
