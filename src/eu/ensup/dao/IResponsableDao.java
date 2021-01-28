package eu.ensup.dao;

import java.sql.SQLException;
import java.util.Set;

import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Etudiant;
import eu.ensup.domaine.Responsable;

/**
 * The interface Responsable dao.
 */
public interface IResponsableDao extends IDao<Responsable>
{
	/**
	 * Gets credential by email.
	 *
	 * @param email the email
	 * @return the credential by email
	 * @throws SQLException the sql exception
	 */
	Responsable getCredentialByEmail(String email) throws DaoException;

}