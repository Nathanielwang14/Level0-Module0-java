package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
	
	Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int x = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		
		// 3. Print your variable to the console
	System.out.println(x);
		// 4. Get the user to enter something that they think is awesome
	String liquid = JOptionPane.showInputDialog("Enter something you think is awesome");
		// 5. If your variable is  0
	if(x == 0){
		String test3 = JOptionPane.showInputDialog("SUPER COOL");
	}
	
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if(x == 1){
		String test4 = JOptionPane.showInputDialog("awesome");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if(x == 2){
		String test5 = JOptionPane.showInputDialog("ok");
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	if(x == 3){
		String test6 = JOptionPane.showInputDialog("very boring");
	}
			// -- invent your own message to give to the user (be nice).
	}
}
