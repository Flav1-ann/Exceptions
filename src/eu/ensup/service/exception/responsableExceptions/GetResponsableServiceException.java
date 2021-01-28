package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetResponsableServiceException extends ServiceException {
    public GetResponsableServiceException() {
        super(BaseService.messageExceptionResponsableGet);
        BaseService.logger.info(BaseService.messageExceptionResponsableGet);
    }
}
