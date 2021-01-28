package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get all responsable service exception.
 */
public class GetAllResponsableServiceException extends ServiceException {
    /**
     * Instantiates a new Get all responsable service exception.
     */
    public GetAllResponsableServiceException() {
        super("Une erreur à empêcher l'accès à la liste des étudiants des étudiant");
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des étudiants des étudiant");
    }
}
