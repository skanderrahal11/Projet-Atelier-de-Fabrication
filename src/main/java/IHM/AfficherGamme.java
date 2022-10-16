/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;


import CODE.Atelier;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import CODE.Operateur;
import IHM.MenuGestionSalariés;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Skander
 */
public class AfficherGamme extends JPanel {
    
        private JLabel dGamme;
        private JLabel refGamme;
        private JLabel total;
        private JTextField tftotal;
	private JButton retour;
	private JButton Afficher; 
        private JTextField tfcrefGamme;
        private JTextField tfcdGamme;
        private JTable tableau ;
        private JScrollPane js ;
     
        
        public AfficherGamme(){
              
        setLayout(null);
	setSize(744,572);
	setBorder(BorderFactory.createLineBorder(Color.gray, 5));

            
	
	refGamme= new JLabel("Entrez la référence de la gamme : ");
	refGamme.setBounds(100,50,400,25);
	refGamme.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
	add(refGamme);
        
        
        tfcrefGamme = new JTextField();
	tfcrefGamme.setBounds(450,50,100,25);
	add(tfcrefGamme);
        
        tfcdGamme = new JTextField();
	tfcdGamme.setBounds(450,20,100,25);
	add(tfcdGamme);
        
        dGamme= new JLabel("Entrez la désignation de la gamme : ");
	dGamme.setBounds(100,20,400,25);
	dGamme.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
	add(dGamme);
        
        	
	total= new JLabel("COUT TOTAL OPERATIONS ");
	total.setBounds(150,450,450,25);
	total.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
	add(total);
         total.setVisible(false);
        
		
	tftotal = new JTextField();
	tftotal.setBounds(400,450,100,25);
	add(tftotal);
        tftotal.setVisible(false);
	
	
        DefaultTableModel md = new DefaultTableModel(); 
        md.setColumnIdentifiers(new String []{"REF OPERATION", "DESIGNATION OPERATION", "REF MACHINE","COUT","DUREE","COUT TOTAL OPERATION"});
        
        
	
	Afficher = new JButton("Afficher Gamme");
	Afficher.setBounds(450,150,200,30);
	add(Afficher);
        Afficher.addActionListener(new java.awt.event.ActionListener() {
	
         public void actionPerformed(java.awt.event.ActionEvent e) {
                   float sommeLignes = 0  ;
       try{
     
          
          String ligne;
          //Ouverture:Lecture fichier
          BufferedReader fichier=new BufferedReader(new FileReader(Atelier.lien()+"Gammes\\"+tfcdGamme.getText()+"("+tfcrefGamme.getText()+").txt"));
          //Lecture
         
          while ((ligne=fichier.readLine())!=null){
              String [] operations = ligne.split("=");
    
              int i = 0;
              for (i=0 ; i<operations.length ; i++){
                  String [] contenu = operations[i].split("-") ;
                  float produit = Float.valueOf(contenu[4])*Float.valueOf(contenu[3]); 
                  sommeLignes = sommeLignes + produit;
                 
              
              }
             
         }
           //Fermeture
           fichier.close();
      }
      catch(Exception e1){
          System.out.println(e1.getStackTrace());
      }
      
        tableau = new JTable(md);
        tableau.repaint();
        add((tableau));
        js=new JScrollPane();
	js.setBounds(50,260,650,100);
	js.setViewportView(tableau);
	add(js);
        tftotal.setText(String.valueOf(sommeLignes));
        tftotal.setVisible(true);
        total.setVisible(true);
       
   }
  });   
        
        retour= new JButton(" << Retour");
	retour.setBounds(260,500,120,30);
	add(retour);
        
	retour.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
        removeAll();
	add(new MenuGammes());
	repaint();
        
	}
	});
		
	}

     }
        

