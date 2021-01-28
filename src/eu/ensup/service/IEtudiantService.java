package eu.ensup.service;

import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.etudiantExceptions.*;

import java.sql.SQLException;
import java.util.Set;

/**
 * The interface Etudiant service.
 */
public interface IEtudiantService {
    /**
     * Add etudiant int.
     *
     * @param etudiant the etudiant
     * @return the int
     * @throws SQLException the sql exception
     */
    int addEtudiant(Etudiant etudiant) throws  AddEtudiantServiceException, CredentialException;

    /**
     * Update etudiant int.
     *
     * @param etudiant the etudiant
     * @return the int
     * @throws SQLException the sql exception
     */
    int updateEtudiant(Etudiant etudiant) throws   UpdateEtudiantServiceException;

    /**
     * Delete etudiant int.
     *
     * @param is the is
     * @return the int
     * @throws SQLException the sql exception
     */
    int deleteEtudiant(int is) throws   DeleteEtudiantServiceException;

    /**
     * Gets etudiant.
     *
     * @param id the id
     * @return the etudiant
     * @throws SQLException the sql exception
     */
    Etudiant getEtudiant(int id) throws  GetEtudiantServiceException;

    /**
     * Find all list.
     *
     * @return the list
     * @throws SQLException the sql exception
     */
    Set<Etudiant> getfindAll() throws  GetAllEtudiantServiceException;

}
