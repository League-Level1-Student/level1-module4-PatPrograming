package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	static char currentLetter;
	static JFrame frame=new JFrame();
	static JLabel label=new JLabel();
	static JPanel panel=new JPanel();
public static void main(String[] args) {
	currentLetter = generateRandomLetter();
	label.setText(currentLetter+"");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	TypingTutor object=new TypingTutor();
	object.method();
}
void method() {
	frame.addKeyListener(this);
	panel.add(label);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}
static char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyChar()==currentLetter){
		System.out.println("Correct");
		panel.setBackground(Color.GREEN);
	}
	else {
		panel.setBackground(Color.red);
	}
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter=generateRandomLetter();
label.setText(currentLetter+"");
}
}
