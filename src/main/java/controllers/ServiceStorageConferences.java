/**
 * @file ServiceStorageConferences
 * @author Miguel Calambas
 * @brief It's the service to storage conferences generalizing the repositories
 */
package controllers;

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

    /**
     * @param id identify of Conference
     * @return the result of the operation succesfully or failed, in bad case, the function return excepcion
     */
    public boolean alterOpenConference(int id) {
        Conference conference = getConferenceById(id);
        if (conference == null)
            throw new IllegalArgumentException("Conference not found with id: " + id);
        if (conference.isOpen())
            conference.setOpen(false);
        return conference.setOpen(true);
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
