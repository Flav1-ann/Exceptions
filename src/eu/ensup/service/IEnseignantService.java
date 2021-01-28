package eu.ensup.service;

import eu.ensup.domaine.Enseignant;
import eu.ensup.service.exception.enseignantExceptions.*;

import java.sql.SQLException;
import java.util.Set;

/**
 * The interface Enseignant service.
 */
public interface IEnseignantService {
    /**
     * Create enseignant int.
     *
     * @param enseignant the enseignant
     * @return the int
     * @throws SQLException the sql exception
     */
    int createEnseignant(Enseignant enseignant) throws  AddEnseignantServiceException;

    /**
     * Update enseignant int.
     *
     * @param enseignant the enseignant
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateEnseignant(Enseignant enseignant) throws  UpdateEnseignantServiceException;

    /**
     * Delete enseignant int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteEnseignant(int id) throws  DeleteEnseignantServiceException;

    /**
     * Gets enseignant.
     *
     * @param id the id
     * @return the enseignant
     * @throws SQLException the sql exception
     */
    Enseignant getEnseignant(int id) throws  GetEnseignantServiceException;

    /**
     * Gets all enseignants.
     *
     * @return the all enseignants
     * @throws SQLException the sql exception
     */
    Set<Enseignant> getAllEnseignants() throws  GetAllEnseignantServiceException;
}
