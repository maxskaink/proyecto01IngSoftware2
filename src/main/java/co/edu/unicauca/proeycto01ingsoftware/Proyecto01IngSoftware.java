/**
 * @file Proyecto01IngSoftware.java
 * @author Miguel Calambas
 * @brief It's the main file
 */

package co.edu.unicauca.proeycto01ingsoftware;

import models.Conference;
import models.Author;
import controllers.ServiceStorageConferences;
import dataAccess.interfaces.IRepositoryConference;
import dataAccess.repositories.ArrayList.RepositoryConferenceArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import views.VConferences;



public class Proyecto01IngSoftware {

    public static void main(String[] args) throws IOException {
        /*
        ServiceStorageConferences storageConferences = 
                new ServiceStorageConferences( new RepositoryConferenceArrayList() );
        Conference objConference = new Conference("prueba", new Date(), new Date(), "Popayan", "Gurmet", 1,1);
        storageConferences.addConference(objConference);
        
        List<Conference> conferences = storageConferences.listConferences();

        
        for( Conference conf: conferences){
            System.out.println("Conferencia: "+ conf.getName());
        }
        */
        
        // Crear un repositorio y un servicio para manejar las conferencias
        RepositoryConferenceArrayList repository = new RepositoryConferenceArrayList();
        ServiceStorageConferences service = new ServiceStorageConferences(repository);

        // Agregar conferencias de ejemplo (esto solo para pruebas)
        
        Calendar calendar = Calendar.getInstance();
        Date startDate = calendar.getTime(); // Fecha actual

        calendar.add(Calendar.DAY_OF_MONTH, 1); // Sumar un día
        Date finishDate = calendar.getTime(); // Fecha un día después

        boolean added1 = service.addConference(new Conference("Conferencia 1", startDate, finishDate, "Lugar 1", "Tema 1", 1, 100));
        boolean added2 = service.addConference(new Conference("Conferencia 2", startDate, finishDate, "Lugar 2", "Tema 2", 2, 101));
        boolean added3 = service.addConference(new Conference("Conferencia 3", startDate, finishDate, "Lugar 3", "Tema 3", 3, 102));
        boolean added4 = service.addConference(new Conference("Conferencia 4", startDate, finishDate, "Lugar 4", "Tema 4", 4, 103));
        boolean added5 = service.addConference(new Conference("Conferencia 5", startDate, finishDate, "Lugar 5", "Tema 5", 5, 104));
        boolean added6 = service.addConference(new Conference("Conferencia 6", startDate, finishDate, "Lugar 6", "Tema 6", 6, 105));

        System.out.println("Conferencia 1 agregada: " + added1);
        System.out.println("Conferencia 2 agregada: " + added2);

        List<Conference> conferences = service.listConferences();

        // Crear la ventana y hacerla visible
        VConferences window = new VConferences(service);
        window.setVisible(true);
        for (Conference c : conferences) {
            System.out.println("Conferencia: " + c.getName() + ", Lugar: " + c.getPlace() + ", Tema: " + c.getTopic());
        }

        
        
    }
}
