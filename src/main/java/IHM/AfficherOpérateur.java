package IHM;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import CODE.Operateur;
import IHM.MenuGestionSalariés;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AfficherOpérateur extends JPanel {
    
        
	private JLabel titre;
        private JButton annuler;
	private JButton valider;
        private JTable tableau ;
        private JScrollPane js ;
        static String id;
        static String nom;
        static String prenom;
        static String compétences;
        static int dispo;
     
        
       
        
		
	public AfficherOpérateur(){
            
         System.out.println("testtttt");
          System.out.println(AjouterOpérateur.listOperateurs.size());
         
          
          for (int i=0 ; i<= AjouterOpérateur.listOperateurs.size()-1 ; i++)
          {
           System.out.println(AjouterOpérateur.listOperateurs.get(i).AfficherOperateurs());
          
          }
         
//            while (AjouterOpérateur.listOperateurs.iterator().hasNext())
//            {                
//            System.out.println(AjouterOpérateur.listOperateurs.iterator().next().AfficherOperateurs());
//            
//                 }
            
	setLayout(null);
	setSize(744,572);
	setBorder(BorderFactory.createLineBorder(Color.gray, 5));
	
	JPanel conteneur = new JPanel();
	
	titre= new JLabel("Afficher Opérateur");
	titre.setBounds(10,15,400,25);
	titre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
	add(titre);
	
        
    
        DefaultTableModel md = new DefaultTableModel(); 
	md.setColumnIdentifiers(new String []{"ID", "NOM", "PRENOM","Compétences","Disponibilité"});
	
       
	
        
     for (int i=0 ; i<= AjouterOpérateur.listOperateurs.size()-1 ; i++)
          {
              
              
              String disponibilite ="" ; 
              if (AjouterOpérateur.listOperateurs.get(i).Getdispo() ==0 ) {
                     disponibilite = "Non Disponible";} 
              else if (AjouterOpérateur.listOperateurs.get(i).Getdispo()== 1 ) {
                    disponibilite = "Disponible";} 
              
             md.addRow(new Object[]{AjouterOpérateur.listOperateurs.get(i).Getidpersonne(), AjouterOpérateur.listOperateurs.get(i).Getnom(), AjouterOpérateur.listOperateurs.get(i).Getprenom(),disponibilite,AjouterOpérateur.listOperateurs.get(i).compétences});  
            
            
          }
        
        
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
        
	
        