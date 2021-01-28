package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Delete directeur service exception.
 */
public class DeleteDirecteurServiceException extends ServiceException {
    /**
     * Instantiates a new Delete directeur service exception.
     */
    public DeleteDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la supression du directeur");
    }
}
