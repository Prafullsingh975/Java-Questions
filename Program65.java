import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {
        /*
        Array right Rotation by 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter " +(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        int temp = arr[arr.length-1];
        for (int i = (arr.length-1); i > 0 ; i--)
            arr[i] = arr[i-1];
        arr[0] = temp;
        //Enhanced for loop
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }
}
