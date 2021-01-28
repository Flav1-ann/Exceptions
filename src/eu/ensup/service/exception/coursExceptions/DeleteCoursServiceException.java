package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class DeleteCoursServiceException extends ServiceException {
    public DeleteCoursServiceException() {
        super(BaseService.messageExceptionCoursDelete);
        BaseService.logger.info(BaseService.messageExceptionCoursDelete);
    }
}
