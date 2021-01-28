package eu.ensup.service;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Set;

import eu.ensup.dao.EtudiantDao;
import eu.ensup.dao.IEtudiantDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.etudiantExceptions.AddEtudiantServiceException;
import eu.ensup.service.exception.etudiantExceptions.DeleteEtudiantServiceException;
import eu.ensup.service.exception.etudiantExceptions.GetAllEtudiantServiceException;
import eu.ensup.service.exception.etudiantExceptions.GetEtudiantServiceException;
import eu.ensup.service.exception.etudiantExceptions.UpdateEtudiantServiceException;

/**
 * The type Etudiant service.
 */
public class EtudiantService implements IEtudiantService{

    private final IEtudiantDao etudiantDao = new EtudiantDao();
    private final PersonnePhysiqueService personnePhysiqueService = new PersonnePhysiqueService();

    @Override
    public int create(Etudiant etudiant) throws AddEtudiantServiceException, CredentialException {
        byte[] salt = personnePhysiqueService.createSalt();
        String hash = null;
        try {
            hash = personnePhysiqueService.generateHashPassword(etudiant.getMotDePasse(),salt);
        } catch (NoSuchAlgorithmException e) {
            throw new CredentialException();
        }

        etudiant.setSalt(Base64.getEncoder().encodeToString(salt));
        etudiant.setMotDePasse(hash);
        try {
            return etudiantDao.create(etudiant);
        }
        catch (DaoException e) {
            throw new AddEtudiantServiceException();
        }

    }

    @Override
    public int update(Etudiant etudiant) throws UpdateEtudiantServiceException {
        try {
            return etudiantDao.update(etudiant);
        }
        catch (DaoException e) {
            throw new UpdateEtudiantServiceException();
        }
    }

    @Override
    public int delete(int id) throws DeleteEtudiantServiceException {
        try {
            return etudiantDao.delete(id);
        }
        catch (DaoException e) {
            throw new DeleteEtudiantServiceException();
        }

    }

    @Override
    public Etudiant get(int id) throws GetEtudiantServiceException {
        try {
            return etudiantDao.get(id);
        }
        catch (DaoException e) {
            throw new GetEtudiantServiceException();
        }

    }

    @Override
    public Set<Etudiant> getAll() throws GetAllEtudiantServiceException {
        try {
            return etudiantDao.getAll();
        }
        catch (DaoException e) {
            throw new GetAllEtudiantServiceException();
        }
    }
}
