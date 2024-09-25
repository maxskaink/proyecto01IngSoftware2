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
    
    private final IRepositoryConference refRepository;
    
    public ServiceStorageConferences(IRepositoryConference repository){
        this.refRepository = repository;
    }

    /**
     *
     * @param obj Conference to valid
     * @return the result of operation
     */
    public boolean addConference(Conference obj) {
        //Valid if the date is correct logic
        if(obj.getFinishDate().after(obj.getStartDate())){
            return this.refRepository.addConference(obj);
        }
        return false;
    }
    
    public boolean updateConference(Conference obj, int conf){
        return (this.refRepository.updateConference(conf, obj)!=null);
    }
    
    public boolean deleteConferenceById(int id){
        return this.refRepository.deleteConferenceById(id)!=null;
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
        return conference.setOpen(true);
    }

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
