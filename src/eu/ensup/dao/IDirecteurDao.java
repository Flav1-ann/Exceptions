package eu.ensup.dao;

import java.sql.SQLException;
import java.util.Set;

import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Directeur;

/**
 * Interface DAO de directeur
 */
public interface IDirecteurDao {

    /**
     * Create directeur int.
     *
     * @param p the p
     * @return the int
     * @throws SQLException the sql exception
     */
    int createDirecteur(Directeur p) throws DaoException;

    /**
     * Update directeur int.
     *
     * @param p the p
     * @return the int
     * @throws SQLException the sql exception
     */


    int updateDirecteur(Directeur p) throws DaoException;

    /**
     * Delete directeur int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteDirecteur(int id) throws DaoException;

    /**
     * Gets directeur.
     *
     * @param id the id
     * @return the directeur
     * @throws SQLException the sql exception
     */
    Directeur getDirecteur(int id) throws DaoException;


    /**
     * Gets all directeurs.
     *
     * @return the all directeurs
     * @throws SQLException the sql exception
     */
    Set<Directeur> getAllDirecteurs() throws DaoException;
}
