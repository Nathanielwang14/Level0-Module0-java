package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int x = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String answer = JOptionPane.showInputDialog("What color is the color red");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if (answer.equals("red")) {
					x += 1;
				}
			
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String answer1 = JOptionPane.showInputDialog("What color is the color blue");
			
			if (answer1.equals("blue")) {
				x += 1;
			}
		
	String answer2 = JOptionPane.showInputDialog("What is 1+1");
			
			if (answer2.equals("2")) {
				x += 1;
			}
			
	String answer3 = JOptionPane.showInputDialog("Simplify x^2 + 6x + 9");
			
			if (answer3.equals("(x+3)^2")) {
				x += 1;
			}
		
		JOptionPane.showMessageDialog(null, x);
		// After all the questions have been asked, tell the user their final score 
		
	}
}
