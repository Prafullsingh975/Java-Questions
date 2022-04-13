import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {
        /*
        Find the greatest element and print its index too.
      {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index
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
        int max_num =arr[0];
        for (int i = 1;i < arr.length;i++){

            if (arr[i]>max_num)
                max_num = arr[i];
             index = i;
        }
        System.out.print( "The lagest number is " + max_num + " found at index " +  index);


    }
}
