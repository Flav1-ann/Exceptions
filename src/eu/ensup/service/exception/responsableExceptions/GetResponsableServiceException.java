package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get responsable service exception.
 */
public class GetResponsableServiceException extends ServiceException {
    /**
     * Instantiates a new Get responsable service exception.
     */
    public GetResponsableServiceException() {
        super(BaseService.messageExceptionResponsableGet);
        BaseService.logger.info(BaseService.messageExceptionResponsableGet);
    }
}
