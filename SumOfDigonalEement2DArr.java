import java.util.Scanner;

public class SumOfDigonalEement2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of 2D squar Array:");
        int n = sc.nextInt();
        //int m = sc.nextInt();
        int arr[][] = new int[n][n];
        int sum_L = 0,sum_R=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter "+ i+ ","+ j +" element ");
                arr[i][j] = sc.nextInt();
                if (i==j)
                    sum_L += arr[i][j];
                if (i+j == n-1)
                    sum_R += arr[i][j];
            }
        }
        System.out.println("Sum of all digonal elements of "+ n + " * "+ n + " 2D array = "+ sum_L);
        System.out.println("Sum of all digonal elements of "+ n + " * "+ n + " 2D array = "+ sum_R);
    }
}
