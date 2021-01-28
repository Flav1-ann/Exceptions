package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.exception.ServiceException;

public class GetAllEtudiantServiceException extends ServiceException {
    public GetAllEtudiantServiceException() {
        super("Les étudiants ne peuvent pas être récuperer");
    }
}
