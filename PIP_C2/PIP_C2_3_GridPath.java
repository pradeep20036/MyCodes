package PIP_C2;
import java.util.Scanner;
public class PIP_C2_3_GridPath {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int obs=sc.nextInt();

        boolean grid[][]=new boolean[m][n];
        while(obs-->0)
        {
            int first=sc.nextInt();
            int second=sc.nextInt();
            grid[first-1][second-1]=true; //marking it as obstacle
        }

        gridPath(grid,0,0,m,n);
        System.out.println(count);

    }

    static void gridPath(boolean grid[][],int i,int j,int m,int n){

        if((i==m-1 && j==n-1)|| (i+1==m-1 && j==n-1) || (i==m-1 && j+1==n-1))
        {
            count++;
            return;
        }

//        right move
        if(j+1<n && grid[i][j+1]==false)
        {
            gridPath(grid,i,j+1,m,n);
        }


//        left move
        if(i+1<m && grid[i+1][j]==false)
        {
            gridPath(grid,i+1,j,m,n);
        }

    }

}
