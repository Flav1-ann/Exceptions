package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

public class AddEtudiantServiceException extends Exception {
    public AddEtudiantServiceException() {
        super("Une erreur à empêcher l'ajout de l'étudiant");
        BaseService.logger.info("Une erreur à empêcher l'ajout de l'étudiant");
    }
}
