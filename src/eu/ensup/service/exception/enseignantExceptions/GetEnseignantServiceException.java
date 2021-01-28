package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get enseignant service exception.
 */
public class GetEnseignantServiceException extends ServiceException {
    /**
     * Instantiates a new Get enseignant service exception.
     */
    public GetEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès aux information de l'enseignant");
    }
}
