package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddResponsableServiceException extends ServiceException {
    public AddResponsableServiceException() {
        super("Une erreur à empêcher l'ajout de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher l'ajout de l'étudiant");
    }
}
