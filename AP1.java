import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;



class AP1 {

    public static void main(String[] args) {


        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr);

        arr.add(1,100);
        arr.remove(2);

//        arr.add(arr.size()-1,100);
        System.out.println(arr);

    }
    ArrayList<Integer> replace(ArrayList<Integer> arr, int index, int num)
    {
        arr.add(index,num);
        arr.remove(index+1);
        return arr;
    }

    public static void insertionSort(int arr[])
    {
        int i=1;
       for(int j=1;j<arr.length;j++)
       {
           i=j;
           while(i>0)
           {
               if(arr[i-1]>arr[i])
               {
//                swap
                  int temp=arr[i];
                  arr[i]=arr[i-1];
                  arr[i-1]=temp;
               }
               i--;
           }
       }
    }
}





