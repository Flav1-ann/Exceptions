package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

public class GetAllEnseignantServiceException extends Exception {
    public GetAllEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès liste des enseignants");
    }
}
