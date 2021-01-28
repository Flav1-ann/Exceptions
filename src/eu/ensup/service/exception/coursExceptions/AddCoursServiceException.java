package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddCoursServiceException extends ServiceException {
    public AddCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout du cours");
    }
}
