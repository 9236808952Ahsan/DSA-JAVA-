public class Rat_In_Maze {
    private static void printPaths(int cr,int cc,int er,int ec,String path,boolean[][] vis)
    {
        if(cr>er||cc>ec||cc<0||vis[cr][cc]==true)
        {
            return;
        }
        if(cr==er && cc==ec)
        {
            System.out.println(path);
            return;
        }

        vis[cr][cc]=true;
        // 4 moves
        printPaths(cr,cc,er,ec,path+"U",vis);
        // D

        printPaths(cr+1,cc,er,ec,path+'D',vis);

        // L
        printPaths(cr,cc-1,er,ec,path+"L",vis);
        // R
        printPaths(cr,cc+1,er,ec,path+"R",vis);

    }
    public static void main(String args[])
    {
    int n=3,m=3;
    printPaths(0,0,n-1,m-1,"",new boolean[n][m]);

    }
    
}
