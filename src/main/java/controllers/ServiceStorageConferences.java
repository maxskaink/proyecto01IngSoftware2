/**
 * @file ServiceStorageConferences
 * @author Miguel Calambas
 * @brief It's the service to storage conferences generalizing the repositories
 */
package controllers;

import co.edu.unicauca.mvc.modelos.Conference;
import dataAccess.interfaces.IRepository;
import java.util.List;

/**
 *
 * @author calam
 */
public class ServiceStorageConferences {
    
    private IRepository<Conference> refRepository;
    
    public ServiceStorageConferences(IRepository<Conference> repository){
        this.refRepository = repository;
    }
    
    public boolean addConference(Conference obj){
        return this.refRepository.almacenar(obj);
    }
    
    public List<Conference> listConferences(){
        return this.refRepository.listar();
    } 
    
}
