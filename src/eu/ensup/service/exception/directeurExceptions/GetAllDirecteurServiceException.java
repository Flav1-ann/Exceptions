package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

public class GetAllDirecteurServiceException extends Exception {
    public GetAllDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès à la liste des directeurs");
    }
}
