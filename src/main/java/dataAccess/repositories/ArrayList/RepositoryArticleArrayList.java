package dataAccess.repositories.ArrayList;

import dataAccess.interfaces.IRepositoryArticle;
import models.Article;

import java.util.ArrayList;
import java.util.List;

public class RepositoryArticleArrayList implements IRepositoryArticle {

    private final ArrayList<Article> articles;

    public RepositoryArticleArrayList(){
        this.articles = new ArrayList<>();
    }

    /**
     * @param article aticle to add in a arrayList
     * @return True if add its succesfully
     */
    @Override
    public boolean addArticle(Article article) {
        article.setName(article.getName().strip());
        for (Article a : this.articles)
            if( a.getIdAutor() == article.getIdAutor() &&
                a.getIdConferencia() == article.getIdConferencia())
                return false;
        if(article.getName().compareTo("")==0)
            return false;
        if(article.getIdConferencia() <=0 || article.getIdAutor()<=0)
            return false;
        return this.articles.add(article);
    }
    /**
     * @param idConference idConference to search in articles
     * @return The list of article with idConference
     */
    @Override
    public List<Article> getArticlesByConference(int idConference) {

        ArrayList<Article> foundArticles = new ArrayList<>();

        if(idConference<=0)
            return foundArticles;

        for (Article article : this.articles)
            if(article.getIdConferencia() == idConference)
                foundArticles.add(article.copy());

        return foundArticles;
    }

    /**
     * @param idAuthor author id to get
     * @return author with idAuthor
     */
    @Override
    public List<Article> getArticleByAuthor(int idAuthor) {
        ArrayList<Article> foundArticles = new ArrayList<>();

        if(idAuthor<=0)
            return foundArticles;

        for (Article article : this.articles)
            if(article.getIdAutor() == idAuthor)
                foundArticles.add(article.copy());

        return foundArticles;
    }
}
