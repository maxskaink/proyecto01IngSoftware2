/**
 * @file Proyecto01IngSoftware.java
 * @author Miguel Calambas
 * @brief It's the main file
 */

package co.edu.unicauca.proeycto01ingsoftware;

import controllers.ServiceStorageConferences;
import dataAccess.repositories.RepositoryConferenceArrayList;
import java.util.Date;
import java.util.List;
import models.Conference;

public class Proyecto01IngSoftware {

    public static void main(String[] args) {
        
        ServiceStorageConferences storageConferences = 
                new ServiceStorageConferences( new RepositoryConferenceArrayList() );
        
        storageConferences.addConference(new Conference("prueba", new Date(), new Date(), 100));
        
        List<Conference> conferences = storageConferences.listConferences();
        
        for( Conference conf: conferences){
            System.out.println("Conferencia: "+ conf.getNombre());
        }
        
    }
}
