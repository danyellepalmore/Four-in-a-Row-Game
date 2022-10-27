/*Danyelle Palmore
 * 2 October 2022
 * COMP 167 002
 * Displays welcome message and board for single game mode. 
 * Runs methods from other classes to all together run game.
 */
package dapalmore_AggieGame;

import java.util.Scanner;

public class dapalmore_SinglePlayerMode {
	
	public static void runningSinglePlayer(){
		Scanner scnr = new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to SINGLE player mode. You and the computer are working to make 4 consecutive X's");
		System.out.println();
		
		//character spaces stored so they can be changed with character inputs and stored in arrays
		char[][] board =   {{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '}, 
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '},
							{' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' ',' '}};
		
		dapalmore_AggieBoardUtil.printBoard(board);
		//loops through turn for computer and player to get input and place it on board
		dapalmore_PlaceAvatarOnBoardRule.playerValid(board, false);
		//end of game, menu is printed, user picks option
		System.out.println("--------------------------------------");
		dapalmore_AggieMenuUtil.menu();	
	}
	
	public static void main(String[] args) {
		//run single game mode by itself
		dapalmore_SinglePlayerMode.runningSinglePlayer();
	}
}


