package eu.ensup.dao.exceptions;

/**
 * @author Allan
 */
public class DatabaseException extends Exception {

    public DatabaseException(String message) {
        super("La base de donnée est momentanément indisponible " + message);
    }

}
