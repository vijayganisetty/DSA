package Backtracking;

import java.util.ArrayList;

//Maze problem  bascis
public class Basics
{
    //Counting number of possible ways
    //33 to 11
    static int countWays(int r,int c){

        if(r==1 || c==1){
            return 1;
        }

        int left = countWays(r-1,c);
        int right = countWays(r, c-1);

        return left+right;
    }

    //Print all paths available to travel from 33 to 11
    static void printPath(String p,int r,int c)
    {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printPath(p+'D', r-1, c);
        }
        if(c>1){
            printPath(p+'R', r, c-1);
        }
    }

    // Return all the paths as ArrayList
    static ArrayList<String> returnPath(String p,int r,int c)
    {
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(returnPath(p+'D', r-1, c));
        }
        if(c>1){
           ans.addAll(returnPath(p+'R', r, c-1));
        }
        return ans;
    }
    //also have possiblity to travel diagonally
    static ArrayList<String> returnDiagonalPath(String p,int r,int c)
    {
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1 && c>1)
        {
            ans.addAll(returnDiagonalPath(p+'D', r-1, c-1));
        }

        if(r>1){
            ans.addAll(returnDiagonalPath(p+'V', r-1, c));
        }
        if(c>1){
           ans.addAll(returnDiagonalPath(p+'H', r, c-1));
        }
        return ans;
    }

    //start at 00 and end 22
    static void printWays(String p,int r,int c)
    {
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }
        if(r<2){
            printWays(p+'D', r+1, c);
        }
        if(c<2){
            printWays(p+'R', r, c+1);
        }
    }

    //Maze with obsticals
    //similar to above methods
    static void mazeWithObs(String p,int r,int c)
    {
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }
        if(r==1 && c==1){
            return;
        }
        if(r<2){
            mazeWithObs(p+'D', r+1, c); 
        }
        if(c<2){
            mazeWithObs(p+'R', r, c+1);
        }
    }

    // same as above but we give entire boolean array as input
    static void pathWithRestrict(String p,boolean[][] maze ,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathWithRestrict(p+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathWithRestrict(p+'R', maze,r, c+1);
        }
    }
    public static void main(String[] args)
    {
        // System.out.println(countWays(3, 3)); 
        // printPath("", 3,3); 
        // System.out.println(returnPath("", 3, 3));
        // System.out.println(returnDiagonalPath("", 3, 3));   
        // printWays("",0, 0); 
        // mazeWithObs("",0,0);
        boolean[][] arr ={
            {true,true,true},
            {true,true,false},
            {true,true,true},
        };
        pathWithRestrict("", arr, 0, 0);
    }       
 
}