/**
 * @file RepositoryConferenceArrayList
 * @author Miguel Calambas
 * @brief Simple Repository of Conference with ArrayLists
 */
package dataAccess.repositories;

import dataAccess.interfaces.IRepository;
import java.util.ArrayList;
import java.util.List;
import models.Conference;

public class RepositoryConferenceArrayList implements IRepository {
    
    private ArrayList<Conference> conferences;

    public RepositoryConferenceArrayList() {
        this.conferences = new ArrayList<>();
    }

    public boolean almacenar(Conference obj) {
        return this.conferences.add(obj); 
    }

    @Override
    public List<Conference> listar() {
        return (List<Conference>) this.conferences; 
    }

    @Override
    public boolean almacenar(Object obj) {
        return this.almacenar((Conference)obj);
    }
    
}
