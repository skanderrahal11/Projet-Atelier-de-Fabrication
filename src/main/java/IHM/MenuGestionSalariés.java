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


public class MenuGestionSalariés  extends JPanel {
	
        private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
        private JButton b5;
	private JLabel titre;
        
        
        
        public MenuGestionSalariés()
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
		titre = new JLabel("Choix Operation Salariés");
		titre.setBounds(75,60,280,25);
		titre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		//titre.setForeground(Color.MAGENTA);
		add(titre);
		
		

                b1 = new JButton("Ajouter Chef d'atelier");
		b1.setBounds(25,75,250,65);
		jp.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				 removeAll();
                                 add(new AjoutChefAtelier());
                                 repaint(); 
		
				
			}
		});
                b2 = new JButton("Afficher chef d'atelier");
		b2.setBounds(25,175,250,65);
		jp.add(b2);
		
                
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new AfficherChefsAtelier());
				repaint();
				
			}
		});
               
			
                
                b3 = new JButton("Ajouter Opérateur");
		b3.setBounds(325,75,250,65);
		jp.add(b3);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				 removeAll();
                                 // a replacer par AjoutOperateur
                                 add(new AjouterOpérateur());
                                 repaint(); 
		
				
			}
		});
                b4 = new JButton("Afficher Opérateur");
		b4.setBounds(325,175,250,65);
		jp.add(b4);
		
                
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new AfficherOpérateur());
				repaint();
				
			}
		});
               
                
                b5= new JButton("<< Retour");
		b5.setBounds(150,285,250,65);
		jp.add(b5);
		
		add(jp);
		
		b5.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				removeAll();
				add(new MenuPrincipal());
				repaint();
				
			}
		});
		
	
	
	}
    
}
