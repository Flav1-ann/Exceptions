package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Delete enseignant service exception.
 */
public class DeleteEnseignantServiceException extends ServiceException {
    /**
     * Instantiates a new Delete enseignant service exception.
     */
    public DeleteEnseignantServiceException() {
        super(BaseService.messageExceptionEnseignantDelete);
        BaseService.logger.info(BaseService.messageExceptionEnseignantDelete);
    }
}
