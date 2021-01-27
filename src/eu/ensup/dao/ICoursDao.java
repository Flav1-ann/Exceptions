package eu.ensup.dao;
import eu.ensup.dao.exceptions.DatabaseException;
import eu.ensup.domaine.Cours;
import eu.ensup.domaine.Etudiant;

import java.util.List;

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
    int addCours(Cours cours) throws DatabaseException;

    /**
     * Update cours int.
     *
     * @param cours the cours
     * @return int int
     */
    int updateCours(Cours cours) throws DatabaseException;

    /**
     * Delete cours int
     *
     * @param cours the cours
     * @return int int
     */
    int deleteCours(Cours cours) throws DatabaseException;

    /**
     * get cours
     *
     * @param id the id
     * @return cours cours
     */
    Cours getCours (int id) throws DatabaseException;

    /**
     * Find all list.
     *
     * @return list list
     */
    List<Cours> findAll() throws DatabaseException;

    /**
     * Inscreption result set.
     *
     * @param c the c
     * @param e the e
     * @return the result set
     */
    int inscription(Cours c, Etudiant e) throws DatabaseException;

    /**
     * Gets cours etudiant.
     *
     * @param idEtudiant the id etudiant
     * @return the cours etudiant
     */
    List<Cours> getCoursEtudiant(int idEtudiant) throws DatabaseException;

}
