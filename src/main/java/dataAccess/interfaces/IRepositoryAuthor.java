package dataAccess.interfaces;

import models.Author;

public interface IRepositoryAuthor {
    boolean addAuthor(Author author);
    Author getAuthorByID(int idAuthor);
}
