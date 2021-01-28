package eu.ensup.service.exceptions;

import eu.ensup.dao.exceptions.DatabaseException;

/**
 * @author Allan
 */
public class AddCoursServiceException extends Exception {
    public AddCoursServiceException(DatabaseException data) {
        super( data.getMessage() );
        BaseServiceException.logger.info(data.getMessage());
    }
}
