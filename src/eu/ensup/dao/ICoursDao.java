package eu.ensup.dao;
import java.util.List;

import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Cours;
import eu.ensup.domaine.Etudiant;

/**
 * The interface Cours dao.
 */
public interface ICoursDao {

    /**
     * add cours int
     *
     * @param cours the cours
     * @return int int
     */
    int addCours(Cours cours) throws DaoException;

    /**
     * Update cours int.
     *
     * @param cours the cours
     * @return int int
     */
    int updateCours(Cours cours) throws DaoException;

    /**
     * Delete cours int
     *
     * @param cours the cours
     * @return int int
     */
    int deleteCours(Cours cours) throws DaoException;

    /**
     * get cours
     *
     * @param id the id
     * @return cours cours
     */
    Cours getCours (int id) throws DaoException;

    /**
     * Find all list.
     *
     * @return list list
     */
    List<Cours> findAll() throws DaoException;

    /**
     * Inscreption result set.
     *
     * @param c the c
     * @param e the e
     * @return the result set
     */
    int inscription(Cours c, Etudiant e) throws DaoException;

    /**
     * Gets cours etudiant.
     *
     * @param idEtudiant the id etudiant
     * @return the cours etudiant
     */
    List<Cours> getCoursEtudiant(int idEtudiant) throws DaoException;

}
