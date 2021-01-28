package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetCoursServiceException extends ServiceException {
    public GetCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès au cours");
    }
}
