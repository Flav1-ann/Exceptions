package eu.ensup.service.exception.etudiantExceptions;

public class AddEtudiantServiceException extends Exception {
    public AddEtudiantServiceException() {
        super("L'étudiant ne peut être ajouter");
    }
}
