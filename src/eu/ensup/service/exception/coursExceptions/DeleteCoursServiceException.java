package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

public class DeleteCoursServiceException extends Exception {
    public DeleteCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la suppression du cours");
    }
}
