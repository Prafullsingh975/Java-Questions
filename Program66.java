import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) {
        /*
        Array left rotation by K elements
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rotations");
        int rotations = sc.nextInt();
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int arr[] =  new int[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter "+ (i+1) + " element");
            arr[i] = sc.nextInt();
        }
        // TO reduce time complicity
        if (rotations>= arr.length)
            rotations = rotations % arr.length;
        for (int i = 0; i < rotations ; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1 ; j++)
                arr[j] = arr[j+1];
            arr[arr.length -1] = temp;
        }
        for (int a:arr) {
            System.out.print(a + " ");
        }
    }
}
