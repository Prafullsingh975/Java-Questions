import java.util.Scanner;

public class Program64 {
    public static void main(String[] args) {
        /*
        Array left Rotation by 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //int index = 0;
        for (int i = 0;i < arr.length;i++){
            System.out.println("Enter "+(i+1)+" term");
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length-1 ; i++)
            arr[i] = arr[i+1];
        arr[arr.length -1] = temp;
        //foreach loop or Enhanced for loop
        for (int a:arr) {
            System.out.print(a + " ");
        }
//        we can also use for loop
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i] + " ");
//        }
    }
}
