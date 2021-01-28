package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Update responsable service exception.
 */
public class UpdateResponsableServiceException extends ServiceException {
    /**
     * Instantiates a new Update responsable service exception.
     */
    public UpdateResponsableServiceException() {
        super("Une erreur à empêcher la modifications des étudiants des étudiant");
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des étudiants des étudiant");
    }
}
