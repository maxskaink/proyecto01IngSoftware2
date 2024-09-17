package dataAccess.interfaces;

import models.Author;

public interface IRepositoryAuthor {
    public boolean addAuthor(Author author);
    public Author getAuthorByID(int id);
}
