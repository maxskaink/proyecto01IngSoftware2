package controllers;

import PObserver.Subject;
import dataAccess.interfaces.IRepositoryAuthor;
import models.Author;
import models.Conference;

import java.util.ArrayList;
import java.util.List;

public class ServiceStorageAuthor extends Subject {
    private IRepositoryAuthor repositoryAuthor;

    public ServiceStorageAuthor(IRepositoryAuthor repsository) {
        this.repositoryAuthor = repsository;

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
