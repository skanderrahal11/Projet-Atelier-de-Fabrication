/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import CODE.Operateur;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuPrincipal  extends JPanel {
	
        private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
        private JButton b5;
        private JButton b6;
        private JButton b7;
        private JButton b8;
	private JLabel titre;
        
        
        
        public MenuPrincipal()
	{
		       	
		setSize(744,572);
		setLayout(null);
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBounds(50,50,600,450);
		jp.setBackground(Color.white);
		//cadre pour mon jpanel
		jp.setBorder(BorderFactory.createLineBorder(Color.gray, 5));
		
		//setBorder(BorderFactory.createTitledBorder("personnage"));
		
		//setPreferredSize(new Dimension(200,200) );
		this.setBorder(BorderFactory.createLineBorder(Color.gray, 5));
		titre = new JLabel("Choix Operation");
		titre.setBounds(75,60,280,25);
		titre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		//titre.setForeground(Color.MAGENTA);
		add(titre);
		
		

                b1 = new JButton("Gestion des salariés");
		b1.setBounds(25,75,250,65);
		jp.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				 removeAll();
                                 add(new MenuGestionSalariés());
                                 repaint(); 
		
				
			} 
		});
                b2 = new JButton("Gestion Equipements");
		b2.setBounds(25,175,250,65);
		jp.add(b2);
		
                
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				                         
                            new InterfaceEquipement().setVisible(true);
				
			}
		});  
                
                
                b6 = new JButton("Menu Gammes");
		b6.setBounds(325,75,250,65);
		jp.add(b6);
	
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				 removeAll();
                                 add(new MenuGammes());
                                 repaint(); 
				
			}
		});
                


/*              b8= new JButton("Gestion Operation");
		b8.setBounds(325,75,250,65);
		jp.add(b8);
		
		add(jp);
		
		b6.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//removeAll();
				//add(new Authentification());
				//repaint();
				
			}
		});
*/
			
                
//              b3 = new JButton("Ajouter Opérateur");
//		b3.setBounds(325,75,250,65);
//		jp.add(b3);
//		b3.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				
//				 removeAll();
//                                 // a replacer par AjoutOperateur
//                                 add(new AjouterOpérateur());
//                                 repaint(); 
//		
//				
//			}
//		});



//                b4 = new JButton("Afficher Opérateur");
//		b4.setBounds(325,175,250,65);
//		jp.add(b4);
//		
//                
//		b4.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				removeAll();
//				add(new AfficherOpérateur());
//				repaint();
//				
//			}
//		});

//              b7= new JButton("Gestion Equipement);
//		b7.setBounds(325,75,250,65);
//		jp.add(b7);
//		
//		add(jp);
//		
//		b7.addActionListener( new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				
//				removeAll();
//				add(new Authentification());
//				repaint();
//				
//			}
//		});
	       




                b5= new JButton("Déconexion");
		b5.setBounds(150,285,250,65);
		jp.add(b5);
		
		add(jp);
		
		b5.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				removeAll();
				add(new Authentification());
				repaint();
				
			}
		});
                
                
                
                
                
		
	
	
	}
    
}
