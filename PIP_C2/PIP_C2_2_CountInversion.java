package PIP_C2;

import java.util.Arrays;
import java.util.Scanner;

public class PIP_C2_2_CountInversion {
    public static long count=0;  //global variable
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

            int ans[]=mergeSort(arr,0,arr.length-1);
            System.out.println(count);

    }

    static int[] mergeSort(int arr[],int low,int high)
    {
        if(arr.length==1)
            return arr;

        if(low<high)
        {
            int mid=(low+high)/2;

            int first[]=Arrays.copyOfRange(arr,low,mid+1);
            int second[]=Arrays.copyOfRange(arr,mid+1,high+1);

            first=mergeSort(first,0,first.length-1);
            second=mergeSort(second,0,second.length-1);
            return merge(first,second);
        }
        else
            return new int[0];  //returning an empty array
    }

    static int[] merge(int first[],int second[])
    {
        int mix[]=new int[first.length+second.length];
        int i=0;int j=0; int k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]>second[j])
            {
                count+=first.length-i;
                mix[k++]=second[j++];
            }
            else
                mix[k++]=first[i++];
        }
        while(i<first.length)
        {
            mix[k++]=first[i++];
        }
        while(j<second.length)
        {
            mix[k++]=second[j++];
        }
        return mix;
    }

}
