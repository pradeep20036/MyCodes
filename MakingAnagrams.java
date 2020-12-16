import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args) {

        int freq1[]=new int[26];
        int freq2[]=new int[26];

        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();

        for(int i=0;i<first.length();i++)
        {
            freq1[first.charAt(i)-'a']++;
        }

        for(int i=0;i<second.length();i++)
        {
            freq2[second.charAt(i)-'a']++;
        }

        int diff=0;
        for(int i=0;i<freq1.length;i++)
        {
            diff+=Math.abs(freq1[i]-freq2[i]);
        }

        System.out.println(diff);

    }
}
