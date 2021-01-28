package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class UpdateResponsableServiceException extends ServiceException {
    public UpdateResponsableServiceException() {
        super(BaseService.messageExceptionResponsableUpdate);
        BaseService.logger.info(BaseService.messageExceptionResponsableUpdate);
    }
}
