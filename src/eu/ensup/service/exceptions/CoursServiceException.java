package eu.ensup.service.exceptions;

import eu.ensup.dao.exceptions.DatabaseException;

/**
 * @author Allan
 */
public class CoursServiceException extends Exception {

    public CoursServiceException(DatabaseException data) {

        super(data.getMessage());
        BaseServiceException.logger.info(data.getMessage());

    }

}
