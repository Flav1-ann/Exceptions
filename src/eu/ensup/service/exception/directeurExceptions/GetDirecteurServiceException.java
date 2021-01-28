package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get directeur service exception.
 */
public class GetDirecteurServiceException extends ServiceException {
    /**
     * Instantiates a new Get directeur service exception.
     */
    public GetDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès aux informations du directeur");
    }
}
