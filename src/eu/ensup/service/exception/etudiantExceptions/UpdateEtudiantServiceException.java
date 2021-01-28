package eu.ensup.service.exception.etudiantExceptions;

public class UpdateEtudiantServiceException extends Exception {
    public UpdateEtudiantServiceException() {
        super("L'étudiant ne peut être modifier");
    }
}
