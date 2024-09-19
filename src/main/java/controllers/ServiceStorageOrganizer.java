package controllers;

import PObserver.Subject;
import dataAccess.interfaces.IRepositoryOrganizer;
import models.Organizer;

public class ServiceStorageOrganizer extends Subject {
    private IRepositoryOrganizer repositoryOrganizer;
    public ServiceStorageOrganizer(IRepositoryOrganizer repositoryOrganizer) {
        this.repositoryOrganizer = repositoryOrganizer;
    }
    boolean addOrganizer(Organizer organizer) {
        return repositoryOrganizer.addOrganizer(organizer);
    }
    Organizer getOrganizer(int id) {
        return  repositoryOrganizer.getOrganizerByID(id);
    }

}
