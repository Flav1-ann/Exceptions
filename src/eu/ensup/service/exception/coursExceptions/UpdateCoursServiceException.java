package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class UpdateCoursServiceException extends ServiceException {
    public UpdateCoursServiceException() {
        super(BaseService.messageExceptionCoursUpdate);
        BaseService.logger.info(BaseService.messageExceptionCoursUpdate);
    }
}
