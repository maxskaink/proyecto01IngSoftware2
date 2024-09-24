package Services.services;


import Services.ServiceStorageOrganizer;
import dataAccess.repositories.ArrayList.RepositoryOrganizerArrayList;
import models.Organizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServicesStorageOrganizerTest {
    private ServiceStorageOrganizer servicesOrganizer;

    @BeforeEach
    void setUp() {
        servicesOrganizer = new ServiceStorageOrganizer( new RepositoryOrganizerArrayList());
    }

    @Test
    void testAddOrganizer() {
        Organizer organizer = new Organizer("John Doe", 1);
        assertTrue(servicesOrganizer.addOrganizer(organizer), "The services add correct a organizer");    ;
    }
    @Test
    void testAddOrganizerFailId() {
        Organizer organizer = new Organizer("John Doe", -1);
        assertTrue(!servicesOrganizer.addOrganizer(organizer), "The services add correct a organizer");    ;
    }
    @Test
    void testAddOrganizerFailName(){
        Organizer organizer = new Organizer("", 1);
        assertTrue(!servicesOrganizer.addOrganizer(organizer), "The services dont add  a organizer");    ;
    }
    @Test
    void testAddOrganizerFailDuplicate(){
        Organizer organizer = new Organizer("John Doe", 1);
        servicesOrganizer.addOrganizer(organizer);
        Organizer organizer2 = new Organizer("John Doe", 1);
        assertTrue(!servicesOrganizer.addOrganizer(organizer2), "The services dont add  a organizer Because is duplicate");
    }

    @Test
    void testGetOrganizer() {
        Organizer organizer = new Organizer("John Doe", 1);
        servicesOrganizer.addOrganizer(organizer);
        assertTrue( servicesOrganizer.getOrganizer(1) != null, "The services get the organizer");
    }
    @Test
    void testGetOrganizerNotFound() {
        assertTrue( servicesOrganizer.getOrganizer(-1) == null, "The services dont get the organizer");
    }
}
