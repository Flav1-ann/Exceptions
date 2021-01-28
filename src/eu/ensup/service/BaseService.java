package eu.ensup.service;

import eu.ensup.dao.BaseDao;
import org.apache.log4j.Logger;

public class BaseService {

    public final static Logger logger = Logger.getLogger(BaseService.class);

    // cours
    public static String messageExceptionCoursAdd = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionCoursDelete = "Une erreur à empêcher la suppression du cours";
    public static String messageExceptionCoursGetAll = "Une erreur à empêcher l'accès au cours de l'étudiant";
    public static String messageExceptionCoursEtudiant = "Une erreur à empêcher l'accès au cours";
    public static String messageExceptionCoursGet = "Une erreur à empêcher l'accès au cours";
    public static String messageExceptionCoursInscription = "Une erreur à empêcher l'inscription de l'étudiant au cours";
    public static String messageExceptionCoursUpdate = "Une erreur à empêcher la modification du cours";

    // Directeur
    public static String messageExceptionDirecteurAdd = "Une erreur à empêcher l'ajout du directeur";
    public static String messageExceptionDirecteurDelete = "Une erreur à empêcher l'ajout du cours";
    public static String messageExceptionDirecteurGetAll = "Une erreur à empêcher la supression du directeur";
    public static String messageExceptionDirecteurGet = "Une erreur à empêcher l'ajout du directeur";
    public static String messageExceptionDirecteurUpdate = "Une erreur à empêcher l'ajout du directeur";

    //Enseignant
    public static String messageExceptionEnseignantAdd = "Une erreur à empêcher l'ajout de l'enseignant";
    public static String messageExceptionEnseignantDelete = "Une erreur à empêcher l'ajout de l'enseignant";
    public static String messageExceptionEnseignantGetAll = "Une erreur à empêcher l'ajout de l'enseignant";
    public static String messageExceptionEnseignantGet = "Une erreur à empêcher l'ajout de l'enseignant";
    public static String messageExceptionEnseignantUpdate = "Une erreur à empêcher l'ajout de l'enseignant";

    //étudiant
    public static String messageExceptionEtudiantAdd = "Une erreur à empêcher l'ajout de l'étudiant";
    public static String messageExceptionEtudiantDelete = "Une erreur à empêcher l'ajout de l'étudiant";
    public static String messageExceptionEtudiantGetAll = "Une erreur à empêcher l'ajout de l'étudiant";
    public static String messageExceptionEtudiantGet = "Une erreur à empêcher l'ajout de l'étudiant";
    public static String messageExceptionEtudiantUpdate = "Une erreur à empêcher l'ajout de l'étudiant";

    // responsable
    public static String messageExceptionResponsableAdd = "Une erreur à empêcher l'ajout du responsable";
    public static String messageExceptionResponsableDelete = "Une erreur à empêcher l'ajout du responsable";
    public static String messageExceptionResponsableGetAll = "Une erreur à empêcher l'ajout du responsable";
    public static String messageExceptionResponsableGet = "Une erreur à empêcher l'ajout du responsable";
    public static String messageExceptionResponsableUpdate = "Une erreur à empêcher l'ajout du responsable";

    public BaseService() {
    }
}
