import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Prva {
	public static void main(String[] args) {
		JFrame window = new JFrame("GUI 101");
		window.setSize(300, 300);
		Dimension dim = new Dimension(600, 600);
		window.setMaximumSize(dim);
		JPanel panel = new JPanel();
		JButton one = new JButton("one");
		JButton two = new JButton("two");
		panel.add(one);
		panel.add(two);
		window.add(panel);
		ButtonHandler listener = new ButtonHandler();
		one.addActionListener(listener);
		
		window.setVisible(true);
		
	}
	
	static class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("klik");
			JButton b = (JButton)(e.getSource());
			b.setText("kliknuto");
			
		}
		
	}
	

}
