package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Delete responsable service exception.
 */
public class DeleteResponsableServiceException extends ServiceException {
    /**
     * Instantiates a new Delete responsable service exception.
     */
    public DeleteResponsableServiceException() {
        super(BaseService.messageExceptionResponsableDelete);
        BaseService.logger.info(BaseService.messageExceptionResponsableDelete);
    }
}
