import java.util.Scanner;

public class Program63 {
    public static void main(String[] args) {
        /*
        Find the second greatest element
      {2, 96, 69, 77, 145, 20} = Second greatest element = 96
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
        int max_num = Math.max(arr[0],arr[1] );
        int max2 = Math.min(arr[0],arr[1] );
        for (int i = 2;i < arr.length;i++){

            if (arr[i] > max_num){
                max2 = max_num;
                max_num = arr[i];
            }
            else if (arr[i]< max_num && max2< arr[i])
                    max2 = arr[i];
               // index = i;
            }
        System.out.println("Second greatest element " + max2);

}
}
