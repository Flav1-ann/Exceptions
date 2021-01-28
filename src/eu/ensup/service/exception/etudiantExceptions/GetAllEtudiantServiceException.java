package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllEtudiantServiceException extends ServiceException {
    public GetAllEtudiantServiceException() {
        super(BaseService.messageExceptionEtudiantGetAll);
        BaseService.logger.info(BaseService.messageExceptionEtudiantGetAll);
    }
}
