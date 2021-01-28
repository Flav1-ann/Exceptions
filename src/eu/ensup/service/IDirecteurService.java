package eu.ensup.service;

import eu.ensup.domaine.Directeur;
import eu.ensup.domaine.PersonnePhysique;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.directeurExceptions.*;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Set;


/**
 * Interface du service Directeur
 */
public interface IDirecteurService extends IService<Directeur>
{
	
}
