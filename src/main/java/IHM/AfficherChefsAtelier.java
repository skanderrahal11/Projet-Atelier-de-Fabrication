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
import javax.swing.table.DefaultTableModel;

public class AfficherChefsAtelier extends JPanel {
    
        
	private JLabel titre;
       
	
           
	private JButton annuler;
	private JButton valider;
        private JTable tableau ;
        private JScrollPane js ;
        static String id;
        static String nom;
        static String prenom;
     
        
	
        
		
	public AfficherChefsAtelier(){
	setLayout(null);
	setSize(744,572);
	setBorder(BorderFactory.createLineBorder(Color.gray, 5));
	
	JPanel conteneur = new JPanel();
	
	titre= new JLabel("Afficher  chef d'atelier");
	titre.setBounds(10,15,400,25);
	titre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
	add(titre);
	
        
        
        
        
    
        DefaultTableModel md = new DefaultTableModel(); 
	md.setColumnIdentifiers(new String []{"ID", "NOM", "PRENOM"});
	md.addRow(new Object[]{id, nom, prenom});  
	tableau = new JTable(md);
	add((tableau));
			
			
        js=new JScrollPane();
	js.setBounds(230,260,400,100);
	js.setViewportView(tableau);
	add(js);
			
	
	
	
	valider = new JButton("Valider");
	valider.setBounds(450,500,120,30);
	add(valider);
	valider.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
                    
        
         System.out.println();
         
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
        
	
        