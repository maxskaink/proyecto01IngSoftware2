package Services;

import dataAccess.interfaces.IRepositoryArticle;
import models.Article;
import models.Conference;
import  PObserver.Subject;
import java.util.List;



public class ServiceStorageArticle extends  Subject {
    private final IRepositoryArticle refRepository;
    private final ServiceStorageConferences objServicesConference;

    public ServiceStorageArticle(IRepositoryArticle repository, ServiceStorageConferences serviceStorageConferences) {
        this.refRepository = repository;
        this.objServicesConference = serviceStorageConferences;
    }
    /**
     *
     * @param objArticle Article to add
     * @return a boolean, if the conference is active add the article
     */

    public boolean addArticle(Article objArticle) {
        //Valida que la conference exist
        if(objArticle == null)
            return false;
        Conference objConference = objServicesConference.getConferenceById(objArticle.getIdConference());
        if(objConference == null )
            return false;
        if(objConference.isOpen() == false )
            return false;
        this.notifyObservers();
        return this.refRepository.addArticle(objArticle);
     }
     public List<Article> listArticlesByConferences(int idConferences){
        List<Conference> listConferences = this.objServicesConference.listConferences();
        for (Conference conference : listConferences) {
            if(conference.getIdConference() == idConferences){
                return this.refRepository.getArticlesByConference(idConferences);
            }
        }
        return null;
     }
     public List<Article> listArticlesByAuthor(int idAuthor    ){

        return this.refRepository.getArticleByAuthor(idAuthor);
     }


}
