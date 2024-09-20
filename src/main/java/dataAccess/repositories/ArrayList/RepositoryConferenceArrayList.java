/**
 * @file RepositoryArticleArrayList
 * @author Miguel Calambas
 * @brief Simple Repository of Conference with ArrayLists
 */
package dataAccess.repositories.ArrayList;

import models.Conference;
import dataAccess.interfaces.IRepositoryConference;
import java.util.ArrayList;
import java.util.List;


public class RepositoryConferenceArrayList implements IRepositoryConference {
    
    private  ArrayList<Conference> conferences;

    public RepositoryConferenceArrayList() {
        this.conferences = new ArrayList<>();
    }

    /**
     * @return Return all the conferences
     */

    @Override
    public List<Conference> getConferences() {
        return this.conferences;
    }

    /**
     * @param idOrganizer organizer id to search
     * @return all the organizer of the organizer id
     */
    @Override
    public List<Conference> getConferencesByOrganizer(int idOrganizer) {

        ArrayList<Conference> foundConferences = new ArrayList<>();

        if(idOrganizer <=0)
            return foundConferences;
        for(Conference conference : this.conferences)
            if(conference.getIdOrganizer() == idOrganizer)
                foundConferences.add(new Conference(
                        conference.getName(),
                        conference.getStartDate(),
                        conference.getFinishDate(),
                        conference.getPlace(),
                        conference.getTopic(),
                        conference.getIdConference(),
                        conference.getIdOrganizer()
                ));

        return foundConferences;
    }

    /**
     * @param idConference Conference ID to search
     * @return return a Conference with the ID
     */
    @Override
    public Conference getConferenceById(int idConference) {
        if(idConference <= 0)
            return null;

        for(Conference conference : this.conferences)
            if(conference.getIdConference() == idConference)
                return new Conference(
                        conference.getName(),
                        conference.getStartDate(),
                        conference.getFinishDate(),
                        conference.getPlace(),
                        conference.getTopic(),
                        conference.getIdConference(),
                        conference.getIdOrganizer()
                );
        return null;
    }

    /**
     * @param idConference  id conference to delete
     * @return deleted conference
     */
    @Override
    public Conference deleteConferenceById(int idConference) {
        Conference conferenceToDelete = null;
        if(idConference <= 0)
            return null;
        for(Conference conference : this.conferences)
            if( conference.getIdConference() == idConference ){
                conferenceToDelete = conference;
                break;
            }

        if(this.conferences.remove(conferenceToDelete))
            return conferenceToDelete;
        else
            return null;
    }

    /**
     * @param idConference id conference to update
     * @param newConference instance of the new conference to add
     * @return updated conference
     */
    @Override
    public Conference updateConference(int idConference, Conference newConference) {
        if(newConference == null)
            return null;
        if(idConference <= 0)
            return null;

        newConference.setName(newConference.getName().strip());
        newConference.setPlace(newConference.getPlace().strip());
        newConference.setTopic(newConference.getTopic().strip());

        if(newConference.getIdConference() != idConference)
            return null;
        if( newConference.getName().compareTo("") == 0 ||
            newConference.getPlace().compareTo("") == 0 ||
            newConference.getTopic().compareTo("") == 0 )
            return null;

        int index = 0;
        Conference oldConference;
        for(Conference conference : this.conferences){
            if(conference.getIdConference() == idConference){
                oldConference = this.conferences.get(index);
                this.conferences.set(index, newConference);
                return oldConference;
            }
            index++;
        }

        return null;
    }

    /**
     * @param conference The conference to add
     * @return true if the add is successfully
     */
    @Override
    public boolean addConference(Conference conference) {
        if(conference == null)
            return false;
        conference.setName(conference.getName().strip());
        conference.setPlace(conference.getPlace().strip());
        conference.setTopic(conference.getTopic().strip());

        if(conference.getIdOrganizer() <= 0)
            return false;
        if(conference.getIdConference() <= 0)
            return false;
        if( conference.getName().compareTo("") == 0 ||
            conference.getPlace().compareTo("") == 0 ||
            conference.getTopic().compareTo("") == 0)
            return false;

        return this.conferences.add(conference);
    }
    
}
