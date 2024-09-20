package controllers.services;

import controllers.ServiceStorageAuthor;
import dataAccess.interfaces.IRepositoryAuthor;
import dataAccess.repositories.ArrayList.RepositoryAuthorArrayList;
import models.Author;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ServicesStorageAuthorTest {

    private ServiceStorageAuthor serviceStorageAuthor;
    private IRepositoryAuthor repositoryAuthor;

    @BeforeEach
    void setUp() {
        repositoryAuthor = new RepositoryAuthorArrayList();
        serviceStorageAuthor = new ServiceStorageAuthor(repositoryAuthor);
    }

    @Test
    void testAddCorrectAuthor() {
        // Crear una instancia de Author para realizar las pruebas
        Author author = new Author("John Doe", 1);

        // Agregar el Author al repository
        serviceStorageAuthor.addAuthor(author);

        // Verificar que el Author fue agregado
        Author retrievedAuthor = serviceStorageAuthor.getAuthor(1);
        assert retrievedAuthor != null;
        assert retrievedAuthor.getName().equals("John Doe");


    }
    @Test
    void tesAddIncorrectAuthorId() {
        // Crear una instancia de Author para realizar las pruebas
        Author author = new Author("John Doe", -1);
        // Verificar que el Author fue agregado
        assertTrue( !serviceStorageAuthor.addAuthor(author), "the program dont add the author") ;
    }

    @Test
    void tesAddIncorrectAuthorName() {
        // Crear una instancia de Author para realizar las pruebas
        Author author = new Author("", 1);
        // Verificar que el Author fue agregado
        assertTrue( !serviceStorageAuthor.addAuthor(author), "the program dont add the author") ;
    }
    @Test
    void testAddDuplicateAuthor() {

        Author author = new Author("John Doe", 1);
        // Agregar el Author al repository
        serviceStorageAuthor.addAuthor(author);
        Author author2 = new Author("John Doe", 1);
        // Agregar el Author al repositor
        assertTrue(!serviceStorageAuthor.addAuthor(author2) , "the program dont add the author Because is duplicate") ;
    }



    @Test
    void testGetAuthor() {
        Author author = new Author("John Doe", 1);
        serviceStorageAuthor.addAuthor(author);
        Author retrievedAuthor = serviceStorageAuthor.getAuthor(1);
        assertTrue(retrievedAuthor != null, "the program get the author") ;
    }
    @Test
    void testGetAuthorNotFound() {
        Author retrievedAuthor = serviceStorageAuthor.getAuthor(-1);
        assertTrue(retrievedAuthor == null, "the program dont get the author") ;
    }
}
