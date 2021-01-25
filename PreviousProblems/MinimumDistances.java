package PreviousProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumDistances {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int temp=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {  flag=true;
               temp=i-map.get(arr[i]);
               if(temp<min)
                   min=temp;
            }
             map.put(arr[i],i);
        }

        if(flag)
            System.out.println(min);
        else
            System.out.println("-1");
    }

}
