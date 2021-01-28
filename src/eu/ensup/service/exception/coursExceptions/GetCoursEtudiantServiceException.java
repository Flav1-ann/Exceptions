package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetCoursEtudiantServiceException extends ServiceException {
    public GetCoursEtudiantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès au cours de l'étudiant");
    }
}
