package Services;

import PObserver.Subject;
import dataAccess.interfaces.IRepositoryOrganizer;
import models.Organizer;

public class ServiceStorageOrganizer extends Subject {
    private IRepositoryOrganizer repositoryOrganizer;
    public ServiceStorageOrganizer(IRepositoryOrganizer repositoryOrganizer) {
        this.repositoryOrganizer = repositoryOrganizer;
    }
    public boolean addOrganizer(Organizer organizer) {
        return repositoryOrganizer.addOrganizer(organizer);
    }
    public Organizer getOrganizer(int id) {
        return  repositoryOrganizer.getOrganizerByID(id);
    }

}
