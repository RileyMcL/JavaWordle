package wordle;

public class board {
	private char [][] board;
	char secretWordAns[];
	char userAns[];
	
	public board()
	{
		board = new char[5][5];
		initialization();
		
	}
	
	
	public void initialization() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
			{
				board[i][j] = '_';
			}
		}
			
	}
	public boolean isBoardFull() {
		boolean isFull = true;
	
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
			{
				if(board[i][j] == '_') {
					isFull = false;
			}
		
			}
		}
		return isFull;
		
	}
	public char[] getCurrentGuess(char[] ans) {
		return userAns;
	}
	public boolean placeGuess(int row, int col, char[] ans) {
		userAns = ans;
		if ((col >= 0) && (row < 5))
		{
			for(int i = 0; i < 5; i++) {
				System.out.print(userAns[i] + " ");
			if(board[row][i] == '_') {
					
					board[row][i] = userAns[i];
					
				}
			}
			return true;
		}
		
		
		
		
		return false;
		
	}
	
	
	
	public void printboard()
	{
		System.out.println("Welcome to Wordle!");
		System.out.println("---------------------");
		for(int i = 0; i < 5; i++) {
			System.out.print("| ");
			for(int j = 0; j < 5; j++)
			{
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("---------------------");
			
		}
		
	}
}
