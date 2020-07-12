package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.sun.org.apache.xpath.internal.operations.Variable;



public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String s = new String("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/a345381a-cc8e-43f2-979c-bfcced7ae0a5/d7kjjuq-f394bcce-311a-464e-af61-bd8cd59cd476.jpg/v1/fill/w_640,h_480,q_75,strp/scp_087_b_cheshire_smile_entity_by_toonlink682_d7kjjuq-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3siaGVpZ2h0IjoiPD00ODAiLCJwYXRoIjoiXC9mXC9hMzQ1MzgxYS1jYzhlLTQzZjItOTc5Yy1iZmNjZWQ3YWUwYTVcL2Q3a2pqdXEtZjM5NGJjY2UtMzExYS00NjRlLWFmNjEtYmQ4Y2Q1OWNkNDc2LmpwZyIsIndpZHRoIjoiPD02NDAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.o2-c-JuDfm1UKMXtc3il7ZQaBkgRQELU7wJ9wZllFHI");
		// 2. create a variable of type "Component" that will hold your image
Component c;
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
