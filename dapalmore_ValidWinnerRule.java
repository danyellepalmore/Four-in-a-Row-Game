/*Danyelle Palmore
 * 2 October 2022
 * COMP 167 002
 * Checks if user won and which user won. Loops through all possible win conditions and returns if they win or no as well as checks who placed it
 * Yes, lots of repeated code
 */
package dapalmore_AggieGame;

public class dapalmore_ValidWinnerRule {
	//always size of board
	final static int BOARD_SIZE = 10;

		//new method: checks rows, columns and diagonal to see if player won
		public static boolean hasContestantWon(char[][] board, char symbol, int row, int column) {
			int row1 = 0;
			int column1 = 0;
	
			for (row1 = 0; row1< BOARD_SIZE;row1++) {
				for(column1 = 0; column1 < BOARD_SIZE; column1++) {
					//conditions for win in column
					if (board[row1][column1] == symbol && column1 == column){
						if ((row == 0) && (board[row][column] == symbol && board[row+1][column] == symbol && board[row+2][column] == symbol && board[row+3][column] == symbol)){
							System.out.println("WINNER- 4 in same column");
							return true;
						}
						if ((row == 9) && (board[row][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol && board[row-3][column] == symbol)) {
							System.out.println("WINNER- 4 in same column");
							return true;
						}
						if ((row == 1) && ((board[row][column] == symbol && board[row+1][column] == symbol && board[row+2][column] == symbol && board[row+3][column] == symbol)||
										   (board[row][column] == symbol && board[row-1][column] == symbol && board[row+2][column] == symbol && board[row+1][column] == symbol))){
							System.out.println("WINNER- 4 in same column");
							return true;
						}
						if ((row == 2) && ((board[row][column] == symbol && board[row+1][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol)||
								           (board[row][column] == symbol && board[row+1][column] == symbol && board[row+2][column] == symbol && board[row+3][column] == symbol)||
								           (board[row][column] == symbol && board[row-1][column] == symbol && board[row+2][column] == symbol && board[row+1][column] == symbol))) {
							System.out.println("WINNER- 4 in same column");
							return true;
						}
						if ((row == 8) && ((board[row][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol && board[row-3][column] == symbol)||
								           (board[row][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol && board[row+1][column] == symbol))) {
							System.out.println("WINNER- 4 in same column");
							return true;
						}
						if ((row == 7) && ((board[row][column] == symbol && board[row+1][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol)||
								           (board[row][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol && board[row-3][column] == symbol)||
								           (board[row][column] == symbol && board[row-1][column] == symbol && board[row+2][column] == symbol && board[row+1][column] == symbol))) {
							System.out.println("WINNER- 4 in same column");
							return true;
						}
						else if (((row>2)&&(row<7))&&
								((board[row][column] == symbol && board[row+1][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol)||
								(board[row][column] == symbol && board[row+1][column] == symbol && board[row+2][column] == symbol && board[row+3][column] == symbol)||
								(board[row][column] == symbol && board[row-1][column] == symbol && board[row+2][column] == symbol && board[row+1][column] == symbol)||
								(board[row][column] == symbol && board[row-1][column] == symbol && board[row-2][column] == symbol && board[row-3][column] == symbol))) {
							System.out.println("WINNER- 4 in same column");
							return true;
						}
					}//closes conditions for columns

					//conditions for win in row
					else if (board[row1][column1] == symbol && row1 == row){
						if ((column == 0) && (board[row][column] == symbol && board[row][column+1] == symbol && board[row][column+2] == symbol && board[row][column+3] == symbol)){
							System.out.println("WINNER- 4 in same row");
							return true;
						}
						if ((column == 9) && (board[row][column] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol && board[row][column-3] == symbol)) {
							System.out.println("WINNER- 4 in same row");
							return true;
						}
						if ((column == 1) && ((board[row][column] == symbol && board[row][column+1] == symbol && board[row][column+2] == symbol && board[row][column+3] == symbol)||
										   (board[row][column] == symbol && board[row][column-1] == symbol && board[row][column+2] == symbol && board[row][column+1] == symbol))){
							System.out.println("WINNER- 4 in same row");
							return true;
						}
						if ((column == 2) && ((board[row][column] == symbol && board[row][column+1] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol)||
								           (board[row][column] == symbol && board[row][column+1] == symbol && board[row][column+2] == symbol && board[row][column+3] == symbol)||
								           (board[row][column] == symbol && board[row][column-1] == symbol && board[row][column+2] == symbol && board[row][column+1] == symbol))) {
							System.out.println("WINNER- 4 in same row");
							return true;
						}
						if ((column == 8) && ((board[row][column] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol && board[row][column-3] == symbol)||
								           (board[row][column] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol && board[row][column+1] == symbol))) {
							System.out.println("WINNER- 4 in same row");
							return true;
						}
						if ((column == 7) && ((board[row][column] == symbol && board[row][column+1] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol)||
								           (board[row][column] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol && board[row][column-3] == symbol)||
								           (board[row][column] == symbol && board[row][column-1] == symbol && board[row][column+2] == symbol && board[row][column+1] == symbol))) {
							System.out.println("WINNER- 4 in same row");
							return true;
						}
						else if (((column>2)&&(column<7))&&
								((board[row][column] == symbol && board[row][column+1] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol)||
								(board[row][column] == symbol && board[row][column+1] == symbol && board[row][column+2] == symbol && board[row][column+3] == symbol)||
								(board[row][column] == symbol && board[row][column-1] == symbol && board[row][column+2] == symbol && board[row][column+1] == symbol)||
								(board[row][column] == symbol && board[row][column-1] == symbol && board[row][column-2] == symbol && board[row][column-3] == symbol))) {
							System.out.println("WINNER- 4 in same row");
							return true;
						}
					}//closes conditions for row
					
					//conditions for win in diagonal
					else if (board[row1][column1] == symbol && row == column) {
						if ((column == 0 || row ==0) && (board[row][column] == symbol && board[row+1][column+1] == symbol && board[row+2][column+2] == symbol && board[row+3][column+3] == symbol)){
							System.out.println("WINNER- 4 in same diagonal");
							return true;
						}
						if ((column == 9||row == 9) && (board[row][column] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol && board[row-3][column-3] == symbol)) {
							System.out.println("WINNER- 4 in same diagonal");
							return true;
						}
						if ((column == 1||row == 1) && ((board[row][column] == symbol && board[row+1][column+1] == symbol && board[row+2][column+2] == symbol && board[row+3][column+3] == symbol)||
										   (board[row][column] == symbol && board[row-1][column-1] == symbol && board[row+2][column+2] == symbol && board[row+1][column+1] == symbol))){
							System.out.println("WINNER- 4 in same diagonal");
							return true;
						}
						if ((column == 2||column == 2) && ((board[row][column] == symbol && board[row+1][column+1] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol)||
								           (board[row][column] == symbol && board[row+1][column+1] == symbol && board[row+2][column+2] == symbol && board[row+3][column+3] == symbol)||
								           (board[row][column] == symbol && board[row-1][column-1] == symbol && board[row+2][column+2] == symbol && board[row+1][column+1] == symbol))) {
							System.out.println("WINNER- 4 in same diagonal");
							return true;
						}
						if ((column == 8||row==8) && ((board[row][column] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol && board[row-3][column-3] == symbol)||
								           (board[row][column] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol && board[row+1][column+1] == symbol))) {
							System.out.println("WINNER- 4 in same diagonal");
							return true;
						}
						if ((column == 7||row==7) && ((board[row][column] == symbol && board[row+1][column+1] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol)||
								           (board[row][column] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol && board[row-3][column-3] == symbol)||
								           (board[row][column] == symbol && board[row-1][column-1] == symbol && board[row+2][column+2] == symbol && board[row+1][column+1] == symbol))) {
							System.out.println("WINNER- 4 in same diagonal");
							return true;
						}
						else if ((((column>2)&&(column<7))||((row>2)&&(row<7)))&&
								((board[row][column] == symbol && board[row+1][column+1] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol)||
								(board[row][column] == symbol && board[row+1][column+1] == symbol && board[row+2][column+2] == symbol && board[row+3][column+3] == symbol)||
								(board[row][column] == symbol && board[row-1][column-1] == symbol && board[row+2][column+2] == symbol && board[row+1][column+1] == symbol)||
								(board[row][column] == symbol && board[row-1][column-1] == symbol && board[row-2][column-2] == symbol && board[row-3][column-3] == symbol))) {
							System.out.println("WINNER- 4 in same diagonal");
							return true;
						}
					}//closes diagonal conditions
				}
				
			}
			//if none of the conditions are true then there is no win
			return false;
		}
					
		public static boolean isGameFinished(char[][] board, int row, int column, String playername) {
			
			if ((hasContestantWon(board, 'X', row, column ))==true) {	
				dapalmore_AggieBoardUtil.printBoard(board);
				//winner prompt
				System.out.println(playername);
				return true;
			}
			
			//loops through board to see if theres any blank spots
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (board[i][j] == ' ') {
						return false;
					}//close if
				}
			}
			//if no winner and all spots are full
			dapalmore_AggieBoardUtil.printBoard(board);
			System.out.println("Tie!");
			return true;
		}
		
public static void main(String[] args) {
}
}
