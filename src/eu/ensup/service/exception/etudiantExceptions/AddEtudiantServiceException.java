package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class AddEtudiantServiceException extends ServiceException {
    public AddEtudiantServiceException() {
        super("Une erreur à empêcher l'ajout de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher l'ajout de l'étudiant");
    }
}
