package ServiceFactory;

import Services.ServiceStorageArticle;
import Services.ServiceStorageAuthor;
import Services.ServiceStorageConferences;
import Services.ServiceStorageOrganizer;

public interface IServiceFactory {
    ServiceStorageArticle getServiceStorageArticle();
    ServiceStorageAuthor getServiceStorageAuthor();
    ServiceStorageConferences getServiceStorageConferences();
    ServiceStorageOrganizer getServiceStorageOrganizer();
}
