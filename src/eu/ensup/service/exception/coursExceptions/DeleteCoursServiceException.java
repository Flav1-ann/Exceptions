package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Delete cours service exception.
 */
public class DeleteCoursServiceException extends ServiceException {
    /**
     * Instantiates a new Delete cours service exception.
     */
    public DeleteCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la suppression du cours");
    }
}
