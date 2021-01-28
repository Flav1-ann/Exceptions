package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetEnseignantServiceException extends ServiceException {
    public GetEnseignantServiceException() {
        super(BaseService.messageExceptionEnseignantGet);
        BaseService.logger.info(BaseService.messageExceptionEnseignantGet);
    }
}
