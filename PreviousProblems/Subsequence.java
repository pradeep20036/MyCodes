package PreviousProblems;

import java.util.Scanner;

public class Subsequence {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int query=sc.nextInt();
        while(query-- >0)
        {
            String input=sc.next();
            System.out.println(check(input));
        }
    }

    public static String check(String input)
    {
        String given="hackerrank";
        int j=0;
        boolean flag=false;
        for(int i=0;i<input.length();i++)
        {
            if(j<given.length() && input.charAt(i)==given.charAt(j))
            {
                j++;
            }

            if(j>=given.length())
            {
                flag=true;
                break;
            }
        }

        if(flag)
            return "YES";
        else
            return "NO";
    }
}
