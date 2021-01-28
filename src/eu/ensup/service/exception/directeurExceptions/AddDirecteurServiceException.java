package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

public class AddDirecteurServiceException extends Exception {
    public AddDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout du directeur");
    }
}
