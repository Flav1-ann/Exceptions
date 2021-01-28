package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddResponsableServiceException extends ServiceException {
    public AddResponsableServiceException() {
        super(BaseService.messageExceptionResponsableAdd);
        BaseService.logger.info(BaseService.messageExceptionResponsableAdd);
    }
}
