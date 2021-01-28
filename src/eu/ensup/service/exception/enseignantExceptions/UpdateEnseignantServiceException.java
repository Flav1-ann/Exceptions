package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

public class UpdateEnseignantServiceException extends Exception {
    public UpdateEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la modification de l'enseignant");
    }
}
