package eu.ensup.service.exception.directeurExceptions;


import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Update directeur service exception.
 */
public class UpdateDirecteurServiceException extends ServiceException {
    /**
     * Instantiates a new Update directeur service exception.
     */
    public UpdateDirecteurServiceException() {
        super(BaseService.messageExceptionDirecteurUpdate);
        BaseService.logger.info(BaseService.messageExceptionDirecteurUpdate);
    }
}
