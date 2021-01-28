package eu.ensup.service.exception.directeurExceptions;


import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class UpdateDirecteurServiceException extends ServiceException {
    public UpdateDirecteurServiceException() {
        super(BaseService.messageExceptionDirecteurUpdate);
        BaseService.logger.info(BaseService.messageExceptionDirecteurUpdate);
    }
}
