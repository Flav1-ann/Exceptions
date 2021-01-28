package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllResponsableServiceException extends ServiceException {
    public GetAllResponsableServiceException() {
        super("Une erreur à empêcher l'accès à la liste des étudiants des étudiant");
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des étudiants des étudiant");
    }
}
