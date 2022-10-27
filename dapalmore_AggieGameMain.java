/*Danyelle Palmore
 * 2 October 2022
 * COMP 167 002
 * Displays welcome message and menu for user to choose what they want to do with the game. 
 * Runs methods from other classes and assigns them to a menu option.
 */
package dapalmore_AggieGame;

import java.util.Scanner;

public class dapalmore_AggieGameMain {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			//import menu
			dapalmore_AggieMenuUtil.menu();
			//allows the options to keep running either when game is done or input is invalid
			boolean run = true;
			while (run == true) {
				//users option for menu is stored here
				String userOption = scnr.next();
		
				//choosing "s" allows single player class to run which includes many different classes and methods
				if (userOption.equalsIgnoreCase("s")) {
					dapalmore_SinglePlayerMode.runningSinglePlayer();
				}
				//runs multi player mode class and methods within
				else if (userOption.equalsIgnoreCase("m")) {
					dapalmore_MultiPlayerMode.runningMultiPlayer();
				}
				//exits game
				else if (userOption.equalsIgnoreCase("q")) {
					System.out.println("Thanks for playing!! Aggie Pride!");
					break;
				}
				//when input is not on list will prompt to enter correct oprion
				else {
					System.out.println("Please enter valid option: ");
				}
		}
		//exits the loop that takes menu input
		run = false;
	}//closes method

}//closes class
