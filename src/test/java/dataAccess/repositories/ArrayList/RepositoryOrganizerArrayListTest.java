package dataAccess.repositories.ArrayList;

import models.Organizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyRepositoryOrganizerArrayListTest {

    private RepositoryOrganizerArrayList myRepository;
    @BeforeEach
    void setUp() {
        myRepository = new RepositoryOrganizerArrayList();
    }

    @Test
    void testAddOrganizer_Success() {
        Organizer organizer = new Organizer("John Doe", 1);
        boolean result = myRepository.addOrganizer(organizer);
        Organizer organizer2 = new Organizer("Miguel", 2);
        boolean result2 = myRepository.addOrganizer(organizer2);
        assertTrue(result&&result2);
    }

    @Test
    void testAddOrganizer_Failure_InvalidId() {
        Organizer organizer = new Organizer("John Doe", -1);
        boolean result = myRepository.addOrganizer(organizer);
        assertFalse(result);
    }

    @Test
    void testAddOrganizer_Failure_EmptyName() {
        Organizer organizer = new Organizer("", 1);
        boolean result = myRepository.addOrganizer(organizer);
        assertFalse(result);
    }
    @Test
    void testAddOrganizer_Failure_Duplicate() {
        Organizer organizer = new Organizer("John Doe", 1);
        Organizer organizer2 = new Organizer("John Doe", 1);
        myRepository.addOrganizer(organizer);
        boolean result = myRepository.addOrganizer(organizer2);
        assertFalse(result);
    }

    @Test
    void testGetOrganizerByID_Success() {
        Organizer organizer = new Organizer("John Doe", 1);
        myRepository.addOrganizer(organizer);
        Organizer result = myRepository.getOrganizerByID(1);
        assertNotNull(result);
        assertEquals("John Doe", result.getName());
    }

    @Test
    void testGetOrganizerByID_Failure() {
        Organizer result = myRepository.getOrganizerByID(-1);
        assertNull(result);
    }
}