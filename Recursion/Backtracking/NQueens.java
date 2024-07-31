package Recursion.Backtracking;

public class NQueens {
    
    static int queens(boolean[][] board,int row)
    {
        //If row reached to n that means all the 
        //above rows are placed with Queen so print the board
        if(row==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }

        int count=0;
        // placing the queen and checking row and col
        for(int col=0;col<board.length;col++){
           
            //place queen if it is safe
            if(isSafe(board,row,col)){
            board[row][col]=true;
            //recursion call for the next row
            count += queens(board, row+1);
            //change the cell to false after complition of the recusrion
            board[row][col]=false;
            }
        }
        return count;
    }

     private static boolean isSafe(boolean[][] board, int row, int col) {
   
        //vertical row
        for(int i=0;i<row;i++){
           if(board[i][col]){
            return false;
           }
        }
        // diagonal left
        int maxleft = Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        
        //diagonal right
        int maxright = Math.min(row,board.length-col-1);

        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        
        return true;
    }



    private static void display(boolean[][] board) {
         for(boolean[] row : board){
            for(boolean element :row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
         }
    }

    public static void main(String[] args)
     {

        int n=4 ;
         boolean[][]  board = new boolean[n][n];
        System.out.println(queens(board, 0));


     }
}
