package eu.ensup.service.exception.responsableExceptions;

public class GetResponsableServiceException extends Exception {
    public GetResponsableServiceException() {
        super("Le responsable ne peut pas être récuperer");
    }
}
