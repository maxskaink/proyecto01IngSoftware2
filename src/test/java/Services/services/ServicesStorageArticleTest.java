package Services.services;

import Services.ServiceStorageArticle;
import Services.ServiceStorageConferences;
import dataAccess.repositories.ArrayList.RepositoryArticleArrayList;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;
import models.Article;

import models.Conference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServicesStorageArticleTest {
    private ServiceStorageArticle serviceStorageArticle;
    private ServiceStorageConferences serviceStorageConferences;
    @BeforeEach
    public void setUp() {
        serviceStorageConferences =  new ServiceStorageConferences(new RepositoryConferenceArrayList());
        serviceStorageArticle = new ServiceStorageArticle(new RepositoryArticleArrayList(), serviceStorageConferences);
    }

    @Test
    public void testAddArticle() {
        Conference conference = new Conference("julian", "mañaan", new Date("20/12/2024"), new Date("21/12/2025"),"palxa", "mañana", 2 , 2);
        assertTrue(serviceStorageConferences.addConference(conference));
        Article article  =new Article("Marino", 2, 2,"Madrugada, mañana", new Date());
        assertTrue(serviceStorageArticle.addArticle(article));
    }
    @Test
    public void testErrrorAddArticle() {
        Article article  =new Article("Marino", -25,2,"Madrugada, mañana", new Date());
        assertTrue(!serviceStorageArticle.addArticle(article));
    }
    @Test
    public void testErrorAddArticleName(){
        Article article  =new Article("", 125,2,"Madrugada, mañana", new Date());
        assertTrue(!serviceStorageArticle.addArticle(article));
    }


}
