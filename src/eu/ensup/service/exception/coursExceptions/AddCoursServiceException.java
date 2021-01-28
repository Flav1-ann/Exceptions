package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Add cours service exception.
 */
public class AddCoursServiceException extends ServiceException {
    /**
     * Instantiates a new Add cours service exception.
     */
    public AddCoursServiceException() {
        super(BaseService.messageExceptionCoursAdd);
        BaseService.logger.info(BaseService.messageExceptionCoursAdd);
    }
}
