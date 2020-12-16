import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int mat[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int tempSum = calSum(i, j, mat);
//                System.out.print(tempSum+" ");
                if (tempSum > maxSum)
                    maxSum = tempSum;
            }
        }
        System.out.println(maxSum);

    }

    public static int calSum(int starti, int startj, int mat[][]) {
        int row = starti + 2;
        int col = startj + 2;
        int sum = 0;
        for (int i=starti; i <= row; i++) {
            for (int j=startj; j <= col; j++) {

                if(i==starti+1 && j==startj ||i==starti+1 && j==startj+2 )
                {

                }
                else
                {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}