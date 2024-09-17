/**
 * @file RepositoryConferenceArrayList
 * @author Miguel Calambas
 * @brief Simple Repository of Conference with ArrayLists
 */
package dataAccess.repositories;

import models.Conference;
import dataAccess.interfaces.IRepositoryConference;
import java.util.ArrayList;
import java.util.List;


public class RepositoryAutorConferenceArrayList implements IRepositoryConference {
    
    private ArrayList<Conference> conferences;

    /**
    * @brief Repository to manage Conference in ArrayLists
    */
    public RepositoryAutorConferenceArrayList() {
        this.conferences = new ArrayList<>();
    }

    /**
     * @return Return all the conferences
     */

    @Override
    public List<Conference> getConferences() {
        return (List<Conference>) this.conferences; 
    }

    /**
     * @param idOrganizer organizer Id to search
     * @return all the organizer of the organizer id
     */
    @Override
    public List<Conference> getConferencesByOrganizer(int idOrganizer) {
        return List.of();
    }

    /**
     * @param idConference Conference ID to search
     * @return return a Conference with the ID
     */
    @Override
    public Conference getConferenceById(int idConference) {
        return null;
    }

    /**
     * @param conference The conference to add
     * @return true if the add is succesfully
     */
    @Override
    public boolean addConference(Conference conference) {
        return this.addConference((Conference) conference);
    }
    
}
