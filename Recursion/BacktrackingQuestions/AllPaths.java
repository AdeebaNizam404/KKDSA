package Recursion.BacktrackingQuestions;

public class AllPaths {
    public static void main(String[] args){
    boolean[][] board={
        {true,true,true},
        {true,true,true},
        {true,true,true}
    };
    allPaths("",board,0,0);
    }
    static void allPaths(String p,boolean[][]maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }if(!maze[r][c]){
            return;
        }
        //considering this block in path
        maze[r][c]=false;
        if(r<maze.length-1){
            allPaths(p+'D',maze,r+1,c);
        } 
        if(c<maze[0].length-1){
       allPaths(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPaths(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPaths(p+'L',maze,r,c-1);
        }
        //before the function gets over,remove the changes made by this function call;
        maze[r][c]=true;
        }
}

