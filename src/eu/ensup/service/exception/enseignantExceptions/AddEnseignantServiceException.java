package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Add enseignant service exception.
 */
public class AddEnseignantServiceException extends ServiceException {
    /**
     * Instantiates a new Add enseignant service exception.
     */
    public AddEnseignantServiceException() {
        super(BaseService.messageExceptionEnseignantAdd);
        BaseService.logger.info(BaseService.messageExceptionEnseignantAdd);
    }
}
