package eu.ensup.service;

import eu.ensup.dao.EtudiantDao;
import eu.ensup.dao.IEtudiantDao;
import eu.ensup.dao.exceptions.DatabaseException;
import eu.ensup.domaine.Etudiant;
import eu.ensup.service.exceptions.EtudiantServiceException;

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
    public int addEtudiant(Etudiant etudiant) throws EtudiantServiceException {
        byte[] salt = personnePhysiqueService.createSalt();
        String hash = null;
        try {
            hash = personnePhysiqueService.generateHashPassword(etudiant.getMotDePasse(),salt);
        } catch (NoSuchAlgorithmException e) {
            throw new EtudiantServiceException("Le mots de passe pour l'étudiant n'est pas valide");
        }

        etudiant.setSalt(Base64.getEncoder().encodeToString(salt));
        etudiant.setMotDePasse(hash);
        try {
            return etudiantDao.addEtudiant(etudiant);
        }
        catch (DatabaseException data) {
            throw new EtudiantServiceException("L'étudiant ne peut être ajouter");
        }

    }

    @Override
    public int updateEtudiant(Etudiant etudiant) throws EtudiantServiceException {
        try {
            return etudiantDao.updateEtudiant(etudiant);
        }
        catch (DatabaseException data) {
            throw new EtudiantServiceException("L'étudiant ne peut être modifier");
        }
    }

    @Override
    public int deleteEtudiant(int id) throws EtudiantServiceException {
        try {
            return etudiantDao.deleteEtudiant(id);
        }
        catch (DatabaseException data) {
            throw new EtudiantServiceException("L'étudiant ne peut être supprimer");
        }

    }

    @Override
    public Etudiant getEtudiant(int id) throws EtudiantServiceException {
        try {
            return etudiantDao.getEtudiant(id);
        }
        catch (DatabaseException data) {
            throw new EtudiantServiceException("L'étudiant ne peut pas être récuperer");
        }

    }

    @Override
    public Set<Etudiant> getfindAll() throws EtudiantServiceException {
        try {
            return etudiantDao.getfindAll();
        }
        catch (DatabaseException data) {
            throw new EtudiantServiceException("Les étudiants ne peuvent pas être récuperer");
        }
    }
}
