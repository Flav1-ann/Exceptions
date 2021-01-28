package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

public class DeleteEtudiantServiceException extends Exception {
    public DeleteEtudiantServiceException() {
        super("Une erreur à empêcher la suppression de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher la suppression de l'étudiant");
    }
}
