package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

public class AddEnseignantServiceException extends Exception {
    public AddEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout de l'enseignant");
    }
}
