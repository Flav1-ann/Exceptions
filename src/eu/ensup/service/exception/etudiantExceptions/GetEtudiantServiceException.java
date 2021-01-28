package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get etudiant service exception.
 */
public class GetEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Get etudiant service exception.
     */
    public GetEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantGet);
        BaseService.logger.info(BaseService.messageExceptionEtudiantGet);
    }
}
