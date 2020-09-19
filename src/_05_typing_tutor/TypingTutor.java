package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	static char currentLetter;
	static JFrame frame=new JFrame();
	static JLabel label=new JLabel();
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
	frame.add(label);
	frame.pack();
	frame.setVisible(true);
}
static char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
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
