package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

public class GetCoursServiceException extends Exception {
    public GetCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès au cours");
    }
}
