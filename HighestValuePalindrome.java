import java.lang.reflect.Array;
import java.util.*;

public class HighestValuePalindrome {

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int length=sc.nextInt();
//        int allowed=sc.nextInt();
//        String input=sc.next();
//        System.out.println(highestvalue(input,allowed));
//        int id=1;
//        int de=2;
//        int arr[]={id,de};


        Set<ArrayList<Integer>> set=new HashSet<>();
        ArrayList<Integer>ar1=new ArrayList<>();
        ar1.add(1);ar1.add(2);ar1.add(2);
        set.add(ar1);
        ArrayList<Integer>ar2=new ArrayList<>();
        ar2.add(3);ar2.add(2);ar2.add(2);
        set.add(ar2);
        System.out.println("what");
        for(ArrayList<Integer> arr1: set)
        {
            System.out.println(arr1);
        }


    }



    public static boolean palindrome(String input)
    {
        boolean flag=true;
        int low=0;
        int high=input.length()-1;
        while(low<high)
        {
            if(input.charAt(low)!=input.charAt(high))
            {
                flag=false;
                break;
            }
            low++; high--;
        }
        return flag;
    }

    public static String highestvalue(String input,int allowed)
    {
        int low=0;
        int high=input.length()-1;

        char input_arr[]=input.toCharArray();

        while (low<high  && allowed>0 )
        {
            if(input_arr[low]>input_arr[high])
            {
                input_arr[high]=input_arr[low];
                allowed--;
            }
            else if(input_arr[low]<input_arr[high])
            {
                input_arr[low]=input_arr[high];
                allowed--;
            }
            low++;
            high--;
        }

        String processed="";
        for(char ch: input_arr)
        {
            processed+=ch;
        }

        boolean palindrome=palindrome(processed);

        if(palindrome==true)
        {
            String old=processed;
            String newer="";

            char newarray[]=old.toCharArray();

            //            improving the value
            int l=0;
            int h=old.length()-1;
            while(l<h && allowed>=2)
            {
              if(newarray[l]!='9' && newarray[h]!='9')
              {
                  allowed-=2;
              }
              else if(newarray[l]=='9' && newarray[l]=='9' )
              {

              }
              else
              {
                  allowed-=1;
              }
                newarray[l]='9';
                newarray[h]='9';
                l++;
                h--;

            }
            String processed_final="";
            for(char ch: newarray)
            {
                processed_final+=ch;
            }

            if(palindrome(processed_final))
            {
                return processed_final;
            }
            else
            {
                return processed;
            }
        }
        else
        {
            return "-1";
        }
    }
}
