package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

public class GetAllCoursServiceException extends Exception {
    public GetAllCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la suppression du cours");
    }
}
