package eu.ensup.service.exception.enseignantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class UpdateEnseignantServiceException extends ServiceException {
    public UpdateEnseignantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la modification de l'enseignant");
    }
}
