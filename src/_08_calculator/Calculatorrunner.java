package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculatorrunner implements ActionListener {
public static void main(String[] args) {
Calculatorrunner runner=new Calculatorrunner();
runner.createUI();
}
void createUI() {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	JPanel panel=new JPanel();
	JLabel label=new JLabel();
	JTextField text=new JTextField();
	JTextField text1=new JTextField();
	JButton button=new JButton();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(label);
	panel.add(text);
	panel.add(text1);
	frame.add(panel);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Click");
}
}
