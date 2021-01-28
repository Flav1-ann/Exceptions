package eu.ensup.service.exception.coursExceptions;


import eu.ensup.service.BaseService;


import eu.ensup.service.exception.ServiceException;

public class GetAllCoursServiceException extends ServiceException {
    public GetAllCoursServiceException() {
        super(BaseService.messageExceptionCoursGetAll);
        BaseService.logger.info(BaseService.messageExceptionCoursGetAll);
    }
}
