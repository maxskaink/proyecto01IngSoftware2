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
    
    public boolean addConference(Conference obj){
        return this.refRepository.addConference(obj);
    }
    
    public List<Conference> listConferences(){
        return this.refRepository.getConferences();
    }
    public Conference getConferenceById(int id){
        return this.refRepository.getConferenceById(id);
    }
}
