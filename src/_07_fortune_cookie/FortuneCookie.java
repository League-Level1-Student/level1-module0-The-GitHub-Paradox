package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button Clicked");
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setVisible(true);
		JButton button = new JButton();
		f.add(button);
		f.pack();
		button.addActionListener(this);
		int rand = new Random().nextInt(5);
		if(rand == 0 ) {
			JOptionPane.showInputDialog("You will be ran over by a car lmao bad");
		}
		if(rand == 1) {
			JOptionPane.showInputDialog("The fortune is in another cookie");
		}
		if(rand == 2) {
			JOptionPane.showInputDialog("You will soon see the most hideous creature on Earth once you look in the mirror");
		}
		if(rand == 3) {
			JOptionPane.showInputDialog("Your next haircut will consist of a lawnmower and a camel");
		}
	}
	
	public static void main(String[] args) {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showInputDialog("Woohoo");
		
	}
}
