package eu.ensup.service.exceptions;

/**
 * @author Allan
 */
public class EtudiantServiceException extends Exception {

    public EtudiantServiceException(String message) {
        super(message);
        BaseServiceException.logger.info(message);
    }
}
