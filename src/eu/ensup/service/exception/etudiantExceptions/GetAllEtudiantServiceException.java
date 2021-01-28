package eu.ensup.service.exception.etudiantExceptions;

public class GetAllEtudiantServiceException extends Exception {
    public GetAllEtudiantServiceException() {
        super("Les étudiants ne peuvent pas être récuperer");
    }
}
