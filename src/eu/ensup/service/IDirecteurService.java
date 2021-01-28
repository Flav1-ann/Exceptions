package eu.ensup.service;

import eu.ensup.domaine.Directeur;
import eu.ensup.domaine.PersonnePhysique;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.directeurExceptions.*;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Set;


/**
 * Interface du service Directeur
 */
public interface IDirecteurService {

    /**
     * Add directeur int.
     *
     * @param d the d
     * @return the int
     * @throws SQLException             the sql exception
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    int addDirecteur(Directeur d) throws   CredentialException, AddDirecteurServiceException;


    /**
     * Update directeur int.
     *
     * @param d the d
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateDirecteur(Directeur d) throws  UpdateDirecteurServiceException;

    /**
     * Delete directeur int.
     *
     * @param id the id
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteDirecteur(int id) throws  DeleteDirecteurServiceException;

    /**
     * Gets directeur.
     *
     * @param id the id
     * @return the directeur
     * @throws SQLException the sql exception
     */
    Directeur getDirecteur(int id) throws  GetDirecteurServiceException;

    /**
     * Gets all directeurs.
     *
     * @return the all directeurs
     * @throws SQLException the sql exception
     */
    Set<Directeur> getAllDirecteurs() throws  GetAllDirecteurServiceException;





}
