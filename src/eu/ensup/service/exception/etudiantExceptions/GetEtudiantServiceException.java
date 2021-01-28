package eu.ensup.service.exception.etudiantExceptions;

public class GetEtudiantServiceException extends Exception {
    public GetEtudiantServiceException() {
        super("L'étudiant ne peut pas être récuperer");
    }
}
