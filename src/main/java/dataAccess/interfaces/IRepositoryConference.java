/**
 * @file IRepository.java
 * @author Miguel Calambas
 * @Brief It generalice the repositories of the entities
 */
package dataAccess.interfaces;

import models.Conference;

import java.util.List;

/**
 * @brief interface to repositories of the models 
 */
public interface IRepositoryConference {
    public boolean addConference(Conference conference);
    public List<Conference> getConferences();
    public List<Conference> getConferencesByOrganizer(int idOrganizer);
    public Conference getConferenceById(int idConference);
}
