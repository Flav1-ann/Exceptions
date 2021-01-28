package eu.ensup.service;

import java.util.Set;

import eu.ensup.dao.EnseignantDao;
import eu.ensup.dao.IEnseignantDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Enseignant;
import eu.ensup.service.exception.enseignantExceptions.AddEnseignantServiceException;
import eu.ensup.service.exception.enseignantExceptions.DeleteEnseignantServiceException;
import eu.ensup.service.exception.enseignantExceptions.GetAllEnseignantServiceException;
import eu.ensup.service.exception.enseignantExceptions.GetEnseignantServiceException;
import eu.ensup.service.exception.enseignantExceptions.UpdateEnseignantServiceException;

/**
 * The type Enseignant service.
 */
public class EnseignantService implements IEnseignantService{
    private final IEnseignantDao enseignantDao = new EnseignantDao();

    @Override
    public int create(Enseignant enseignant) throws AddEnseignantServiceException {
        try {
            return enseignantDao.create(enseignant);
        }catch (DaoException e){
            throw new AddEnseignantServiceException();
        }

    }

    @Override
    public int update(Enseignant enseignant) throws UpdateEnseignantServiceException {
        try {
            return enseignantDao.update(enseignant);
        }catch (DaoException e){
            throw new UpdateEnseignantServiceException();
        }
    }

    @Override
    public int delete(int id) throws DeleteEnseignantServiceException {
        try {
            return enseignantDao.delete(id);
        }catch (DaoException e) {
            throw new DeleteEnseignantServiceException();
        }
    }

    @Override
    public Enseignant get(int id) throws GetEnseignantServiceException {
        try {
            return enseignantDao.get(id);
        }catch (DaoException e){
            throw new GetEnseignantServiceException();
        }
    }

    @Override
    public Set<Enseignant> getAll() throws GetAllEnseignantServiceException {
        try {
            return enseignantDao.getAll();
        }catch (DaoException e) {
            throw new GetAllEnseignantServiceException();
        }

    }
}
