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
import CODE.Machine; // importe la classe machine du package CODE
import static IHM.AjoutChefAtelier.tfid;

import java.util.ArrayList;

/**
 *
 * @author Babar
 */
public class AjouterMachine extends JPanel{
    private JLabel titre;
        private JLabel ref;
	private JLabel id;     
        private JLabel cout;
        private JLabel durée;
        private JLabel xposition;
        private JLabel yposition;
        private JLabel type;
        private JLabel état;
        private JButton annuler;
	private JButton valider;
        public static  JTextField tfid;
        public static  JTextField tfref;
        public static  JTextField tfcout;
        public static  JTextField tfdurée;
        public static  JTextField tftype;
        public static  JTextField tfxposition;
        public static  JTextField tfyposition;
        public static  JTextField tfétat;
  static ArrayList<Machine> listeMachine ; 
    
    
    public AjouterMachine(){
                  
           
		
	}
    
}
