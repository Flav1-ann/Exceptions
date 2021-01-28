package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

public class UpdateCoursServiceException extends Exception {
    public UpdateCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la modification du cours");
    }
}
