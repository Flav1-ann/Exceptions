package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class InscriptionCoursServiceException extends ServiceException {
    public InscriptionCoursServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'inscript de l'étudiant au cours");
    }
}
