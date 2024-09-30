/**
 * @file Proyecto01IngSoftware.java
 * @author Miguel Calambas
 * @brief It's the main file
 */
package co.edu.unicauca.proeycto01ingsoftware;

import ServiceFactory.ServiceFactoryArrayList;
import models.Conference;
import models.Article;
import models.Author;
import Services.ServiceStorageConferences;
import Services.ServiceStorageArticle;
import Services.ServiceStorageAuthor;

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
        ServiceStorageArticle serviceArticle= serviceFactory.getServiceStorageArticle();
        ServiceStorageAuthor serviceAuthor=serviceFactory.getServiceStorageAuthor();
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
        boolean added7=serviceArticle.addArticle(new Article ("Artilce 1",1,101,"keywords",startDate));
        boolean added8=serviceArticle.addArticle(new Article ("Artilce 2",2,101,"keywords",startDate));
        boolean added9=serviceAuthor.addAuthor(new Author ("Author 1",1));
        boolean added10=serviceAuthor.addAuthor(new Author ("Author 2",2));
        boolean added11=serviceAuthor.addAuthor(new Author ("Author 3",3));
        
        List<Conference> conferences = service.listConferences();

        // Crear la ventana y hacerla visible
        VConferencesV2 window = new VConferencesV2(service,serviceArticle,3, refreshCallback);
        window.setVisible(true);
        for (Conference c : conferences) {
            System.out.println("Conferencia: " + c.getName() + ", Lugar: " + c.getPlace() + ", Tema: " + c.getTopic());
        }

        // Crear la ventana de VProfileOrganizer y pasar el servicio
        VProfileOrganizer profileOrganizerWindow = new VProfileOrganizer(service, 100);
        profileOrganizerWindow.setVisible(true);


       //Agregamos los observer
       
       service.addObserver(window);
       service.addObserver(profileOrganizerWindow);

    }
}
