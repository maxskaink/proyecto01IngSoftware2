package dataAccess.repositories.ArrayList;

import dataAccess.interfaces.IRepositoryAuthor;
import models.Author;

import java.util.ArrayList;

public class RepositoryAuthorArrayList implements IRepositoryAuthor {

    private ArrayList<Author> authors;

    public RepositoryAuthorArrayList() {
        this.authors = new ArrayList<>();
    }

    /**
     * @param author author to add in the reposritory
     * @return true if it is successfully
     */
    @Override
    public boolean addAuthor(Author author) {
        author.setNanme( author.getName().strip());
        for(Author a : authors)
            if(a.getId() == author.getId())
                return false;
        if(author.getName().compareTo("") ==0)
            return false;
        if(author.getId() <= 0 )
            return false;

        return authors.add(author);
    }

    /**
     * @param idAuthor id author to get
     * @return Author with idAuthor
     */
    @Override
    public Author getAuthorByID(int idAuthor) {

        if(idAuthor <= 0)
            return null;

        for(Author author : authors)
            if(author.getId() == idAuthor)
                return new Author(
                        author.getName(),
                        author.getId()
                );

        return null;
    }
}
