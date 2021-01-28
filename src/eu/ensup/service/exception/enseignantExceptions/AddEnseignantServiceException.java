package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddEnseignantServiceException extends ServiceException {
    public AddEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'ajout de l'enseignant");
    }
}
