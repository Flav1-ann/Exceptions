package eu.ensup.presentation.vues;

import eu.ensup.domaine.Directeur;
import eu.ensup.domaine.Responsable;
import eu.ensup.service.exceptions.CoursServiceException;
import eu.ensup.service.exceptions.EtudiantServiceException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * The type Page principal.
 */
public class PagePrincipal  extends Fenetre{
    private JPanel panelMain;
    private JButton retourButton;
    private JButton btn_lister;
    private JButton btn_creer;
    private JButton btn_editer;
    private JButton btn_associer;
    //  private JButton btn_supprimer;


    /**
     * Instantiates a new Page principal.
     *
     * @param user the user
     */
    public PagePrincipal(Responsable user) {
        super("Accueil",user);
        this.setContentPane(panelMain);

        if (!(PagePrincipal.super.user instanceof Directeur)){
            this.btn_lister.setVisible(false);
        }



        btn_creer.addActionListener(e -> {

            new PageFormulaire(user).setVisible(true);
            PagePrincipal.super.setVisible(false);
        });

        btn_editer.addActionListener(e -> {
            new PageEditer(user).setVisible(true);
            PagePrincipal.super.setVisible(false);
        });

        btn_lister.addActionListener(e -> {
            try {
                new PageListing(user).setVisible(true);
            } catch (EtudiantServiceException etudiantServiceException) {
                String message = etudiantServiceException.getMessage();
                String title = "Liste des éléves";
                int typeMessage = JOptionPane.ERROR_MESSAGE;
                JOptionPane.showMessageDialog(new JFrame(), message, title, typeMessage);
            }
            PagePrincipal.super.setVisible(false);
        });

        retourButton.addActionListener(e -> {
            new PageAuthentification().setVisible(true);
            PagePrincipal.super.setVisible(false);
        });
        btn_associer.addActionListener(e -> {
            try {
                new PageAssocierEtudiant(user).setVisible(true);
            } catch (CoursServiceException coursServiceException) {
                coursServiceException.printStackTrace();
            }
            PagePrincipal.super.setVisible(false);
        });
    }
}
