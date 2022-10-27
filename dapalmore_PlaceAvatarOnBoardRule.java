/*Danyelle Palmore
 * 2 October 2022
 * COMP 167 002
 * Methods needed for both single player mode and multi player mode to allow player or computer to place their turn on the board
 * key: avatar is always 'X'
 */
package dapalmore_AggieGame;

import java.util.Random;
import java.util.Scanner;

public class dapalmore_PlaceAvatarOnBoardRule {
	final static int BOARD_SIZE = 10;

		//method checks if position chosen on board is open or not
		public static boolean isValidPosition(char[][] board, int positionRow, int positionColumn) {
			boolean valid = false;
			//when chosen index is a space, then space is open to put avatar down
			if (board[positionRow][positionColumn] == ' ') {
				valid = true;
			}
			//makes sure inputs are in range of game board
			if ((positionRow > BOARD_SIZE) || (positionRow < 0)){
				valid = false;
			}
			if ((positionColumn > BOARD_SIZE) || (positionColumn < 0)) {
				valid = false;
			}
			//boolean to tell if space is open or not when method is called
			return valid;
		}
		
		//method places avatar based on input by running through spaces on board.
		public static void placeAvatar(char[][] board, char playerAvatar, int positionRow, int positionColumn) {
			for (int i = 0; i< BOARD_SIZE;i++) {
				for(int j=0; j<BOARD_SIZE;j++) {
					//runs through all values on board to check when the input values matches the index number. When they match that index will change to the players avatar.
					if (positionRow == i && positionColumn == j) {
						board[i][j] = playerAvatar;
					}// closes if
				}
			}
			//print board with updated character
			dapalmore_AggieBoardUtil.printBoard(board);
		}

		//method that goes through full turn: calls all other methods
		public static void playerValid(char[][] board, boolean valid) {
				Scanner scnr = new Scanner(System.in);
				//loops the turns
				boolean playerTurn = true;
				while (playerTurn == true) {
					
					System.out.println("What row do you want to place on? ");
					int positionRow = scnr.nextInt();
					System.out.println("What column? ");
					int positionColumn = scnr.nextInt();
					//if space available then avatar is placed and players turn is ended then computer turn is startd
					if ((isValidPosition(board, positionRow, positionColumn) == true) && (positionRow < BOARD_SIZE-1) && (positionColumn < BOARD_SIZE-1)){
						placeAvatar(board, 'X', positionRow, positionColumn);
						playerTurn = false;
						if ((dapalmore_ValidWinnerRule.isGameFinished(board, positionRow, positionColumn, "CONGRATS! You and Computer made 4 consecutive X's."))==true) {
							break;
						}
						else {
							computerTurn(board);
						}
					}//closes is valid if
					
					//if not open position then prompt again
					else if ((isValidPosition(board, positionRow, positionColumn) == false)){
						System.out.println();
						System.out.println("row "+positionRow +" column "+ positionColumn+" is not a valid move.");
					}//closes else if
				}//closes while
		}
		
		//method for computer turn
		public static void computerTurn(char[][] board) {
			Random rand = new Random();
			int computerRow;
			int computerColumn;
			
			//when method is called this makes sure the computer uses its turn
			boolean computerTurn = true;
			while (computerTurn == true) {
				
				//computer picks random number for row and column
				computerRow = rand.nextInt(9) + 1;
				computerColumn = rand.nextInt(9) + 1;
				
				System.out.println("Computer is now picking placement...");
				
				//when there is a space then computer will place its avatar
				if (isValidPosition(board, computerRow, computerColumn)== true) {
					placeAvatar(board, 'X', computerRow, computerColumn);
					System.out.println("Computer chose row " +computerRow+ " and column "+computerColumn);
					
					//Makes sure while loop does not run again: indicates end of computers turn
					computerTurn = false;
					if ((dapalmore_ValidWinnerRule.isGameFinished(board, computerRow, computerColumn,"CONGRATS! You and Computer made 4 consecutive X's."))==true) {
						break;
					}
					//starts players turn
					playerValid(board, false);
				}//closes is valid if statement
			}//closes while
		}

	public static void main(String[] args) {
	}
}
