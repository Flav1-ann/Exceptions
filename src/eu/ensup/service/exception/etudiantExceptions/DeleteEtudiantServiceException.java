package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class DeleteEtudiantServiceException extends ServiceException {
    public DeleteEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantDelete);
        BaseService.logger.info(BaseService.messageExceptionEtudiantDelete);
    }
}
