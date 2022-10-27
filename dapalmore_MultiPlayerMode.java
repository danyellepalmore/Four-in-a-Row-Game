package dapalmore_AggieGame;

import java.util.Scanner;

public class dapalmore_MultiPlayerMode {

	public static void runningMultiPlayer(){
		Scanner scnr = new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to MULTI player mode. You are battling against Player 2 to place the 4th consecutive X down");
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
		
		//first players turn is activated when first starting
		boolean player1turn = true;
		//keeps player1 and player2 turns looping
		boolean x = true;
		while(x) {
			while(player1turn==true) {
				//same method calls as single player
				System.out.println("Player 1 what row do you want to place? ");
				int positionRow = scnr.nextInt();
				System.out.println("What column? ");
				int positionColumn = scnr.nextInt();
				
				if (dapalmore_PlaceAvatarOnBoardRule.isValidPosition(board, positionRow, positionColumn) == true){
					dapalmore_PlaceAvatarOnBoardRule.placeAvatar(board, 'X', positionRow, positionColumn);
					//ends player1 turn
					player1turn = false;
					if ((dapalmore_ValidWinnerRule.isGameFinished(board, positionRow, positionColumn, "Player 1 wins because they put the last X down"))==true) {
						break;
					}
				}//closes outer if
				else if ((dapalmore_PlaceAvatarOnBoardRule.isValidPosition(board, positionRow, positionColumn) == false)){
					System.out.println();
					System.out.println("row "+positionRow +" column "+ positionColumn+" is not a valid move.");
				}
			//activates player 2 turn. rest is same as above
			boolean player2turn = true;
			while (player2turn==true) {
			System.out.println("Player 2 what row do you want to place? ");
			int positionRow2 = scnr.nextInt();
			System.out.println("What column? ");
			int positionColumn2 = scnr.nextInt();
			if (dapalmore_PlaceAvatarOnBoardRule.isValidPosition(board, positionRow2, positionColumn2) == true){
				dapalmore_PlaceAvatarOnBoardRule.placeAvatar(board, 'X', positionRow2, positionColumn2);
				if ((dapalmore_ValidWinnerRule.isGameFinished(board, positionRow2, positionColumn2, "Player 2 wins because they put the last X down"))==true) {
					break;
				}
				//player 2 turn ends
				player2turn = false;
				//player 1 turn begins again
				player1turn = true;
			}
			else if ((dapalmore_PlaceAvatarOnBoardRule.isValidPosition(board, positionRow2, positionColumn2) == false)){
				System.out.println();
				System.out.println("row "+positionRow2 +" column "+ positionColumn2+" is not a valid move.");
			}
			}//closes player 2 turn

		}//closes player 1 turn
			//stops outer while loop
			x=false;
		}//closes outer while loop
		
		System.out.println("--------------------------------------");
		dapalmore_AggieMenuUtil.menu();	
}//closes method
	
	public static void main(String[] args) {
		//runs multi player mode by itself
		dapalmore_MultiPlayerMode.runningMultiPlayer();
	}
}
