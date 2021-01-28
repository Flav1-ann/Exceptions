package eu.ensup.service;

import eu.ensup.dao.EtudiantDao;
import eu.ensup.dao.IEtudiantDao;
import eu.ensup.dao.exceptions.DaoException;
import eu.ensup.dao.exceptions.DatabaseException;
import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.etudiantExceptions.*;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Set;

/**
 * The type Etudiant service.
 */
public class EtudiantService implements IEtudiantService{

    private final IEtudiantDao etudiantDao = new EtudiantDao();
    private final PersonnePhysiqueService personnePhysiqueService = new PersonnePhysiqueService();

    @Override
    public int addEtudiant(Etudiant etudiant) throws AddEtudiantServiceException, CredentialException {
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
            return etudiantDao.addEtudiant(etudiant);
        }
        catch (DaoException e) {
            throw new AddEtudiantServiceException();
        }

    }

    @Override
    public int updateEtudiant(Etudiant etudiant) throws UpdateEtudiantServiceException {
        try {
            return etudiantDao.updateEtudiant(etudiant);
        }
        catch (DaoException e) {
            throw new UpdateEtudiantServiceException();
        }
    }

    @Override
    public int deleteEtudiant(int id) throws DeleteEtudiantServiceException {
        try {
            return etudiantDao.deleteEtudiant(id);
        }
        catch (DaoException e) {
            throw new DeleteEtudiantServiceException();
        }

    }

    @Override
    public Etudiant getEtudiant(int id) throws GetEtudiantServiceException {
        try {
            return etudiantDao.getEtudiant(id);
        }
        catch (DaoException e) {
            throw new GetEtudiantServiceException();
        }

    }

    @Override
    public Set<Etudiant> getfindAll() throws GetAllEtudiantServiceException {
        try {
            return etudiantDao.getfindAll();
        }
        catch (DaoException e) {
            throw new GetAllEtudiantServiceException();
        }
    }
}
