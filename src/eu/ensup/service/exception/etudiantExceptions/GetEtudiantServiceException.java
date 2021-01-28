package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.exception.ServiceException;

public class GetEtudiantServiceException extends ServiceException {
    public GetEtudiantServiceException() {
        super("L'étudiant ne peut pas être récuperer");
    }
}
