/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvaMarcusJoaovictorJeferson;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jefer
 */
public class Formulario extends JPanel{
    //Labels to identify the fields
    private JLabel nomeLabel;
    private JLabel emailLabel;
    private JLabel datanascLabel;
    private JLabel numcartLabel;
    private JLabel totalLabel;
    
    JCheckBox visaButton;
    JCheckBox masterButton;
    
    StringBuffer choices;
    JLabel pictureLabel;

    //Strings for the labels
    private static String nomeString = "Nome: ";
    private static String emailString = "Email: ";
    private static String sexoString = "Sexo: ";
    private static String datanascString = "Data Nasc.: ";
    private static String tcartaoString = "Tipo de Cartao";
    private static String numcartString = "Numero Cartao: ";
    private static String totalString = "VIP Monthly Payment: ";
    
    //Fields for data entry
    private JFormattedTextField nomeField;
    private JFormattedTextField emailField;
    
    private JFormattedTextField numcartField;
    private JFormattedTextField totalField;
    
    public Formulario() {
        super(new BorderLayout());
    
    visaButton = new JCheckBox("VISA");
        visaButton.setMnemonic(KeyEvent.VK_V);
        visaButton.setSelected(true);

        masterButton = new JCheckBox("MASTER");
        masterButton.setMnemonic(KeyEvent.VK_M);
        masterButton.setSelected(true);
    
    JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(visaButton);
        checkPanel.add(masterButton);

        add(checkPanel, BorderLayout.LINE_START);
        add(pictureLabel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

    choices = new StringBuffer("VM");

}

    /** Listens to the check boxes. */
    public void itemStateChanged(ItemEvent e) {
        int index = 0;
        Cart V = '-';
        Object source = e.getItemSelectable();

        if (source == visaButton) {
            index = 0;
            V = 'V';
        } else if (source == masterButton) {
            index = 1;
            M = 'M';
        }
    }
}
