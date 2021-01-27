package eu.ensup.presentation;


import eu.ensup.domaine.Cours;
import eu.ensup.domaine.Directeur;
import eu.ensup.domaine.Etudiant;
import eu.ensup.domaine.Responsable;
import eu.ensup.presentation.vues.PageAuthentification;
import eu.ensup.service.CoursService;
import eu.ensup.service.DirecteurService;
import eu.ensup.service.EtudiantService;
import eu.ensup.service.ResponsableService;
import org.w3c.dom.ElementTraversal;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * The type Lanceur.
 */
public class Lanceur {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            // TODO Auto-generated method stub
            // Instancier une fenetre
            PageAuthentification f1 = new PageAuthentification();

            //Afficher la JFrame
            f1.setVisible(true);
        } catch (UnsupportedLookAndFeelException e) {

        }
    }

}
