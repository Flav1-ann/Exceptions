package eu.ensup.service;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Set;

import eu.ensup.dao.ResponsableDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Responsable;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.responsableExceptions.AddResponsableServiceException;
import eu.ensup.service.exception.responsableExceptions.DeleteResponsableServiceException;
import eu.ensup.service.exception.responsableExceptions.GetAllResponsableServiceException;
import eu.ensup.service.exception.responsableExceptions.GetResponsableServiceException;
import eu.ensup.service.exception.responsableExceptions.UpdateResponsableServiceException;

/**
 * The type Responsable service.
 */
public class ResponsableService implements IResponsableService {

    private final ResponsableDao responsableDao = new ResponsableDao();
    private final PersonnePhysiqueService personnePhysiqueService = new PersonnePhysiqueService();

    /**
     * Méthode permettant d'ajouter un responsable
     * @param r
     * @return integer
     * @throws NoSuchAlgorithmException
     */
    @Override
    public int create(Responsable r) throws CredentialException, AddResponsableServiceException {
        byte[] salt = personnePhysiqueService.createSalt();
        String hash = null;
        try {
            hash = personnePhysiqueService.generateHashPassword(r.getMotDePasse(), salt);
        }catch (NoSuchAlgorithmException e){
            throw new CredentialException();
        }

        r.setSalt(Base64.getEncoder().encodeToString(salt));
        r.setMotDePasse(hash);
        try{
            return responsableDao.create(r);
        }catch (DaoException e){
            throw new AddResponsableServiceException();
        }
    }

    /**
     * Méthode permettant de mettre à jour un responsable
     * @param r
     * @return integer
     * @throws SQLException
     */
    @Override
    public int update(Responsable r) throws UpdateResponsableServiceException {
        try{
            return responsableDao.update(r);
        }catch (DaoException e){
            throw new UpdateResponsableServiceException();
        }
    }

    /**
     * Méthode permettant la suppression  d'un responsable
     * @param id
     * @return integer
     * @throws SQLException
     */
    @Override
    public int delete(int id) throws DeleteResponsableServiceException {
        try{
            return responsableDao.delete(id);
        }catch (DaoException e){
            throw new DeleteResponsableServiceException();
        }
    }

    /**
     * Méthode permettant la récupération d'un directeur par son identifiant
     * @param id
     * @return responsable
     * @throws SQLException
     */
    @Override
    public Responsable get(int id) throws GetResponsableServiceException {
        try {
            return responsableDao.get(id);
        }catch (DaoException e){
            throw new GetResponsableServiceException();
        }
    }

    /**
     * Mérhode permettant la récupération de tous les directeurs
     * @return integer
     * @throws SQLException
     */
    @Override
    public Set<Responsable> getAll() throws GetAllResponsableServiceException {
        try{
            return responsableDao.getAll();
        }catch (DaoException e){
            throw new GetAllResponsableServiceException();
        }
    }

    /**
     *
     * @param r
     * @param password
     * @return integer
     * @throws NoSuchAlgorithmException return exception
     */
    @Override
    public int validResponsableAuthentification(Responsable r, String password) throws NoSuchAlgorithmException {
        return personnePhysiqueService.validPersonnePhysique(r,password);
    }

    @Override
    public Responsable getCredentialByEmail(String email) throws CredentialException {
        try {
            return responsableDao.getCredentialByEmail(email);
        } catch (DaoException se) {
            throw new CredentialException();
        }



    }
    @Override
    public int validAuthentification(Responsable r, String password) throws NoSuchAlgorithmException, CredentialException {
        if(r == null || r.getEmail() == null){
            throw new CredentialException();
        } else {
            return personnePhysiqueService.validPersonnePhysique(r,password);
        }

    }
}
