package dataAccess.interfaces;

import models.Article;

import java.util.List;

public interface IRepositoryArticle {
    boolean addArticle(Article article);
    List<Article> getArticlesByConference(int idConference);
    List<Article> getArticleByAuthor(int idAuthor);
}
