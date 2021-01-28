package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddEtudiantServiceException extends ServiceException {
    public AddEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantAdd);
        BaseService.logger.info(BaseService.messageExceptionEtudiantAdd);
    }
}
