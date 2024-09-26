package Services.services;

import Services.ServiceStorageArticle;
import Services.ServiceStorageAuthor;
import Services.ServiceStorageConferences;
import Services.ServiceStorageOrganizer;
import dataAccess.repositories.ArrayList.RepositoryArticleArrayList;
import dataAccess.repositories.ArrayList.RepositoryAuthorArrayList;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;
import dataAccess.repositories.ArrayList.RepositoryOrganizerArrayList;
import models.Conference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ServiceStorageConferencesTest {
    private ServiceStorageConferences serviceStorageConferences;
    private ServiceStorageAuthor servicesStorageAuthor;
    private ServiceStorageOrganizer serviceStorageOrganizer;
    private ServiceStorageArticle serviceStorageArticle;

    @BeforeEach
    void setUp() {
        serviceStorageArticle = new ServiceStorageArticle(new RepositoryArticleArrayList(), new ServiceStorageConferences(new RepositoryConferenceArrayList()));
        serviceStorageConferences = new ServiceStorageConferences(new RepositoryConferenceArrayList());
        serviceStorageOrganizer = new ServiceStorageOrganizer(new RepositoryOrganizerArrayList());
        servicesStorageAuthor = new ServiceStorageAuthor(new RepositoryAuthorArrayList());
    }

    @Test
    void createConference() {
        Conference con1 = new Conference("Derechoshumanos","Seinputan derecehos", new Date("26/09/2024") , new Date("26/12/2024"), "Cauca", "asd", 1,2 );
        Conference con2 = new Conference("Derechoshumanos","Seinputan derecehos", new Date("26/09/2024") , new Date("26/12/2024"), "Cauca", "asd", 2,2 );
        //mismo id anterior
        assertTrue(serviceStorageConferences.addConference(con1));
        serviceStorageConferences.deleteConferenceById(1);
        assertTrue(serviceStorageConferences.addConference(con1));
        assertTrue(serviceStorageConferences.addConference(con2));
        Conference prueba = serviceStorageConferences.getConferenceById(1);
        System.out.println(prueba.getName());
        System.out.println(serviceStorageConferences.listConferences());

    }
}