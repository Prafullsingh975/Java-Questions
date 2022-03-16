import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {
        /*
        Print all the numbers which are either divisible by 3 or 5 in a range
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range form ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Number divisible by 3 or 5 are");
        for (int i = n;i<=m;i++){
            if (i%3==0 || i%5==0){
                System.out.print(i+", ");
            }
        }
    }
}
