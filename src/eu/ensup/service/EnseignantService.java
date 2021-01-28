package eu.ensup.service;

import eu.ensup.dao.EnseignantDao;
import eu.ensup.dao.IEnseignantDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Enseignant;
import eu.ensup.service.exception.enseignantExceptions.*;

import java.sql.SQLException;
import java.util.Set;

/**
 * The type Enseignant service.
 */
public class EnseignantService implements IEnseignantService{
    private final IEnseignantDao enseignantDao = new EnseignantDao();

    @Override
    public int createEnseignant(Enseignant enseignant) throws AddEnseignantServiceException {
        try {
            return enseignantDao.createEnseignant(enseignant);
        }catch (DaoException e){
            throw new AddEnseignantServiceException();
        }

    }

    @Override
    public int updateEnseignant(Enseignant enseignant) throws UpdateEnseignantServiceException {
        try {
            return enseignantDao.updateEnseignant(enseignant);
        }catch (DaoException e){
            throw new UpdateEnseignantServiceException();
        }
    }

    @Override
    public int deleteEnseignant(int id) throws DeleteEnseignantServiceException {
        try {
            return enseignantDao.deleteEnseignant(id);
        }catch (DaoException e) {
            throw new DeleteEnseignantServiceException();
        }
    }

    @Override
    public Enseignant getEnseignant(int id) throws GetEnseignantServiceException {
        try {
            return enseignantDao.getEnseignant(id);
        }catch (DaoException e){
            throw new GetEnseignantServiceException();
        }
    }

    @Override
    public Set<Enseignant> getAllEnseignants() throws GetAllEnseignantServiceException {
        try {
            return enseignantDao.getAllEnseignants();
        }catch (DaoException e) {
            throw new GetAllEnseignantServiceException();
        }

    }
}
