package backend;
import java.util.*;

public class SudokuGenerator
{
	//We will fill cells of 3 diagonal grids of 3X3 using a random seed
	private static Random random;
	private static byte[][] board;
	private static HashSet<Integer> set;
	private static int rnum;
	private static void generateBaseGrid(long seed)
	{
		random = new Random(seed);
		board = new byte[9][9];
		
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
	}
	
	public static byte[][] generateGrid(long seed,String level)
	{
		generateBaseGrid(seed);
		int num=0;	//number of digits to be removed from solved board
		if(level == "Easy")
		{
			num = 43;
		}
		
//		while(SudokuSolver.countSudokuSolutions(board)!=1)
//		{
//			
//		}
		set = new HashSet<>();
		int row=0,col=0;
		for(int i=0;i<num;i++)
		{
			rnum = random.nextInt(81);
			while(set.contains(rnum))
			{
				rnum = random.nextInt(81);
			}
			set.add(rnum);
			row = rnum/9;
			col = rnum%9;
			board[row][col] = (byte)0;
		}
		return board;
	}
	
}
