package testing;
import backend.*;

public class TestSudokuApp
{
	public static void testGenerateGrid()
	{
		byte[][] board = SudokuGenerator.generateGrid(1245, "Easy");
		for(int row=0;row<9;row++)
		{
			for(int col=0;col<9;col++)
			{
				System.out.print(board[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		System.out.println(SudokuSolver.countSudokuSolutions(board));
	}
}
