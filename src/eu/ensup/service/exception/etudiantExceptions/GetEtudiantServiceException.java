package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

public class GetEtudiantServiceException extends Exception {
    public GetEtudiantServiceException() {
        super("Une erreur à empêcher l'accès aux informations de l'étudiants");
        BaseService.logger.info("Une erreur à empêcher l'accès aux informations de l'étudiants");
    }
}
