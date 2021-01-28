package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

public class UpdateEtudiantServiceException extends Exception {
    public UpdateEtudiantServiceException() {
        super("L'étudiant ne peut être modifier");
        BaseService.logger.info("Une erreur à empêcher la modification de l'étudiants");
    }
}
