package controllers;

import PObserver.Subject;
import dataAccess.interfaces.IRepositoryAuthor;
import models.Author;

public class ServiceStorageAuthor extends Subject {
    private IRepositoryAuthor repositoryAuthor;
    public ServiceStorageAuthor(IRepositoryAuthor repsository) {
        this.repositoryAuthor = repsository;
    }
    boolean addAuthor(Author author) {
        this.notifyObservers();
        return repositoryAuthor.addAuthor(author);
    }
    Author getAuthor(int id) {
        return this.repositoryAuthor.getAuthorByID(id);
    }
}
