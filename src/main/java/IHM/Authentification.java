package IHM;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Authentification extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titre;
	private JLabel log; 
	private JLabel pas;
	private JTextField tflog;
	private JPasswordField tfpas;
	private JButton boutonA;
	public Authentification()
	{
		setLayout(null);
		setSize(744,572);
		setVisible(true);
		
		//bordure Jpanel
		this.setBorder(BorderFactory.createLineBorder(Color.gray, 5));
		titre = new JLabel("BIENVENUE ");
		titre.setBounds(50,60,280,25);
		titre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		//titre.setForeground(Color.MAGENTA);
		add(titre);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBounds(200,150,350,300);
		jp.setBackground(Color.white);
		jp.setBorder(BorderFactory.createLineBorder(Color.gray, 5));
		
		log = new JLabel("Login ");
		log.setBounds(80,100,80,25);
		jp.add(log);
		
		tflog = new JTextField("atelier");
		tflog.setBounds(150,100,100,25);
		jp.add(tflog);
		
		pas = new JLabel("Password");
		pas.setBounds(80,150,100,25);
		jp.add(pas);
		
		tfpas = new JPasswordField();
		tfpas.setBounds(150,150,100,25);
		jp.add(tfpas);
		
		boutonA = new JButton("Authentifier");
		boutonA.setBounds(120,220,100,30);
		jp.add(boutonA);
		
		add(jp);
		boutonA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s ,w;
				s= tfpas.getText();
				w="1234";
				if (s.equals(w)){
					removeAll();
					add(new MenuPrincipal());
					repaint();
				}
				else{
					JOptionPane.showMessageDialog(null,"Mot de passe invalide","ERREUR",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null,"le Mot De Passe est 1234","pasword",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		
	}

}
