package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

public class GetEnseignantServiceException extends Exception {
    public GetEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès aux information de l'enseignant");
    }
}
