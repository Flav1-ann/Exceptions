package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

public class InscriptionCoursServiceException extends Exception {
    public InscriptionCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'inscript de l'étudiant au cours");
    }
}
