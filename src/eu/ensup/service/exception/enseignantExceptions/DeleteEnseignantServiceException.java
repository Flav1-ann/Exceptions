package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

public class DeleteEnseignantServiceException extends Exception {
    public DeleteEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la supression du directeur");
    }
}
