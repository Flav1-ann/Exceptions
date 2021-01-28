package eu.ensup.service.exception.etudiantExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

/**
 * The type Get etudiant service exception.
 */
public class GetEtudiantServiceException extends ServiceException {
    /**
     * Instantiates a new Get etudiant service exception.
     */
    public GetEtudiantServiceException() {
        super("Une erreur à empêcher l'accès aux informations de l'étudiants");
        BaseService.logger.info("Une erreur à empêcher l'accès aux informations de l'étudiants");
    }
}
