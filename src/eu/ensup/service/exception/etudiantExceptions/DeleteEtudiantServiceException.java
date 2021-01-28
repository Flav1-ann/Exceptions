package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.exception.ServiceException;

public class DeleteEtudiantServiceException extends ServiceException {
    public DeleteEtudiantServiceException() {
        super("L'étudiant ne peut être supprimer");
    }
}
