package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class DeleteResponsableServiceException extends ServiceException {
    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     */
    public DeleteResponsableServiceException() {
        super("Une erreur à empêcher la suppression de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher la suppression de l'étudiant");
    }
}
