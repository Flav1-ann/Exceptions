package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Update cours service exception.
 */
public class UpdateCoursServiceException extends ServiceException {
    /**
     * Instantiates a new Update cours service exception.
     */
    public UpdateCoursServiceException() {
        super(BaseService.messageExceptionCoursUpdate);
        BaseService.logger.info(BaseService.messageExceptionCoursUpdate);
    }
}
