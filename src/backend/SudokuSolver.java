package backend;

public class SudokuSolver
{
 private static byte[][] arr;
 public static void solveSudoku(byte[][] board)
 {
     arr=board;
     solver(0,0);
 }
 
 private static boolean solver(int i,int j)
 {
     if(j > 8)
     {
         return solver(i+1,0);
     }
     if(i > 8)
     {
         return true;
     }
     
     if(arr[i][j] != 0)
     {
         return solver(i,j+1);
     }
     else
     {
         for(int x=1;x<10;x++)
         {
             byte val = (byte)(x);
             
             if(isValid(i,j,val))
             {
                 arr[i][j]=val;
                 if(solver(i,j+1))
                     return true;
             }
         }

         arr[i][j]=0;
         return false;
     }
 }
 
 private static boolean isValid(int iptr, int jptr,byte val)
 {
     for(int j=0;j<9;j++)
     {
         if(j!=jptr)
         {
             if(arr[iptr][j] == val)
                 return false;
         }
     }
     
     for(int i=0;i<9;i++)
     {
         if(i!=iptr)
         {
             if(arr[i][jptr] == val)
                 return false;
         }
     }
     
     int biptr = ((int)iptr/3)*3;
     int bjptr = ((int)jptr/3)*3;
     
     for(int i=biptr;i<biptr+3;i++)
     {
         if(i!=iptr)
         for(int j=bjptr;j<bjptr+3;j++)
         {
             if(j!=jptr)
             {
                 if(arr[i][j] == val)
                     return false;
             }
         }
     }
     return true;
 }
 
 public static int countSudokuSolutions(byte[][] board)
 {
     arr = new byte[board.length][];
     for(int i=0;i<board.length;i++)
     {
    	 arr[i] = board[i].clone();
     }
     return countSolutions(0,0);
 }
 
 private static int countSolutions(int i, int j)
 {
	 if(j > 8)
     {
         return countSolutions(i+1,0);
     }
     if(i > 8)
     {
         return 1;
     }
     
     if(arr[i][j] != 0)
     {
         return countSolutions(i,j+1);
     }
     else
     {
         int ans=0;
    	 for(int x=1;x<10;x++)
         {
             byte val = (byte)(x);
             
             if(isValid(i,j,val))
             {
                 arr[i][j]=val;
                 ans+=countSolutions(i,j+1);
             }
         }

         arr[i][j]=0;
         return ans;
     }
 }
 
 
 
}