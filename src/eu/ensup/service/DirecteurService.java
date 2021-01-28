package eu.ensup.service;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Set;

import eu.ensup.dao.DirecteurDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Directeur;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.directeurExceptions.AddDirecteurServiceException;
import eu.ensup.service.exception.directeurExceptions.DeleteDirecteurServiceException;
import eu.ensup.service.exception.directeurExceptions.GetAllDirecteurServiceException;
import eu.ensup.service.exception.directeurExceptions.GetDirecteurServiceException;
import eu.ensup.service.exception.directeurExceptions.UpdateDirecteurServiceException;

/**
 * The type Directeur service.
 */
public class DirecteurService implements IDirecteurService {

    private final DirecteurDao directeurDao = new DirecteurDao();

    private final PersonnePhysiqueService personnePhysiqueService = new PersonnePhysiqueService();

    @Override
    public int create(Directeur d) throws CredentialException, AddDirecteurServiceException {
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
            return directeurDao.create(d);
        }
        catch (DaoException e) {
            throw new AddDirecteurServiceException();
        }
    }

    @Override
    public int update(Directeur d) throws UpdateDirecteurServiceException {
        try {
            return directeurDao.update(d);
        }catch(DaoException e) {
            throw new UpdateDirecteurServiceException();
        }
    }

    @Override
    public int delete(int id) throws DeleteDirecteurServiceException {
        try {
            return directeurDao.delete(id);
        }catch(DaoException e){
            throw new DeleteDirecteurServiceException();
        }
    }

    @Override
    public Directeur get(int id) throws GetDirecteurServiceException {
        try {
            return directeurDao.get(id);
        } catch(DaoException e){
            throw new GetDirecteurServiceException();
        }
    }


    @Override
    public Set<Directeur> getAll() throws GetAllDirecteurServiceException {
        try {
            return directeurDao.getAll();
        }catch(DaoException e){
            throw new GetAllDirecteurServiceException();
        }
    }


}
