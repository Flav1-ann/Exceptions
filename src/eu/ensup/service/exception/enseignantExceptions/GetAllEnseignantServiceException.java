package eu.ensup.service.exception.enseignantExceptions;


import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get all enseignant service exception.
 */
public class GetAllEnseignantServiceException extends ServiceException {
    /**
     * Instantiates a new Get all enseignant service exception.
     */
    public GetAllEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès liste des enseignants");
    }
}
