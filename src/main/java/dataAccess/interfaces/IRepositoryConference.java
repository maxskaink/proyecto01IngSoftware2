/**
 * @file IRepository.java
 * @author Miguel Calambas
 * @Brief It generalice the repositories of the entities
 */
package dataAccess.interfaces;

import models.Conference;

import java.util.List;

public interface IRepositoryConference {
    boolean addConference(Conference conference);
    List<Conference> getConferences();
    List<Conference> getConferencesByOrganizer(int idOrganizer);
    Conference getConferenceById(int idConference);
    Conference deleteConferenceById(int idConference);
    Conference updateConference(int idConference, Conference newConference);
}
