package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

public class GetAllEtudiantServiceException extends Exception {
    public GetAllEtudiantServiceException() {
        super("Une erreur à empêcher l'accès à la liste des étudiants");
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des étudiants");
    }
}
