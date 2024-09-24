package dataAccess.repositories.ArrayList;

import models.Conference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryConferenceArrayListTest {
    private RepositoryConferenceArrayList repository;
    @BeforeEach
    void setUp() {
        repository = new RepositoryConferenceArrayList();
    }

    @Test
    void testAddConference_Success() {
        Conference conference = new Conference("Conference 1", "",new Date(), new Date(), "Place 1", "Topic 1", 1, 1);
        boolean result = repository.addConference(conference);
        assertTrue(result);
    }

    @Test
    void testAddConference_Failure_EmptyName() {
        Conference conference = new Conference("", "",new Date(), new Date(), "Place 1", "Topic 1", 1, 1);
        boolean result = repository.addConference(conference);
        assertFalse(result);
    }

    @Test
    void testAddConference_Failure_InvalidId() {
        Conference conference = new Conference("Conference 1", "",new Date(), new Date(), "Place 1", "Topic 1", -1, 1);
        boolean result = repository.addConference(conference);
        assertFalse(result);
    }

    @Test
    void testGetConferences_Success() {
        Conference conference1 = new Conference("Conference 1", "",new Date(), new Date(), "Place 1", "Topic 1", 1, 1);
        Conference conference2 = new Conference("Conference 2", "",new Date(), new Date(), "Place 2", "Topic 2", 2, 2);
        repository.addConference(conference1);
        repository.addConference(conference2);
        List<Conference> conferences = repository.getConferences();
        assertEquals(2, conferences.size());
    }

    @Test
    void testGetConferencesByOrganizer_Success() {
        Conference conference1 = new Conference("Conference 1", "",new Date(), new Date(), "Place 1", "Topic 1", 1, 1);
        Conference conference2 = new Conference("Conference 2", "",new Date(), new Date(), "Place 2", "Topic 2", 2, 1);
        repository.addConference(conference1);
        repository.addConference(conference2);
        List<Conference> conferences = repository.getConferencesByOrganizer(1);
        assertEquals(2, conferences.size());
    }

    @Test
    void testGetConferencesByOrganizer_Failure() {
        List<Conference> conferences = repository.getConferencesByOrganizer(-1);
        assertTrue(conferences.isEmpty());
    }

    @Test
    void testGetConferenceById_Success() {
        Conference conference = new Conference("Conference 1", "",new Date(), new Date(), "Place 1", "Topic 1", 1, 1);
        repository.addConference(conference);
        Conference result = repository.getConferenceById(1);
        assertNotNull(result);
        assertEquals("Conference 1", result.getName());
    }

    @Test
    void testGetConferenceById_Failure() {
        Conference result = repository.getConferenceById(-1);
        assertNull(result);
    }
    @Test
    void testUpdateConferenceById_Success(){
        Conference conference1 = new Conference("Conference 1", "",new Date(), new Date(), "Place 1", "Topic 1", 1, 1);
        assertTrue(repository.addConference(conference1));
        Conference conference2 = new Conference("Conference 2", "",new Date(), new Date(), "Place 2", "Topic 2", 1, 1);
        assertNotNull(repository.updateConference(conference1.getIdConference(), conference2));
        Conference updatedConference = repository.getConferenceById(conference2.getIdConference());
        assertTrue(
                updatedConference.getName().equals(conference2.getName()) &&
                        updatedConference.getTopic().equals(conference2.getTopic()) &&
                        updatedConference.getStartDate().equals(conference2.getStartDate()) &&
                        updatedConference.getFinishDate().equals(conference2.getFinishDate()) &&
                        updatedConference.getPlace().equals(conference2.getPlace())
        );
    }
    @Test
    void testUpdatedConferenceById_Failure(){
        Conference conference1 = new Conference("Conference 1", "",new Date(), new Date(), "Place 1", "Topic 1", 1, 1);
        assertTrue(repository.addConference(conference1));
        assertNull(repository.updateConference(conference1.getIdConference(), null));
        assertNull(repository.updateConference(-1, conference1));
        assertNull(repository.updateConference(conference1.getIdConference(), new Conference("","",new Date(), new Date(), "", "", 1, 1)));
    }
}