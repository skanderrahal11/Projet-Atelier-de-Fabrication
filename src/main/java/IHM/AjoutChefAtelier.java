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
import CODE.ChefAtelier;

/**
 *
 * @author kader
 */
public class AjoutChefAtelier extends JPanel {    
        
	private JLabel titre;
        private JLabel nom;
	private JLabel id;
	private JLabel prenom;
	private JButton annuler;
	private JButton valider;       
	private JTextField tfnom;
	private JTextField tfprenom;
	public static  JTextField tfid;
        
		
	public AjoutChefAtelier(){
	setLayout(null);
	setSize(744,572);
	setBorder(BorderFactory.createLineBorder(Color.gray, 5));
	
	JPanel conteneur = new JPanel();
	
	titre= new JLabel("Ajouter un chef d'atelier");
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
	nom.setToolTipText("Nom du chef d'atelier");
	nom.setBounds(100,120,50,25);
	add(nom);
	
	tfnom = new JTextField();
	tfnom.setBounds(200,120,100,22);
	add(tfnom);
	
	prenom = new JLabel("Prénom ");
	prenom.setToolTipText("Prénom du chef d'atelier");
	prenom.setBounds(100,170,100,25);
	add(prenom);
	
	tfprenom = new JTextField();
	tfprenom.setBounds(200,170,100,22);
	add(tfprenom);
	
	
	valider = new JButton("Valider");
	valider.setBounds(450,500,120,30);
	add(valider);
	valider.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
                    
         ChefAtelier chef1;
         chef1 = new ChefAtelier(tfid.getText(),tfnom.getText(),tfprenom.getText());
         AfficherChefsAtelier.id = tfid.getText();
         AfficherChefsAtelier.nom = tfnom.getText();
         AfficherChefsAtelier.prenom = tfprenom.getText();
         
         
         JOptionPane.showMessageDialog(null,"Le chef d'atelier "+ tfid.getText() +" est ajouté avec succès","info", JOptionPane.INFORMATION_MESSAGE);
         System.out.println(chef1.AfficherPersonne());
         
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
