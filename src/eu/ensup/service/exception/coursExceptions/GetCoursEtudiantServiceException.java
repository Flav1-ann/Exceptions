package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

public class GetCoursEtudiantServiceException extends Exception {
    public GetCoursEtudiantServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès au cours de l'étudiant");
    }
}
