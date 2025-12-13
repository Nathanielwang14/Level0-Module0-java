package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int health = 0;
			// playerHealth to store your health - set it equal to 100
		health += 100;
			// dragonHealth to store the dragon's health - set it equal to 100
		int dragonHealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int attackstrength = 0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
		int Dragonstrength = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
		int playerstrength = 0;
		
		int playerbuff = 0;
		
		boolean buffattack = false;

		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String quest = JOptionPane.showInputDialog("Do you want to attack the dragon with a yell or kick?");

				// 4. If they typed in "yell":
			if (quest.equals("yell")) {
				JOptionPane.showMessageDialog(null, "buff is applied on next attack");
				buffattack = true;
			}
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
				// 5. If they typed in "kick":
			if (quest.equals("kick")) {
				playerstrength = ran.nextInt(25);
				if (buffattack = true) {
					playerstrength += ran.nextInt(15);
				}
			}
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
		
				// 6. Subtract the player attack value from the dragon's health
			dragonHealth -= playerstrength;
			JOptionPane.showMessageDialog(null, dragonHealth);

			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
			Dragonstrength = ran.nextInt(35);
				// 8. Subtract the dragon attack value from the player's health
			health -= Dragonstrength;
			// ASSESS THE DAMAGE
			JOptionPane.showMessageDialog(null, health);
				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
			if (health <= 0) {
				JOptionPane.showMessageDialog(null, "player lost i hate this game");
				playerLost();
			}
				
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
			if (dragonHealth <= 0) {
				JOptionPane.showMessageDialog(null, "dragon lost L dragon");
				dragonLost();
			}
			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure


		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!

		System.exit(0);   //This code ends the program
	}

}
