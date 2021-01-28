package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetDirecteurServiceException extends ServiceException {
    public GetDirecteurServiceException() {
        super(BaseService.messageExceptionDirecteurGet);
        BaseService.logger.info(BaseService.messageExceptionDirecteurGet);
    }
}
