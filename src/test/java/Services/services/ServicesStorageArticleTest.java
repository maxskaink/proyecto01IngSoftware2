package Services.services;

import Services.ServiceStorageArticle;
import Services.ServiceStorageConferences;
import dataAccess.interfaces.IRepositoryArticle;
import dataAccess.repositories.ArrayList.RepositoryArticleArrayList;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;
import models.Article;
import models.Conference;
import models.Organizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServicesStorageArticleTest {
    private ServiceStorageArticle serviceStorageArticle;
    @BeforeEach
    public void setUp() {
        serviceStorageArticle = new ServiceStorageArticle(new RepositoryArticleArrayList(), new ServiceStorageConferences(new RepositoryConferenceArrayList()));
    }

    @Test
    public void testAddArticle() {
        Article article  =new Article("Marino", 25, 2,"Madrugada, mañana", new Date());
        assertTrue(serviceStorageArticle.addArticle(article));
    }
    @Test
    public void testErrrorAddArticle() {
        Article article  =new Article("Marino", -25,2,"Madrugada, mañana", new Date());
        assertTrue(serviceStorageArticle.addArticle(article));
    }


}
