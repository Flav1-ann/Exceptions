package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Add responsable service exception.
 */
public class AddResponsableServiceException extends ServiceException {
    /**
     * Instantiates a new Add responsable service exception.
     */
    public AddResponsableServiceException() {
        super(BaseService.messageExceptionResponsableAdd);
        BaseService.logger.info(BaseService.messageExceptionResponsableAdd);
    }
}
