package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetAllEtudiantServiceException extends ServiceException {
    public GetAllEtudiantServiceException() {
        super("Une erreur à empêcher l'accès à la liste des étudiants");
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des étudiants");
    }
}
