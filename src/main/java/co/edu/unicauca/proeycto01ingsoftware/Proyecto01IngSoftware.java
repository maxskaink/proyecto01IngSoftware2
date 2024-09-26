/**
 * @file Proyecto01IngSoftware.java
 * @author Miguel Calambas
 * @brief It's the main file
 */
package co.edu.unicauca.proeycto01ingsoftware;

import ServiceFactory.ServiceFactoryArrayList;
import models.Conference;
import Services.ServiceStorageConferences;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import views.VConferenceInfo;
import views.VConferencesV2;
import views.VProfileOrganizer;

public class Proyecto01IngSoftware {

    public static void main(String[] args) throws IOException {
        // Crear un repositorio y un servicio para manejar las conferencias
        new ServiceFactoryArrayList();
        ServiceFactoryArrayList serviceFactory = ServiceFactoryArrayList.getInstance();
        ServiceStorageConferences service = serviceFactory.getServiceStorageConferences();

        Runnable refreshCallback = null;


        // Agregar conferencias de ejemplo (esto solo para pruebas)
        Calendar calendar = Calendar.getInstance();
        Date startDate = calendar.getTime(); // Fecha actual

        calendar.add(Calendar.DAY_OF_MONTH, 1); // Sumar un día
        Date finishDate = calendar.getTime(); // Fecha un día después

        boolean added1 = service.addConference(new Conference("Conferencia 1","food", startDate , finishDate, "Lugar 1", "Tema 1", 1, 100));
        boolean added2 = service.addConference(new Conference("Conferencia 2", "food" , startDate, finishDate, "Lugar 2", "Tema 2", 2, 101));
        boolean added3 = service.addConference(new Conference("Conferencia 3","food", startDate , finishDate, "Lugar 3", "Tema 3", 3, 102));
        boolean added4 = service.addConference(new Conference("Conferencia 4","food", startDate, finishDate, "Lugar 4", "Tema 4", 4, 103));
        boolean added5 = service.addConference(new Conference("Conferencia 5","food", startDate , finishDate, "Lugar 5", "Tema 5", 5, 104));
        boolean added6 = service.addConference(new Conference("Conferencia 6", "food",startDate,  finishDate, "Lugar 6", "Tema 6", 6, 105));

        List<Conference> conferences = service.listConferences();

        // Crear la ventana y hacerla visible
        VConferencesV2 window = new VConferencesV2(service, refreshCallback);
        window.setVisible(true);
        for (Conference c : conferences) {
            System.out.println("Conferencia: " + c.getName() + ", Lugar: " + c.getPlace() + ", Tema: " + c.getTopic());
        }

        // Crear la ventana de VProfileOrganizer y pasar el servicio
        VProfileOrganizer profileOrganizerWindow = new VProfileOrganizer(service, 100);
        profileOrganizerWindow.setVisible(true);

        //Crear la ventana VConferenceInfo ,pasar el servidor y hacerla visible
       VConferenceInfo infoConference =new VConferenceInfo(service,1);
       infoConference.setVisible(true);

       //Agregamos los observer
       
       service.addObserver(window);
       service.addObserver(profileOrganizerWindow);

    }
}
