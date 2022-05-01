import java.util.Scanner;

public class Program62 {
    public static void main(String[] args) {
        /*
        Find the smallest element and print its index too.
      {2, 96, 69, 77, 145, 20} = Min element = 2 found at 0 index

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index = 0;
        for (int i = 0;i < arr.length;i++){
            System.out.println("Enter "+(i+1)+" term");
            arr[i] = sc.nextInt();
        }
        int min_num =arr[0];
        for (int i = 1;i < arr.length;i++){

            if (arr[i]<min_num)
                min_num = arr[i];
            index = i;
        }
        System.out.print( "The smallest number is " + min_num + " found at index " +  index);
    }
}
