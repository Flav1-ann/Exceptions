package eu.ensup.service.exception.coursExceptions;


import eu.ensup.service.BaseService;


import eu.ensup.service.exception.ServiceException;

/**
 * The type Get all cours service exception.
 */
public class GetAllCoursServiceException extends ServiceException {
    /**
     * Instantiates a new Get all cours service exception.
     */
    public GetAllCoursServiceException() {
        super(BaseService.messageExceptionCoursGetAll);
        BaseService.logger.info(BaseService.messageExceptionCoursGetAll);
    }
}
