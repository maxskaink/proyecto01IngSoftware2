package dataAccess.interfaces;

import models.Organizer;

public interface IRepositoryOrganizer {
    boolean addOrganizer(Organizer organizer);
    Organizer getOrganizerByID(int idOrganizer);
}
