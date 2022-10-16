/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;
import CODE.Equipement;
import CODE.Gamme;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Skander
 */
public class MenuGammes extends JPanel {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JLabel titre;
    public MenuGammes()
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
		titre = new JLabel("Menu Gammes");
		titre.setBounds(75,60,280,25);
		titre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		//titre.setForeground(Color.MAGENTA);
		add(titre);
               
                b1 = new JButton("Gestion Gammes");
		b1.setBounds(25,75,250,65);
		jp.add(b1);
		b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
				 new InterfaceGamme().setVisible(true);
				
		
                }
                    });
			
                   b2 = new JButton("Afficher Gammes");
		b2.setBounds(25,170,250,65);
		jp.add(b2);
		b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
				
				 removeAll();
                                 add(new AfficherGamme());
                                 repaint(); 
		                }
                    });
           
                   
               
                b3= new JButton("<< Retour");
		b3.setBounds(150,285,250,65);
		jp.add(b3);
		
		add(jp);
		
		b3.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				removeAll();
				add(new MenuPrincipal());
				repaint();
				
			}
		});
        }
}