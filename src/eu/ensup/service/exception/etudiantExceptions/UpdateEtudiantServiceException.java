package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Update etudiant service exception.
 */
public class UpdateEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Update etudiant service exception.
     */
    public UpdateEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantUpdate);
        BaseService.logger.info(BaseService.messageExceptionEtudiantUpdate);
    }
}
