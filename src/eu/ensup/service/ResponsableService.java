package eu.ensup.service;

import eu.ensup.dao.ResponsableDao;
import eu.ensup.domaine.Responsable;
import eu.ensup.service.exceptions.CredentialException;
import eu.ensup.service.exceptions.EmailFormatException;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public int addResponsable(Responsable r) throws NoSuchAlgorithmException {
        byte[] salt = personnePhysiqueService.createSalt();
        String hash = personnePhysiqueService.generateHashPassword(r.getMotDePasse(),salt);

        r.setSalt(Base64.getEncoder().encodeToString(salt));
        r.setMotDePasse(hash);
        return responsableDao.createResponsable(r);
    }

    /**
     * Méthode permettant de mettre à jour un responsable
     * @param r
     * @return integer
     * @throws SQLException
     */
    @Override
    public int updateResponsable(Responsable r) throws SQLException {
        return responsableDao.updateResponsable(r);
    }

    /**
     * Méthode permettant la suppression  d'un responsable
     * @param id
     * @return integer
     * @throws SQLException
     */
    @Override
    public int deleteResponsable(int id) throws SQLException {
        return responsableDao.deleteResponsable(id);
    }

    /**
     * Méthode permettant la récupération d'un directeur par son identifiant
     * @param id
     * @return responsable
     * @throws SQLException
     */
    @Override
    public Responsable getResponsable(int id) throws SQLException {
        return responsableDao.getResponsable(id);
    }

    /**
     * Mérhode permettant la récupération de tous les directeurs
     * @return integer
     * @throws SQLException
     */
    @Override
    public Set<Responsable> getAllResponsables() throws SQLException {
        return responsableDao.getAllResponsables();
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
        } catch ( SQLException se) {
            throw new CredentialException();
        }



    }
    @Override
    public int validAuthentification(Responsable r, String password) throws NoSuchAlgorithmException, CredentialException, EmailFormatException {
        Pattern pattern = Pattern.compile("Hugo");
        Matcher matcher = pattern.matcher("");
        int errorCode = 0;
        if(r != null) {
            matcher = pattern.matcher( r.getEmail() );
            errorCode = personnePhysiqueService.validPersonnePhysique(r,password);
        }

        if(r == null || errorCode == 0){
            throw new CredentialException();
        }
        else if (matcher.find() || r.getEmail() == null) {
            throw new EmailFormatException();
        } else {
            return errorCode;
        }

    }
}
