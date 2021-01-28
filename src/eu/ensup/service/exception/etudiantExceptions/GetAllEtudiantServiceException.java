package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get all etudiant service exception.
 */
public class GetAllEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Get all etudiant service exception.
     */
    public GetAllEtudiantServiceException() {
        super("Une erreur à empêcher l'accès à la liste des étudiants");
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des étudiants");
    }
}
