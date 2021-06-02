package testing;
import backend.SudokuGenerator;

public class TestSudokuApp
{
	public static void testGenerateBaseGrid(String[] args)
	{
		byte[][] board = SudokuGenerator.generateBaseGrid(1245);
		for(int row=0;row<9;row++)
		{
			for(int col=0;col<9;col++)
			{
				System.out.print(board[row][col]+" ");
			}
			System.out.println();
		}
	}
}
