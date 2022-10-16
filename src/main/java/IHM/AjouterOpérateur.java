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
import CODE.Operateur; // importe la classe operateur du package CODE
import static IHM.AjoutChefAtelier.tfid;

import java.util.ArrayList;


/**
 *
 * @author Skander
 */
public class AjouterOpérateur extends JPanel {
        private JLabel titre;
        private JLabel nom;
	private JLabel id;
	private JLabel prenom;
        private JLabel compétences;
        private  JLabel dispo;
	private JButton annuler;
	private JButton valider; 
        private JTextField tfcompétences;
        private JTextField tfdispo;
	private JTextField tfnom;
	private JTextField tfprenom;
	public static  JTextField tfid;
  static ArrayList<Operateur> listOperateurs ; 
  
  public static String lien(String lien){
    lien = lien; 
    return lien;
        
    }
        
        public AjouterOpérateur(){
            
         
            listOperateurs = new ArrayList();
		System.out.println("Creation liste Operateurs ...");
                
                
                
            setLayout(null);
	setSize(744,572);
	setBorder(BorderFactory.createLineBorder(Color.gray, 5));
	
	JPanel conteneur = new JPanel();
            
	
	titre= new JLabel("Ajouter un Opérateur");
	titre.setBounds(10,15,400,25);
	titre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
	add(titre);
	
	id = new JLabel("Identifiant ");
	id.setBounds(100,70,100,25);
	add(id);
	
	tfid = new JTextField();
	tfid.setBounds(200,70,100,22);
	add(tfid);
	
	nom = new JLabel("Nom ");
	nom.setToolTipText("Nom de l'Opérateur");
	nom.setBounds(100,120,50,25);
	add(nom);
	
	tfnom = new JTextField();
	tfnom.setBounds(200,120,100,22);
	add(tfnom);
	
	prenom = new JLabel("Prénom ");
	prenom.setToolTipText("Prénom de l'Opérateur");
	prenom.setBounds(100,170,100,25);
	add(prenom);
	
	tfprenom = new JTextField();
	tfprenom.setBounds(200,170,100,22);
	add(tfprenom);
        
           dispo = new JLabel("Disponibilité ");
	dispo.setToolTipText("Disponibilité de l'Opérateur");
	dispo.setBounds(100,220,100,25);
	add(dispo);
	
	tfdispo = new JTextField();
	tfdispo.setBounds(200,220,100,22);
	add(tfdispo);
        
            JLabel compétences = new JLabel("Compétences ");
	compétences.setToolTipText("Compétences de l'Opérateur");
	compétences.setBounds(100,270,100,25);
	add(compétences);
	
	tfcompétences = new JTextField();
	tfcompétences.setBounds(200,270,100,22);
	add(tfcompétences);
	
	  
        
	
	valider = new JButton("Valider");
	valider.setBounds(450,500,120,30);
	add(valider);
        valider.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
                    
         Operateur op1;
        String lien ="vide";
        lien=AjouterOpérateur.lien(lien);
         int d  = Integer.valueOf(tfdispo.getText()) ;  
         op1 = new Operateur(tfid.getText(),tfnom.getText(),tfprenom.getText(),d,tfcompétences.getText(),lien);
         listOperateurs.add(op1);
         
         System.out.println(listOperateurs.size());
         
         
         JOptionPane.showMessageDialog(null,"L'opérateur "+ tfid.getText() +" est ajouté avec succès","info", JOptionPane.INFORMATION_MESSAGE);
         System.out.println(op1.AfficherOperateurs());
         
        }
        });
		
			
					
	
		
	annuler= new JButton(" << Retour");
	annuler.setBounds(260,500,120,30);
	add(annuler);
	annuler.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
        removeAll();
	add(new MenuGestionSalariés());
	repaint();
        
	}
	});
		
	}

        }
        
        
    

