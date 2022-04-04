import java.util.Scanner;

public class Program60 {
    public static void main(String[] args) {
        /*
        Accept size n from user and create a n size array then take n inputs into the and finally
      Print the sum of all elements in the array in the following manner
      10 + 20 + 30 = 60
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0;i < arr.length;i++){
            System.out.println("Enter "+(i+1)+" term");
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for (int i = 0;i < arr.length;i++){
            sum = sum + arr[i];
            System.out.print(arr[i] );
            if (i != arr.length -1)
                System.out.print(" + ");
        }
        System.out.print(" = "+ sum);
    }
}
