package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	static JButton button=new JButton();
	static JButton button1=new JButton();
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
public static void main(String[] args) {
button.setText("Trick");
button1.setText("Treat.");
NastySurprise actions=new NastySurprise();
actions.action();
}
public void action(){
	button.addActionListener(this);
	button1.addActionListener(this);
	panel.add(button);
	panel.add(button1);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button) {
		showPictureFromTheInternet("https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/12231413/Labrador-Retriever-MP.jpg");
	}
	if(e.getSource()==button1) {
		showPictureFromTheInternet("https://images2.minutemediacdn.com/image/upload/c_fill,g_auto,h_1248,w_2220/v1555451599/shape/mentalfloss/istock_000008208368_small.jpg?itok=ezJlv0IU");
	}
}
}
