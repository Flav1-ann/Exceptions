package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllDirecteurServiceException extends ServiceException {
    public GetAllDirecteurServiceException() {
        super(BaseService.messageExceptionDirecteurGetAll);
        BaseService.logger.info(BaseService.messageExceptionDirecteurGetAll);
    }
}
