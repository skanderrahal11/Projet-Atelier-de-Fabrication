/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import CODE.Gamme;
import static IHM.AjoutChefAtelier.tfid;

import java.util.ArrayList; // voir ce qui est nécessaire et pk
/**
 *
 * @author Babar
 */
public class AjouterGamme extends JPanel {
    
     private JLabel titre;
       	private JLabel id;
        private JLabel ref;
        private JLabel listeéquipement;
        private JLabel listeopération;
	private JButton annuler;
	private JButton valider; 
        private JTextField tfid;
        private JTextField tfref;
        
	//private JTextField tfnom;
	//private JTextField tfprenom;
	// public static  JTextField tfid;
  static ArrayList<Gamme> listeGamme ; 
    
    
    
    
    
    
}
