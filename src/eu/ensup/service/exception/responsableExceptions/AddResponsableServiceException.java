package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

public class AddResponsableServiceException extends Exception {
    public AddResponsableServiceException() {
        super("Une erreur à empêcher l'ajout de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher l'ajout de l'étudiant");
    }
}
