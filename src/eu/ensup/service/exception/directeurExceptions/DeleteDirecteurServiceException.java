package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

public class DeleteDirecteurServiceException extends Exception {
    public DeleteDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la supression du directeur");
    }
}
