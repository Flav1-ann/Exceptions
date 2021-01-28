package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Add cours service exception.
 */
public class AddCoursServiceException extends ServiceException {
    /**
     * Instantiates a new Add cours service exception.
     */
    public AddCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout du cours");
    }
}
