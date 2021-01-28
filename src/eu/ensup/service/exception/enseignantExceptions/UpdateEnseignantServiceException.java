package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class UpdateEnseignantServiceException extends ServiceException {
    public UpdateEnseignantServiceException() {
        super(BaseService.messageExceptionEnseignantUpdate);
        BaseService.logger.info(BaseService.messageExceptionEnseignantUpdate);
    }
}
