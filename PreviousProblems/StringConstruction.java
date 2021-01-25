package PreviousProblems;

import java.util.Scanner;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int query=sc.nextInt();
        while(query-- >0)
        {
         String input=sc.next();
            System.out.println(cost(input));
        }

    }
    public static int cost(String input)
    {
        String p="";
        int presence[]=new int[26];
        int a=4;
        int cost=0;
        for(int i=0;i<input.length();i++ )
        {
            if(presence[input.charAt(i)-'a']==0)
            {
                cost+=1;
                presence[input.charAt(i)-'a']=1;
            }
        }
        return cost;

    }



}
