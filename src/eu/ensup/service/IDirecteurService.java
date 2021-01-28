package eu.ensup.service;

import eu.ensup.domaine.Directeur;
import eu.ensup.domaine.PersonnePhysique;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.directeurExceptions.*;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Set;


/**
 * The interface Directeur service.
 */
public interface IDirecteurService extends IService<Directeur>
{
	
}
