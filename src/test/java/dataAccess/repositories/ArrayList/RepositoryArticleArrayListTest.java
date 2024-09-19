package dataAccess.repositories.ArrayList;

import models.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryArticleArrayListTest {

    private RepositoryArticleArrayList repository;

    @BeforeEach
    void setUp() {
        repository = new RepositoryArticleArrayList();
    }
    @Test
    void testAddArticle_Success() {
        Article article = new Article("Article 1", 1, 1);
        boolean result = repository.addArticle(article);
        assertTrue(result);
    }

    @Test
    void testAddArticle_Failure_DuplicateAuthor() {
        Article article1 = new Article("Article 1", 1, 1);
        Article article2 = new Article("Article 2", 1, 1);
        repository.addArticle(article1);
        boolean result = repository.addArticle(article2);
        assertFalse(result);
    }

    @Test
    void testAddArticle_Failure_EmptyName() {
        Article article = new Article("", 1, 1);
        boolean result = repository.addArticle(article);
        assertFalse(result);
    }

    @Test
    void testAddArticle_Failure_InvalidId() {
        Article article = new Article("Article 1", -1, 1);
        boolean result = repository.addArticle(article);
        assertFalse(result);
    }

    @Test
    void testGetArticlesByConference_Success() {
        Article article1 = new Article("Article 1", 1, 1);
        Article article2 = new Article("Article 2", 2, 1);
        repository.addArticle(article1);
        repository.addArticle(article2);
        List<Article> articles = repository.getArticlesByConference(1);
        assertEquals(2, articles.size());
    }

    @Test
    void testGetArticlesByConference_Failure() {
        List<Article> articles = repository.getArticlesByConference(-1);
        assertTrue(articles.isEmpty());
    }

    @Test
    void testGetArticleByAuthor_Success() {
        Article article1 = new Article("Article 1", 1, 1);
        Article article2 = new Article("Article 2", 1, 2);
        repository.addArticle(article1);
        repository.addArticle(article2);
        List<Article> articles = repository.getArticleByAuthor(1);
        assertEquals(2, articles.size());
    }

    @Test
    void testGetArticleByAuthor_Failure() {
        List<Article> articles = repository.getArticleByAuthor(-1);
        assertTrue(articles.isEmpty());
    }
}