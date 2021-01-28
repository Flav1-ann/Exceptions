package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllDirecteurServiceException extends ServiceException {
    public GetAllDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des directeurs");
    }
}
