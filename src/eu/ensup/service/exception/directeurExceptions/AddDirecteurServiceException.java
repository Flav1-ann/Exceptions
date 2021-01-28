package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddDirecteurServiceException extends ServiceException {
    public AddDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout du directeur");
    }
}
