package codes;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();

        while(test -->0)
        {
            long n=sc.nextLong();
            double ans=squareRoot(n);
            System.out.println(String.format("%.9f",ans));

        }
    }

    static double squareRoot(long number)
    {
//        computing the integral part first
//        then computing the decimal part letter with precision of 9 decimal
        long start = 0, end = number;
        long mid;

        // variable to store the answer
        double ans = 0.0;

        // for computing integral part
        // of square root of number
        while (start <= end)
        {
            mid = (start + end) / 2;
            if (mid * mid == number)
            {
                ans = mid;
                break;
            }
            // incrementing start if integral
            // part lies on right side of the mid
            if (mid * mid < number) {
                start = mid + 1;
                ans = mid;
            }
            // decrementing end if integral part
            // lies on the left side of the mid
            else {
                end = mid - 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < 9; i++) {
            while (ans * ans <= number) {
                ans += increment;
            }

            // loop terminates when ans * ans > number
            ans = ans - increment;
            increment = increment / 10;
        }
        return (double)ans;

    }
}
