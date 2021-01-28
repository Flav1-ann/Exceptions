package eu.ensup.service.exception.etudiantExceptions;

public class DeleteEtudiantServiceException extends Exception {
    public DeleteEtudiantServiceException() {
        super("L'étudiant ne peut être supprimer");
    }
}
