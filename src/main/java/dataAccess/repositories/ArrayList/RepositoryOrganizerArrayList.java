package dataAccess.repositories.ArrayList;

import dataAccess.interfaces.IRepositoryOrganizer;
import models.Organizer;

import java.util.ArrayList;

public class RepositoryOrganizerArrayList implements IRepositoryOrganizer {

    private final ArrayList<Organizer> organizers;
    public RepositoryOrganizerArrayList() {
        organizers = new ArrayList<>();
    }
    /**
     * @param organizer to add in the repository
     * @return true if add its succesfully
     */
    @Override
    public boolean addOrganizer(Organizer organizer) {

        organizer.setNanme(organizer.getName().strip());
        if(organizer.getId() <=0)
            return false;
        if(organizer.getName().compareTo("") ==0)
            return false;
        for(Organizer o : organizers)
            if(o.getId() == organizer.getId())
                return false;
        return this.organizers.add(organizer);
    }

    /**
     * @param idOrganizer Organizer id to search
     * @return Organizer with idOrganizador
     */
    @Override
    public Organizer getOrganizerByID(int idOrganizer) {
        if(idOrganizer <= 0)
            return null;
        for (Organizer organizer : organizers)
            if(organizer.getId() == idOrganizer)
                return organizer.copy();

        return null;
    }
}
