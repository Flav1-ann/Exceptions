package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddDirecteurServiceException extends ServiceException {
    public AddDirecteurServiceException() {
        super(BaseService.messageExceptionDirecteurAdd);
        BaseService.logger.info(BaseService.messageExceptionDirecteurAdd);
    }
}
