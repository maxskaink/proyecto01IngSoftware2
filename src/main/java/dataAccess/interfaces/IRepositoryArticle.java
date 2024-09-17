package dataAccess.interfaces;

import models.Article;

import java.util.List;

public interface IRepositoryArticle {
    public boolean addArticulo(Article article);
    public Article getArticuloByID(int id);
    public List<Article> getArticlesByConference(int idConference);
    public List<Article> getArticleByAuthor(int idAuthor);
}
