package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class UpdateCoursServiceException extends ServiceException {
    public UpdateCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la modification du cours");
    }
}
