/**
 * @file Proyecto01IngSoftware.java
 * @author Miguel Calambas
 * @brief It's the main file
 */

package co.edu.unicauca.proeycto01ingsoftware;

import models.Conference;
import models.Author;
import controllers.ServiceStorageConferences;
import dataAccess.repositories.RepositoryAutorConferenceArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;



public class Proyecto01IngSoftware {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        ServiceStorageConferences storageConferences = 
                new ServiceStorageConferences( new RepositoryAutorConferenceArrayList() );
        Conference objConference = new Conference("prueba", new Date(), new Date(), "Popayan", "Gurmet", 1);
        storageConferences.addConference(objConference);
        
        List<Conference> conferences = storageConferences.listConferences();
        
        Author user = new Author("Juan", 10616547 );
        
        
        
        for( Conference conf: conferences){
            System.out.println("Conferencia: "+ conf.getName());
        }
        
    }
}
