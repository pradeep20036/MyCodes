package PreviousProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CountingSort {
    public static void main(String[] args) {

//        diagonal traversal of a matrix;
        int mat[][]=mat = new int[][]{{5,4,3}, {6,5,4}, {8,7,6}};

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

//        printing upper diagonal
        for(int g=0;g<mat[0].length;g++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0,j=0;j+g<mat[0].length && i<mat.length;j++,i++)
            {
                System.out.print(mat[i][j+g]+" ");
                temp.add(mat[i][j+g]);

            }
            System.out.println();
            ans.add(temp);
        }

//        printing lower diagonal

        for(int g=1;g<mat.length;g++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0,j=0;j<mat[0].length && i+g<mat.length;j++,i++)
            {
                System.out.print(mat[i+g][j]+" ");
                temp.add(mat[i+g][j]);
            }
            System.out.println();
            ans.add(temp);
        }

//        sorting all the arraylists and again putting back the results back into the array.
//
        for(ArrayList<Integer> temp: ans)
        {
            Collections.sort(temp);
        }

//        System.out.println(ans);

//    putting the value back into array


//        printing upper diagonal
        int index=0;
        for(int g=0;g<mat[0].length;g++)
        {
            ArrayList<Integer> temp=ans.get(index++);
            int tempIndex=0;
            for(int i=0,j=0;j+g<mat[0].length && i<mat.length;j++,i++)
            {
                mat[i][j+g]=temp.get(tempIndex++);
            }
        }

//        printing lower diagonal
        for(int g=1;g<mat.length;g++)
        {
            ArrayList<Integer> temp=ans.get(index++);
            int tempIndex=0;
            for(int i=0,j=0;j<mat[0].length && i+g<mat.length;j++,i++)
            {
                mat[i+g][j]=temp.get(tempIndex++);
            }
            System.out.println();
            ans.add(temp);
        }

//      display matrix

    for(int i=0;i<mat.length;i++)
    {
        for(int j=0;j<mat[0].length;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }



    }

    public static void partition(int arr[],int pivot)
    {
//        the work of partition method is to put the pivot element at its correct position.
        int temp1=arr[arr.length-1];
        arr[arr.length-1]=arr[pivot];
        arr[pivot]=temp1;

        pivot=arr.length-1;

        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<arr[pivot])
            {
//              swap arr i and j
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
//        swap i and pivot
        int temp=arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=temp;


    }




    public static void countingSort(int arr[])
    {
//       to store the frequency array we should have store it in an array.
        int freq[]=new int[300];

        for(int i: arr)
        {
            freq[i]++;
        }

        int k=0;
        for(int i=0;i<freq.length;i++)
        {
            while(freq[i]-->0)
                arr[k++]=i;
        }

        for(int p: arr)
        {
            System.out.print(p+" ");
        }

    }


}

