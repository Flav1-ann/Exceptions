package eu.ensup.service;

import java.util.Set;

import eu.ensup.domaine.Cours;
import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exception.ServiceException;

/**
 * The interface Cours service.
 */
public interface ICoursService extends IService<Cours>
{
    /**
     * Inscription int.
     *
     * @param c the c
     * @param e the e
     * @return the int
     */
    int inscription(Cours c, Etudiant e) throws  ServiceException;

    /**
     * Gets cours etudiant.
     *
     * @param idEtudiant the id etudiant
     * @return the cours etudiant
     */
    Set<Cours> getCoursEtudiant(int idEtudiant) throws  ServiceException;
}
