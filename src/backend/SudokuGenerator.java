package backend;
import java.util.*;

public class SudokuGenerator
{
	//We will fill cells of 3 diagonal grids of 3X3 using a random seed
	public static byte[][] generateBaseGrid(long seed)
	{
		Random random = new Random(seed);
		byte[][] board = new byte[9][9];
		HashSet<Integer> set;
		int rnum = 0;
		
		for(int grid=0; grid<3; grid++)
		{
			set = new HashSet<>();
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					int row = 3*grid+i;
					int col = 3*grid+j;
					
					//Assign any unique random value to each cell of the grid
					rnum = (1+random.nextInt(9));
					while(set.contains(rnum))
					{
						rnum = (1+random.nextInt(9));
					}
					set.add(rnum);
					board[row][col] = (byte)rnum;
				}
			}
		}
		
		SudokuSolver.solveSudoku(board);
		return board;
	}
	
}
