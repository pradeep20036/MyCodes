import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Samplee {

    public static void main(String[] args) {

        Set<Character> vowels=new HashSet<>();
    }

    public static String strip(String A)
    {
        String stripped="";
        int first=0;
        int last=0;

        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=' ')
            {
                first=i;
                break;
            }
        }

        for(int i=A.length()-1;i>=0;i--)
        {
            if(A.charAt(i)!=' ')
            {
                last=i;
                break;
            }
        }

        stripped=A.substring(first,last+1);

        return stripped;
    }
    public static String addBinary(String A, String B) {

        if(A.length()==0)
        {
            return B;
        }
        if(B.length()==0)
        {
            return A;
        }

        String sum="";
        int carry=0;
        int temp_sum=0;

        if(A.length()<B.length())
        {
            String temp=A;
            A=B;
            B=temp;
        }

        int i=A.length()-1;
        int j=B.length()-1;
        while(i>=0)
        {
            int A_digit=A.charAt(i)-'0';

            int B_digit=0;
            if(j >=0)
                B_digit=B.charAt(j--)-'0';

            if(A_digit+B_digit+carry==0)
            {
                sum='0'+sum;
                carry=0;
            }
            else if(A_digit+B_digit+carry==1)
            {
                sum='1'+sum;
                carry=0;
            }
            else if(A_digit+B_digit+carry==2)
            {
                sum='0'+sum;
                carry=1;

            }
            else if(A_digit+B_digit+carry==3)
            {
                sum='1'+sum;
                carry=1;
            }

            i--;

        }

        if(carry>0)
        {
            sum='1'+sum;
        }

        return sum;

    }




}
