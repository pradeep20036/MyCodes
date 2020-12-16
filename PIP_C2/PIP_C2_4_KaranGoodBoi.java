//package PIP_C2;
import java.util.HashMap;
import java.util.Scanner;
public class PIP_C2_4_KaranGoodBoi {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for( int i=0; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        for( int i=0; i<n ; i++)
        {
            b[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> mapA=new HashMap<>();
        HashMap<Integer,Integer> mapB=new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            mapA.put(a[i],i);
        }
        for(int i=0;i<b.length;i++)
        {
            mapB.put(b[i],i);
        }
//        now comes the scanning part and getting the count of good pairs
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(mapA.get(a[i])>mapA.get(a[j]) && mapB.get(a[i])<mapB.get(a[j]) ||
                        mapA.get(a[i])<mapA.get(a[j]) && mapB.get(a[i])>mapB.get(a[j])){
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
