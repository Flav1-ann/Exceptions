package eu.ensup.dao;

import java.sql.SQLException;
import java.util.Set;

import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Enseignant;

/**
 * The interface Enseignant dao.
 */
public interface IEnseignantDao {
    /**
     * Create enseignant int.
     *
     * @param enseignant the enseignant
     * @return the int
     * @throws SQLException the sql exception
     */
    int createEnseignant(Enseignant enseignant) throws DaoException;

    /**
     * Update enseignant int.
     *
     * @param enseignant the enseignant
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateEnseignant(Enseignant enseignant) throws DaoException;

    /**
     * Delete enseignant int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteEnseignant(int id) throws DaoException;

    /**
     * Gets enseignant.
     *
     * @param id the id
     * @return the enseignant
     * @throws SQLException the sql exception
     */
    Enseignant getEnseignant(int id) throws DaoException;

    /**
     * Gets all enseignants.
     *
     * @return the all enseignants
     * @throws SQLException the sql exception
     */
    Set<Enseignant> getAllEnseignants() throws DaoException;
}
