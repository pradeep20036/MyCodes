package PIP_C2;
import java.util.Scanner;

public class PIP_C2_1_SubsetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();
            int target=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            if(checkSubsetSum(arr,target))
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }

    static boolean checkSubsetSum(int arr[],int target)
    {
//        prepare the dp
        boolean dp[][]=new boolean[arr.length+1][target+1];

        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(j==0)
                    dp[i][j]=true;
            }
        }
//        dp has been prepared
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                 else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[arr.length][target];
    }


}
