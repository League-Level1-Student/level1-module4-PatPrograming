package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
ChuckleClicker name=new ChuckleClicker();
name.makeButtons();
}
JButton jokeButton=new JButton();
JButton button1=new JButton();
 void makeButtons(){
	JOptionPane.showMessageDialog(null, "Make Buttons.");
	JFrame frame=new JFrame();
	frame.show();
	JPanel panel=new JPanel();
	jokeButton.setText("Joke");
	button1.setText("Punchline");
	frame.add(panel);
	panel.add(jokeButton);
	panel.add(button1);
	frame.pack();
	jokeButton.addActionListener(this);
	button1.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Hi.");
	if(e.getSource() == jokeButton) {
		JOptionPane.showMessageDialog(null, "Why is 6 afraid of 7? Because 7 8(ate) 9!");
	}
if(e.getSource()==button1) {
	JOptionPane.showMessageDialog(null, "Why does Waldo wear stipes? Because he doesn't want to be spotted.");
}
}

}
