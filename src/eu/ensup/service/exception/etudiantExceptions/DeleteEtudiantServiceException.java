package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class DeleteEtudiantServiceException extends ServiceException {
    public DeleteEtudiantServiceException() {
        super("Une erreur à empêcher la suppression de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher la suppression de l'étudiant");
    }
}
