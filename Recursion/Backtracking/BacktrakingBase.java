package Backtracking;

import java.util.Arrays;

public class BacktrakingBase {
    

    static void allPathsAllowed(String p,boolean[][] maze,int r, int c)
    {

        if(r==maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
        {
            return;
        }
         
        //Consider this block as path
        maze[r][c]=false;

        if(r<maze.length-1)
        {
            allPathsAllowed(p+'D', maze, r+1, c);
        }

        if(c<maze[0].length-1){
            allPathsAllowed(p+'R', maze, r, c+1);
        }
        if( r>0){
            allPathsAllowed(p+'U', maze, r-1, c);
        }
        if( c>0){
            allPathsAllowed(p+'L', maze, r, c-1);
        }

        //This line is where the function will be over
        //So before the funtion is getting removed 
        //also remove the changes made by this funtion
        maze[r][c]=true;

    }
    
    static void printPathsAllowed(String p,boolean[][] maze,int r, int c , int[][] path,int step)
    {

        if(r==maze.length-1 && c == maze[0].length-1)
        {
            path[r][c]=step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c])
        {
            return;
        }
         
        //Consider this block as path
        maze[r][c]=false;
        path[r][c]=step;

        if(r<maze.length-1)
        {
            printPathsAllowed(p+'D', maze, r+1, c,path,step+1);
        }

        if(c<maze[0].length-1){
            printPathsAllowed(p+'R', maze, r, c+1,path,step+1);
        }
        if( r>0){
            printPathsAllowed(p+'U', maze, r-1, c,path,step+1);
        }
        if( c>0){
            printPathsAllowed(p+'L', maze, r, c-1,path,step+1);
        }

        //This line is where the function will be over
        //So before the funtion is getting removed 
        //also remove the changes made by this funtion
        maze[r][c]=true;
        path[r][c]=0;

    }
   

    public static void main(String[] args)
    {
        boolean[][] arr ={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] a = new int[arr.length][arr[0].length];

        allPathsAllowed("", arr, 0, 0);

      printPathsAllowed("", arr, 0, 0, a, 1);


    }
}
