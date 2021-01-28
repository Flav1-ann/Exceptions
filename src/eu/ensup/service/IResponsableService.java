package eu.ensup.service;

import eu.ensup.domaine.Responsable;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.EmailFormatException;
import eu.ensup.service.exception.responsableExceptions.*;

import java.security.NoSuchAlgorithmException;


import eu.ensup.domaine.Responsable;
import eu.ensup.service.exception.CredentialException;
import eu.ensup.service.exception.ServiceException;

/**
 * The interface Responsable service.
 */
public interface IResponsableService extends IService<Responsable>
{
    /**
     * Valid responsable authentification int.
     *
     * @param r        the r
     * @param password the password
     * @return the int
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    int validResponsableAuthentification(Responsable r, String password) throws NoSuchAlgorithmException;

    /**
     * Gets credential by email.
     *
     * @param email the email
     * @return the credential by email
     * @throws ServiceException the sql exception
     */
    Responsable getCredentialByEmail(String email) throws ServiceException;

    /**
     * Valid directeur authentification int.
     *
     * @param r        the Responsable
     * @param password the password
     * @return the int
     * @throws NoSuchAlgorithmException the no such algorithm exception
     */
    int validAuthentification(Responsable r, String password) throws NoSuchAlgorithmException, CredentialException, EmailFormatException;

}
