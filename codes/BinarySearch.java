package codes;

import java.lang.reflect.Array;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        while(q -- >0)
        {
//            getting the key to find
            int key=sc.nextInt();

            int first[]=new int[1];
            int last[]=new int[1];
            first[0]=-1;
            last[0]=-1;
            binarySearchfirst(arr,0,arr.length-1,key,first);
            binarySearchlast(arr,0,arr.length-1,key,last);

            System.out.println(first[0]+" "+last[0]);

        }
    }

    static void binarySearchfirst(int arr[],int left,int right,int key,int ans[])
    {
        if(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]>=key)
            {
                if(arr[mid]==key)
                    ans[0]=mid;

                binarySearchfirst(arr,left,mid-1,key,ans);
            }
            else
                binarySearchfirst(arr,mid+1,right,key,ans);
        }

    }
    static void binarySearchlast(int arr[],int left,int right,int key,int ans[])
    {
        if(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]<=key)
            {
                if(arr[mid]==key)
                 ans[0]=mid;
                binarySearchlast(arr,mid+1,right,key,ans);
            }
            else
                binarySearchlast(arr,left,mid-1,key,ans);
        }

    }
}
