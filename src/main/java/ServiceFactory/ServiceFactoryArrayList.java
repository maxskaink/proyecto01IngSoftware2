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

    private ServiceStorageArticle SSArticle;
    private ServiceStorageAuthor SSAuthor;
    private ServiceStorageConferences SSConferences;
    private ServiceStorageOrganizer SSOrganizer;


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
     * @return Instance of ServiceStorageArticle
     */
    @Override
    public ServiceStorageArticle getServiceStorageArticle() {
        return SSArticle;
    }

    /**
     * @return Intance of ServiceStorageAuthor
     */
    @Override
    public ServiceStorageAuthor getServiceStorageAuthor() {
        return SSAuthor;
    }

    /**
     * @return Intance of ServiceStorageConferences
     */
    @Override
    public ServiceStorageConferences getServiceStorageConferences() {
        return SSConferences;
    }

    /**
     * @return Intance of ServiceStorageOrganizer
     */
    @Override
    public ServiceStorageOrganizer getServiceStorageOrganizer() {
        return SSOrganizer;
    }
}
