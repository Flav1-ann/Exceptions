package eu.ensup.dao;

import java.sql.SQLException;
import java.util.Set;

import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Etudiant;

/**
 * The interface Etudiant dao.
 */
public interface IEtudiantDao {
    /**
     * Add etudiant int.
     *
     * @param etudiant the etudiant
     * @return the int
     * @throws SQLException the sql exception
     */
    int addEtudiant(Etudiant etudiant) throws DaoException;

    /**
     * Update etudiant int.
     *
     * @param etudiant the etudiant
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateEtudiant(Etudiant etudiant) throws  DaoException;

    /**
     * Delete etudiant int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteEtudiant(int id) throws DaoException;

    /**
     * Gets etudiant.
     *
     * @param id the id
     * @return the etudiant
     * @throws SQLException the sql exception
     */
    Etudiant getEtudiant(int id) throws DaoException;

    /**
     * Find all list.
     *
     * @return the list
     * @throws SQLException the sql exception
     */
    Set<Etudiant> getfindAll() throws DaoException;
}
