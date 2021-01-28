package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Add directeur service exception.
 */
public class AddDirecteurServiceException extends ServiceException {
    /**
     * Instantiates a new Add directeur service exception.
     */
    public AddDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout du directeur");
    }
}
