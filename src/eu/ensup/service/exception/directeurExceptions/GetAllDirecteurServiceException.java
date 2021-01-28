package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get all directeur service exception.
 */
public class GetAllDirecteurServiceException extends ServiceException {
    /**
     * Instantiates a new Get all directeur service exception.
     */
    public GetAllDirecteurServiceException() {
        super(BaseService.messageExceptionDirecteurGetAll);
        BaseService.logger.info(BaseService.messageExceptionDirecteurGetAll);
    }
}
