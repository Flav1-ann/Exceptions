package eu.ensup.dao;

import java.sql.SQLException;
import java.util.Set;

import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Responsable;

/**
 * The interface Responsable dao.
 */
public interface IResponsableDao {
    /**
     * Create responsable int.
     *
     * @param r the r
     * @return the int
     * @throws SQLException the sql exception
     */
    int createResponsable(Responsable r) throws DaoException;

    /**
     * Update responsable int.
     *
     * @param r the r
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateResponsable(Responsable r) throws DaoException;

    /**
     * Delete responsable int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteResponsable(int id) throws DaoException;

    /**
     * Gets responsable.
     *
     * @param id the id
     * @return the responsable
     * @throws SQLException the sql exception
     */
    Responsable getResponsable(int id) throws DaoException;

    /**
     * Gets all responsables.
     *
     * @return the all responsables
     * @throws SQLException the sql exception
     */
    Set<Responsable> getAllResponsables() throws DaoException;


    /**
     * Gets credential by email.
     *
     * @param email the email
     * @return the credential by email
     * @throws SQLException the sql exception
     */
    Responsable getCredentialByEmail(String email) throws DaoException;

}
