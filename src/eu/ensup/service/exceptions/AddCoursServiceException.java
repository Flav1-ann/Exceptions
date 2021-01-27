package eu.ensup.service.exceptions;

import eu.ensup.dao.exceptions.DatabaseException;

/**
 * @author Allan
 */
public class AddCoursServiceException extends Exception {
    public AddCoursServiceException() {
        super("Le cours n'a pas pu être ajouter");
    }
}
