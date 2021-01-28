package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Add responsable service exception.
 */
public class AddResponsableServiceException extends ServiceException {
    /**
     * Instantiates a new Add responsable service exception.
     */
    public AddResponsableServiceException() {
        super("Une erreur à empêcher l'ajout de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher l'ajout de l'étudiant");
    }
}
