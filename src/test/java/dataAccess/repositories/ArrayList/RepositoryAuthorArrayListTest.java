package dataAccess.repositories.ArrayList;

import models.Author;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryAuthorArrayListTest {

    private RepositoryAuthorArrayList repository;

    @BeforeEach
    void setUp() {
        repository = new RepositoryAuthorArrayList();
    }

    @Test
    void testAddAuthor_Success() {
        Author author = new Author("John Doe", 1);
        boolean result = repository.addAuthor(author);
        assertTrue(result);
    }

    @Test
    void testAddAuthor_Failure_DuplicateId() {
        Author author1 = new Author("John Doe", 1);
        Author author2 = new Author("Jane Doe", 1);
        repository.addAuthor(author1);
        boolean result = repository.addAuthor(author2);
        assertFalse(result);
    }

    @Test
    void testAddAuthor_Failure_EmptyName() {
        Author author = new Author("", 1);
        boolean result = repository.addAuthor(author);
        assertFalse(result);
    }

    @Test
    void testAddAuthor_Failure_InvalidId() {
        Author author = new Author("John Doe", -1);
        boolean result = repository.addAuthor(author);
        assertFalse(result);
    }

    @Test
    void testGetAuthorByID_Success() {
        Author author = new Author("John Doe", 1);
        repository.addAuthor(author);
        Author result = repository.getAuthorByID(1);
        assertNotNull(result);
        assertEquals("John Doe", result.getName());
    }

    @Test
    void testGetAuthorByID_Failure() {
        Author result = repository.getAuthorByID(-1);
        assertNull(result);
    }

}