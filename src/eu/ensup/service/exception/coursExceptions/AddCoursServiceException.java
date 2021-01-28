package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

public class AddCoursServiceException extends Exception {
    public AddCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout du cours");
    }
}
