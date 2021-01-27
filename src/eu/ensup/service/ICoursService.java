package eu.ensup.service;

import eu.ensup.dao.exceptions.DatabaseException;
import eu.ensup.domaine.Cours;
import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exceptions.AddCoursServiceException;
import eu.ensup.service.exceptions.CoursServiceException;

import java.sql.ResultSet;


import java.util.List;

/**
 * The interface Cours service.
 */
public interface ICoursService {
    /**
     * Add cours int.
     *
     * @param cours the cours
     * @return the int
     */
    int addCours(Cours cours) throws AddCoursServiceException;

    /**
     * Update cours int.
     *
     * @param cours the cours
     * @return the int
     */
    int updateCours(Cours cours) throws CoursServiceException;

    /**
     * Delete cours int.
     *
     * @param cours the cours
     * @return the int
     */
    int deleteCours(Cours cours) throws CoursServiceException;

    /**
     * Gets cours.
     *
     * @param id the id
     * @return the cours
     */
    Cours getCours (int id) throws CoursServiceException;

    /**
     * Find all list.
     *
     * @return the list
     */
    List<Cours> findAll() throws CoursServiceException;

    /**
     * Inscription int.
     *
     * @param c the c
     * @param e the e
     * @return the int
     */
    int inscription(Cours c, Etudiant e) throws CoursServiceException;

    /**
     * Gets cours etudiant.
     *
     * @param idEtudiant the id etudiant
     * @return the cours etudiant
     */
    List<Cours> getCoursEtudiant(int idEtudiant) throws CoursServiceException;
}
