package eu.ensup.service.exception.responsableExceptions;

import eu.ensup.service.BaseService;

public class GetResponsableServiceException extends Exception {
    public GetResponsableServiceException() {
        super("Le responsable ne peut pas être récuperer");
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des étudiants des étudiant");
    }
}
