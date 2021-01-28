package eu.ensup.service.exception.enseignantExceptions;


import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllEnseignantServiceException extends ServiceException {
    public GetAllEnseignantServiceException() {
        super(BaseService.messageExceptionEnseignantGetAll);
        BaseService.logger.info(BaseService.messageExceptionEnseignantGetAll);
    }
}
