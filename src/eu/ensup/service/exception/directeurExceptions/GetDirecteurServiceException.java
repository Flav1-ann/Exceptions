package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

public class GetDirecteurServiceException extends Exception {
    public GetDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher l'accès aux informations du directeur");
    }
}
