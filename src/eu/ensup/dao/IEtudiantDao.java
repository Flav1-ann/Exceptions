package eu.ensup.dao;

import eu.ensup.dao.exceptions.DatabaseException;
import eu.ensup.domaine.Etudiant;

import java.sql.SQLException;
import java.util.Set;

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
    int addEtudiant(Etudiant etudiant) throws DatabaseException;

    /**
     * Update etudiant int.
     *
     * @param etudiant the etudiant
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateEtudiant(Etudiant etudiant) throws  DatabaseException;

    /**
     * Delete etudiant int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteEtudiant(int id) throws DatabaseException;

    /**
     * Gets etudiant.
     *
     * @param id the id
     * @return the etudiant
     * @throws SQLException the sql exception
     */
    Etudiant getEtudiant(int id) throws DatabaseException;

    /**
     * Find all list.
     *
     * @return the list
     * @throws SQLException the sql exception
     */
    Set<Etudiant> getfindAll() throws DatabaseException;
}
