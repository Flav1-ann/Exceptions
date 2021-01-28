package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.exception.ServiceException;

public class GetResponsableServiceException extends ServiceException {
    public GetResponsableServiceException() {
        super("Le responsable ne peut pas être récuperer");
    }
}
