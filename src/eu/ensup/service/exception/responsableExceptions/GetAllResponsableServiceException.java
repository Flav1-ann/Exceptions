package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllResponsableServiceException extends ServiceException {
    public GetAllResponsableServiceException() {
        super(BaseService.messageExceptionResponsableGetAll);
        BaseService.logger.info(BaseService.messageExceptionResponsableGetAll);
    }
}
