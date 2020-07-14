package _08_jack_in_the_box;

import java.awt.Button;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackintheBox {
    public static void main(String[] args) {
    	JFrame f = new JFrame();
    	f.setVisible(true);
    	f.setSize(500, 500);
    	JPanel p = new JPanel();
    	f.add(p);
    	Button b = new Button();
    	b.addActionListener(null);
    	f.add(b);
    }

private void showPicture(String fileName) { 
      try {
           JLabel imageLabel = createLabelImage(fileName);
           JFrame frame = new JFrame();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(imageLabel);
           frame.setVisible(true);
           frame.pack();
      } catch (Exception e) {
           e.printStackTrace();
      }
 }



private JLabel createLabelImage(String fileName) {
     try {
	          URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
           } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
          }
      } catch (Exception e) {
           System.err.println("Could not find image " + fileName);
           return new JLabel();
     }
 }

}
