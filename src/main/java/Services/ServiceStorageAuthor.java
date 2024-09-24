package Services;

import PObserver.Subject;
import dataAccess.interfaces.IRepositoryAuthor;
import models.Author;

public class ServiceStorageAuthor extends Subject {
    private final IRepositoryAuthor repositoryAuthor;

    public ServiceStorageAuthor(IRepositoryAuthor repository) {
        this.repositoryAuthor = repository;

    }
    public boolean addAuthor(Author author) {
        this.notifyObservers();
        if(getAuthor(author.getId()) != null){
            return false;
        }
        return repositoryAuthor.addAuthor(author);
    }
    public Author getAuthor(int id) {
        return this.repositoryAuthor.getAuthorByID(id);
    }

}
