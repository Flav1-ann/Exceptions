package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Update responsable service exception.
 */
public class UpdateResponsableServiceException extends ServiceException {
    /**
     * Instantiates a new Update responsable service exception.
     */
    public UpdateResponsableServiceException() {
        super(BaseService.messageExceptionResponsableUpdate);
        BaseService.logger.info(BaseService.messageExceptionResponsableUpdate);
    }
}
