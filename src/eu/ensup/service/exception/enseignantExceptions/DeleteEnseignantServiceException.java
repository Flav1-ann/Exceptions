package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class DeleteEnseignantServiceException extends ServiceException {
    public DeleteEnseignantServiceException() {
        super(BaseService.messageExceptionEnseignantDelete);
        BaseService.logger.info(BaseService.messageExceptionEnseignantDelete);
    }
}
