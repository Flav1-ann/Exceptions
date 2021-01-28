package eu.ensup.service.exception.directeurExceptions;

import eu.ensup.service.BaseService;

public class UpdateDirecteurServiceException extends Exception {
    public UpdateDirecteurServiceException() {
        super();
        BaseService.logger.info("Une erreur à empêcher la modification du directeurs");
    }
}
