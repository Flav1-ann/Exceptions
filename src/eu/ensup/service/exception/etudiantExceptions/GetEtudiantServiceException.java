package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetEtudiantServiceException extends ServiceException {
    public GetEtudiantServiceException() {
        super("Une erreur à empêcher l'accès aux informations de l'étudiants");
        BaseService.logger.info("Une erreur à empêcher l'accès aux informations de l'étudiants");
    }
}
