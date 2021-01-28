package eu.ensup.service.exception.responsableExceptions;


import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Credential exception.
 */
public class CredentialException extends ServiceException {

    /**
     * Instantiates a new Credential exception.
     */
    public CredentialException() {
        super("Le mot de passe ou l'adresse mail..ne sont pas correcte... veuillez réessayer !");
        BaseService.logger.info("Le mot de passe ou l'adresse mail..ne sont pas correcte... veuillez réessayer !");
    }
}
