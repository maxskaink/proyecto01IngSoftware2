package Services.services;

import Services.ServiceStorageArticle;
import Services.ServiceStorageConferences;
import dataAccess.interfaces.IRepositoryArticle;
import dataAccess.repositories.ArrayList.RepositoryArticleArrayList;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicesStorageArticleTest {
    private ServiceStorageArticle serviceStorageArticle;
    @BeforeEach
    public void setUp() {
        serviceStorageArticle = new ServiceStorageArticle(new RepositoryArticleArrayList(), new ServiceStorageConferences(new RepositoryConferenceArrayList()));
    }

    @Test
    public void testAddArticle() {}
}
