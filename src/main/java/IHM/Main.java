package IHM;

import javax.swing.JFrame;

public class Main extends JFrame {
        	
	public Main() {
	setTitle("Atelier");
	setLayout(null);
	setVisible(true);
	setContentPane(new Authentification()) ;
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(750,600);
	setLocationRelativeTo(null);
	}
        

	
}

    

