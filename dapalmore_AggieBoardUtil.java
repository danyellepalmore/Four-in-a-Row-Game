/*Danyelle Palmore
 * 2 October 2022
 * COMP 167 002
 * Method to print empty board: formatting of board
 */
package dapalmore_AggieGame;

public class dapalmore_AggieBoardUtil {
	//10 always will be size of board throughout program so declare here 
	final static int BOARD_SIZE = 10;
	
		public static void printBoard(char[][] board) {
			//loop shows what number each space index is present
			System.out.print(" ");
			for (int i = 0; i < BOARD_SIZE; i++) {
				System.out.print(" "+(i));
			}
			System.out.println();
			
			//for the 2d array passed in these print statements surround the element at that index
		//if time permitted wouldve done for loop that increase the index column in inner loop then row and print seperations(+-) and number printed in front in outer
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("0|"+board[0][0] + "|" +  board[0][1] + "|" +  board[0][2]+ "|" +  board[0][3] + "|" +  board[0][4]+"|" +  board[0][5] + "|" +  board[0][6]+"|" +  board[0][7] + "|" +  board[0][8]+"|" +  board[0][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("1|"+board[1][0] + "|" +  board[1][1] + "|" +  board[1][2]+ "|" +  board[1][3] + "|" +  board[1][4]+"|" +  board[1][5] + "|" +  board[1][6]+"|" +  board[1][7] + "|" +  board[1][8]+"|" +  board[1][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("2|"+board[2][0] + "|" +  board[2][1] + "|" +  board[2][2]+ "|" +  board[2][3] + "|" +  board[2][4]+"|" +  board[2][5] + "|" +  board[2][6]+"|" +  board[2][7] + "|" +  board[2][8]+"|" +  board[2][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("3|"+ board[3][0] + "|" +  board[3][1] + "|" +  board[3][2]+ "|" +  board[3][3] + "|" +  board[3][4]+"|" +  board[3][5] + "|" +  board[3][6]+"|" +  board[3][7] + "|" +  board[3][8]+"|" +  board[3][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("4|"+board[4][0] + "|" +  board[4][1] + "|" +  board[4][2]+ "|" +  board[4][3] + "|" +  board[4][4]+"|" +  board[4][5] + "|" +  board[4][6]+"|" +  board[4][7] + "|" +  board[4][8]+"|" +  board[4][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("5|"+board[5][0] + "|" +  board[5][1] + "|" +  board[5][2]+ "|" +  board[5][3] + "|" +  board[5][4]+"|" +  board[5][5] + "|" +  board[5][6]+"|" +  board[5][7] + "|" +  board[5][8]+"|" +  board[5][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("6|"+board[6][0] + "|" +  board[6][1] + "|" +  board[6][2]+ "|" +  board[6][3] + "|" +  board[6][4]+"|" +  board[6][5] + "|" +  board[6][6]+"|" +  board[6][7] + "|" +  board[6][8]+"|" +  board[6][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("7|"+board[7][0] + "|" +  board[7][1] + "|" +  board[7][2]+ "|" +  board[7][3] + "|" +  board[7][4]+"|" +  board[7][5] + "|" +  board[7][6]+"|" +  board[7][7] + "|" +  board[7][8]+"|" +  board[7][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("8|"+board[8][0] + "|" +  board[8][1] + "|" +  board[8][2]+ "|" +  board[8][3] + "|" +  board[8][4]+"|" +  board[8][5] + "|" +  board[8][6]+"|" +  board[8][7] + "|" +  board[8][8]+"|" +  board[8][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
			System.out.println("9|"+board[9][0] + "|" +  board[9][1] + "|" +  board[9][2]+ "|" +  board[9][3] + "|" +  board[9][4]+"|" +  board[9][5] + "|" +  board[9][6]+"|" +  board[9][7] + "|" +  board[9][8]+"|" +  board[9][9]+"|");
			System.out.println(" +-+-+-+-+-+-+-+-+-+-+");
		}
	public static void main(String[] args) {
	}
}
