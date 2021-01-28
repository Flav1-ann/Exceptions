package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.exception.ServiceException;

public class AddEtudiantServiceException extends ServiceException {
    public AddEtudiantServiceException() {
        super("L'étudiant ne peut être ajouter");
    }
}
