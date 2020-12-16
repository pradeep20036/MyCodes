import java.util.ArrayList;

public class LargeFactorial {

    public static void main(String[] args) {

        int n=1234;
        factorial(100);

    }

    public static ArrayList<Integer>  replace(ArrayList<Integer> arr, int index, int num)
    {
        arr.add(index,num);
        arr.remove(index+1);
        return arr;
    }
    public static ArrayList<Integer> multiply(ArrayList<Integer> ans,int num)
    {
        int carry=0;
        for(int i=ans.size()-1;i>=0;i--)
        {
          int prod=ans.get(i)*num+carry;
          carry=prod/10;
          ans=replace(ans,i,prod%10);
        }
//        add all the digits of carry in front.
        while(carry>0)
        {
            ans.add(0,carry%10);
            carry=carry/10;
        }
        return ans;
    }

    public static void factorial(int n)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);

        for(int i=2;i<=n;i++)
        {
            ans=multiply(ans,i);
        }

//        print the answer returned

        System.out.println(ans);

    }

}
