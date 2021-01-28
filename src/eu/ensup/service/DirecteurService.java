package eu.ensup.service;

import eu.ensup.dao.DirecteurDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Directeur;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.coursExceptions.UpdateCoursServiceException;
import eu.ensup.service.exception.directeurExceptions.*;
import eu.ensup.service.exception.etudiantExceptions.AddEtudiantServiceException;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Set;

/**
 * Classe service de directeur implémentant l'interface IDirecteurService
 *
 * @see IDirecteurService
 */
public class DirecteurService implements IDirecteurService {

    /**
     * Constante faisant appel à la classe dao DirecteurDao
     */
    private final DirecteurDao directeurDao = new DirecteurDao();

    private final PersonnePhysiqueService personnePhysiqueService = new PersonnePhysiqueService();

    /**
     * Méthode permettant d'ajouter un directeur
     * @param d un directeur
     * @return un entier représentant le résultat
     * @throws SQLException exception SQL
     */
    @Override
    public int addDirecteur(Directeur d) throws CredentialException, AddDirecteurServiceException {
        byte[] salt = personnePhysiqueService.createSalt();
        String hash = null;
        try {
            hash = personnePhysiqueService.generateHashPassword(d.getMotDePasse(),salt);
        } catch (NoSuchAlgorithmException e) {
            throw new CredentialException();
        }


        d.setSalt(Base64.getEncoder().encodeToString(salt));
        d.setMotDePasse(hash);
        try {
            return directeurDao.createDirecteur(d);
        }
        catch (DaoException e) {
            throw new AddDirecteurServiceException();
        }
    }

    /**
     * Méthode permettant de mettre à jour un directeur
     * @param d un directeur
     * @return un entier représentant le résultat
     * @throws SQLException exception SQL
     */
    @Override
    public int updateDirecteur(Directeur d) throws UpdateDirecteurServiceException {
        try {
            return directeurDao.updateDirecteur(d);
        }catch(DaoException e) {
            throw new UpdateDirecteurServiceException();
        }
    }

    /**
     * Methode permettant la supression d'un directeur
     * @param id identifiant du directeur
     * @return un entier représentant le résultat
     * @throws SQLException exception SQL
     */
    @Override
    public int deleteDirecteur(int id) throws DeleteDirecteurServiceException {
        try {
            return directeurDao.deleteDirecteur(id);
        }catch(DaoException e){
            throw new DeleteDirecteurServiceException();
        }
    }

    /**
     * Méthode permettant la récupération d'un directeur par son identifiant
     * @param id identifiant du directeur
     * @return un directeur
     * @throws SQLException exception SQL
     */
    @Override
    public Directeur getDirecteur(int id) throws GetDirecteurServiceException {
        try {
            return directeurDao.getDirecteur(id);
        } catch(DaoException e){
            throw new GetDirecteurServiceException();
        }
    }


    /**
     * Mérhode permettant la récupération de tous les directeurs
     * @return une liste de directeurs
     * @throws SQLException exception SQL
     */
    @Override
    public Set<Directeur> getAllDirecteurs() throws GetAllDirecteurServiceException {
        try {
            return directeurDao.getAllDirecteurs();
        }catch(DaoException e){
            throw new GetAllDirecteurServiceException();
        }
    }


}
