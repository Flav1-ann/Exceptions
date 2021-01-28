package eu.ensup.service.exception.enseignantExceptions;


import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllEnseignantServiceException extends ServiceException {
    public GetAllEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès liste des enseignants");
    }
}
