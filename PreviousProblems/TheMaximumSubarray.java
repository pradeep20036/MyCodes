package PreviousProblems;

import java.util.Scanner;

public class TheMaximumSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        { int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
          subArraySum(arr);
        }

    }
    public static void subArraySum(int arr[])
    {
//        there are two task
//        1. maximum subarray sum
//        2. maximum subsequence sum
        int sumarray=sumArray(arr);
        int sumsequence=sumsequence(arr);

        System.out.println(sumarray+" "+sumsequence);

    }

    public static int sumArray(int arr[])
    {
//        use kadane's algorithm
        int osum=Integer.MIN_VALUE;
        int csum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(csum<0)
            {
                csum=arr[i];
            }
            else
            {
                csum+=arr[i];
            }

            if(csum>osum)
            {
                osum=csum;
            }
        }
        return osum;
    }


    public static int sumsequence(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i: arr)
        {
            if(i>0)
            {
             sum+=i;
            }
            if(i>max)
            {
                max=i;
            }
        }
        if(sum>0)
            return sum;
        else
            return max;

    }

}
