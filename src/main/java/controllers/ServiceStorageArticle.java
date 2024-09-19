package controllers;

import dataAccess.interfaces.IRepositoryArticle;
import dataAccess.interfaces.IRepositoryConference;
import models.Article;
import models.Conference;
import  PObserver.Subject;
import java.util.List;



public class ServiceStorageArticle extends  Subject {
    private IRepositoryArticle refRepository;
    private ServiceStorageConferences objServicesConference;

    public ServiceStorageArticle(IRepositoryArticle repository) {
        this.refRepository = repository;
    }

    /**
     *
     * @param objArticle Artiucle to add
     * @return a boolean, if the conference is active add the articule
     */

    public boolean addArticle(Article objArticle) {
        //Valida que la conferencia exista
        Conference objConference = objServicesConference.getConferenceById(objArticle.getIdConferencia());
        if(objConference == null && !objConference.isOpen()  )
            return false;
        this.notifyObservers();
        return this.refRepository.addArticle(objArticle);
     }
     public List<Article> listArticulesByConferences(int idConferences){
        List<Conference> listConferences = this.objServicesConference.listConferences();
        for (Conference conference : listConferences) {
            if(conference.getIdConference() == idConferences){
                return this.refRepository.getArticlesByConference(idConferences);
            }
        }
        return null;
     }
     public List<Article> listArticulesByAuthor(int idAuthor    ){

        return this.refRepository.getArticleByAuthor(idAuthor);
     }


}
