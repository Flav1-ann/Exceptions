package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class UpdateEtudiantServiceException extends ServiceException {
    public UpdateEtudiantServiceException() {
        super("L'étudiant ne peut être modifier");
        BaseService.logger.info("Une erreur à empêcher la modification de l'étudiants");
    }
}
