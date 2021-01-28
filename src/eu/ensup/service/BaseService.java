package eu.ensup.service;

import eu.ensup.dao.BaseDao;
import org.apache.log4j.Logger;

public class BaseService {

    public final static Logger logger = Logger.getLogger(BaseService.class);

    // cours
    public static String messageExceptionCoursCoursAdd = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionCoursDelete = "Une erreur à empêcher la suppression du cours";
    public static String messageExceptionGetAllCours = "Une erreur à empêcher l'accès au cours de l'étudiant";
    public static String messageExceptionCoursEtudiant = "Une erreur à empêcher l'accès au cours";
    public static String messageExceptionGetCours = "Une erreur à empêcher l'accès au cours";
    public static String messageExceptionCoursInscription = "Une erreur à empêcher l'inscription de l'étudiant au cours";
    public static String messageExceptionCoursUpdate = "Une erreur à empêcher la modification du cours";

    // Directeur
    public static String messageExceptionDirecteurAdd = "Une erreur à empêcher l'ajout du directeur";
    public static String messageExceptionDirecteurDelete = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionGetAllDirecteur = "Une erreur à empêcher la supression du directeur";
    public static String messageExceptionGetDirecteur = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionDirecteurUpdate = "Une erreur à empêcher l'ajout du cours";

    //Enseignant
    public static String messageExceptionEnseignantAdd = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionEnseignantDelete = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionGetAllEnseignant = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionGetEnseignant = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionEnseignantUpdate = "Une erreur à empêcher l'ajout du cours";

    //étudiant
    public static String messageExceptionEtudiantAdd = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionEtudiantDelete = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionGetAllEtudiant = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionGetEtudiant = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionEtudiantUpdate = "Une erreur à empêcher l'ajout du cours";

    // responsable
    public static String messageExceptionResponsableAdd = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionResponsableDelete = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionGetAllResponsable = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionGetResponsable = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionResponsableUpdate = "Une erreur à empêcher l'ajout du cours";

    public BaseService() {
    }
}
