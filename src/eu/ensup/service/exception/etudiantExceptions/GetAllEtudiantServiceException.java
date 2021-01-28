package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get all etudiant service exception.
 */
public class GetAllEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Get all etudiant service exception.
     */
    public GetAllEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantGetAll);
        BaseService.logger.info(BaseService.messageExceptionEtudiantGetAll);
    }
}
