package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetDirecteurServiceException extends ServiceException {
    public GetDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès aux informations du directeur");
    }
}
