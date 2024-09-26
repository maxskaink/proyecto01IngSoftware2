package ServiceFactory;

import Services.ServiceStorageArticle;
import Services.ServiceStorageAuthor;
import Services.ServiceStorageConferences;
import Services.ServiceStorageOrganizer;
import dataAccess.repositories.ArrayList.RepositoryArticleArrayList;
import dataAccess.repositories.ArrayList.RepositoryAuthorArrayList;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;
import dataAccess.repositories.ArrayList.RepositoryOrganizerArrayList;

public class ServiceFactoryArrayList implements  IServiceFactory{

    private final ServiceStorageArticle SSArticle;
    private final ServiceStorageAuthor SSAuthor;
    private final ServiceStorageConferences SSConferences;
    private final ServiceStorageOrganizer SSOrganizer;
    private static ServiceFactoryArrayList instance;

    public ServiceFactoryArrayList(){

        RepositoryArticleArrayList RArticle = new RepositoryArticleArrayList();
        RepositoryAuthorArrayList RAuthor = new RepositoryAuthorArrayList();
        RepositoryConferenceArrayList RConference = new RepositoryConferenceArrayList();
        RepositoryOrganizerArrayList ROrganizer = new RepositoryOrganizerArrayList();

        SSConferences = new ServiceStorageConferences(RConference);
        SSAuthor = new ServiceStorageAuthor(RAuthor);
        SSOrganizer = new ServiceStorageOrganizer(ROrganizer);
        SSArticle = new ServiceStorageArticle(RArticle, SSConferences);
    }

    /**
     * Pattern  singleton for Factory
     * @return
     */
    public static synchronized ServiceFactoryArrayList getInstance() {
        if (instance == null) {
            instance = new ServiceFactoryArrayList();
        }
        return instance;
    }

    /**
     * @return Instance of ServiceStorageArticle
     */
    @Override
    public ServiceStorageArticle getServiceStorageArticle() {
        return SSArticle;
    }

    /**
     * @return Instance of ServiceStorageAuthor
     */
    @Override
    public ServiceStorageAuthor getServiceStorageAuthor() {
        return SSAuthor;
    }

    /**
     * @return Instance of ServiceStorageConferences
     */
    @Override
    public ServiceStorageConferences getServiceStorageConferences() {
        return SSConferences;
    }

    /**
     * @return Instance of ServiceStorageOrganizer
     */
    @Override
    public ServiceStorageOrganizer getServiceStorageOrganizer() {
        return SSOrganizer;
    }
}
