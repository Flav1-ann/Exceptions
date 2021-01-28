package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Add etudiant service exception.
 */
public class AddEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Add etudiant service exception.
     */
    public AddEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantAdd);
        BaseService.logger.info(BaseService.messageExceptionEtudiantAdd);
    }
}
