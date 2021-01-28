package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Inscription cours service exception.
 */
public class InscriptionCoursServiceException extends ServiceException {
    /**
     * Instantiates a new Inscription cours service exception.
     */
    public InscriptionCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'inscript de l'étudiant au cours");
    }
}
