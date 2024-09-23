package Services.services;

import Services.ServiceStorageArticle;
import Services.ServiceStorageAuthor;
import Services.ServiceStorageConferences;
import Services.ServiceStorageOrganizer;
import dataAccess.repositories.ArrayList.RepositoryArticleArrayList;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;

class ServiceStorageConferencesTest {
    private ServiceStorageConferences serviceStorageConferences;
    private ServiceStorageAuthor servicesStorageAuthor;
    private ServiceStorageOrganizer serviceStorageOrganizer;
    private ServiceStorageArticle serviceStorageArticle;


    void setUp() {
        serviceStorageArticle = new ServiceStorageArticle(new RepositoryArticleArrayList(), new ServiceStorageConferences(new RepositoryConferenceArrayList()));
    }
}