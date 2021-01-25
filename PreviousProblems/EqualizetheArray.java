package PreviousProblems;

import java.util.Scanner;

public class EqualizetheArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
//        frequency array
        int freq[]=new int[101];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
//        finding out the frequency of most frequent element
        int max=0;
        for(int i: freq)
        {
            if(i>max)
                max=i;
        }
        System.out.println(arr.length-max);
    }
}
