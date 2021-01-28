package eu.ensup.service.exceptions;

public class EmailFormatException extends Exception {

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     */
    public EmailFormatException() {
        super("L'email doit être au format xxx@xxx.xx ");
        BaseServiceException.logger.info("L'email doit être au format xxx@xxx.xx");
    }
}
