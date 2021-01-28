package eu.ensup.service;

import eu.ensup.dao.ResponsableDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Responsable;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.EmailFormatException;
import eu.ensup.service.exception.responsableExceptions.*;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    @Override
    public int update(Responsable r) throws UpdateResponsableServiceException {
        try{
            return responsableDao.update(r);
        }catch (DaoException e){
            throw new UpdateResponsableServiceException();
        }
    }

    @Override
    public int delete(int id) throws DeleteResponsableServiceException {
        try{
            return responsableDao.delete(id);
        }catch (DaoException e){
            throw new DeleteResponsableServiceException();
        }
    }

    @Override
    public Responsable get(int id) throws GetResponsableServiceException {
        try {
            return responsableDao.get(id);
        }catch (DaoException e){
            throw new GetResponsableServiceException();
        }
    }

    @Override
    public Set<Responsable> getAll() throws GetAllResponsableServiceException {
        try{
            return responsableDao.getAll();
        }catch (DaoException e){
            throw new GetAllResponsableServiceException();
        }
    }

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
        int errorCode = 0;
        if(r != null) {
            errorCode = personnePhysiqueService.validPersonnePhysique(r,password);
        }
        if(r == null || errorCode == 0){
            throw new CredentialException();
        }
        else {
            return errorCode;
        }
    }
}
