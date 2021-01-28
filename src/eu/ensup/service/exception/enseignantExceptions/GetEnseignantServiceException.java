package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetEnseignantServiceException extends ServiceException {
    public GetEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès aux information de l'enseignant");
    }
}
