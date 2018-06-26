package listeners;

import javax.swing.*;
import java.awt.event.*;
import java.security.PublicKey;

public class Teste {
	
	public Teste() {
		frame();
	}
	
	public void frame() {
		JFrame f = new JFrame("Tela incial");
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		JButton b1 = new JButton("Action Listener");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Action listener em execução");
			}
		});
		
		p.add(b1);
		f.add(p);
	}

}
