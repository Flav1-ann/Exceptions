package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetEtudiantServiceException extends ServiceException {
    public GetEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantGet);
        BaseService.logger.info(BaseService.messageExceptionEtudiantGet);
    }
}
