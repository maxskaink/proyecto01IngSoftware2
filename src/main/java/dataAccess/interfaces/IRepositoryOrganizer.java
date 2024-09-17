package dataAccess.interfaces;

import models.Organizer;

public interface IRepositoryOrganizer {
    public boolean addOrganizer(Organizer organizer);
    public Organizer getOrganizerByID(int id);
}
