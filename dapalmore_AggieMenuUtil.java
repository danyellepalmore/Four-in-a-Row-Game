/*Danyelle Palmore
 * 2 October 2022
 * COMP 167 002
 * Print statements that show options for game. Method "menu" called in main program.
 */
package dapalmore_AggieGame;

import java.util.Scanner;

public class dapalmore_AggieMenuUtil {
	
	public static void menu() {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to 'Aggie Game'. On all modes work together to make 4 consecutive X's.");
		System.out.println();
		System.out.println("Pick a mode from the AGGIE MENU");
		System.out.println("s - Single Player Mode");
		System.out.println("m - Multi Player Mode");
		System.out.println("q - Quit");
		System.out.println();
		System.out.print("Your option: ");
	}

	public static void main(String[] args) {
	}
}
