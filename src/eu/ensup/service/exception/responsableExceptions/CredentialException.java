package eu.ensup.service.exception.responsableExceptions;


import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class CredentialException extends ServiceException {

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     */
    public CredentialException() {
        super("Le mot de passe ou l'adresse mail..ne sont pas correcte... veuillez réessayer !");
        BaseService.logger.info("Le mot de passe ou l'adresse mail..ne sont pas correcte... veuillez réessayer !");
    }
}
