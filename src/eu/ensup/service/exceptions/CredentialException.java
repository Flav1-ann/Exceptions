package eu.ensup.service.exceptions;

public class CredentialException extends Exception {

    public CredentialException() {
        super("Le mot de passe ou l'adresse mail..ne sont pas correcte... veuillez réessayer !");
    }
}
