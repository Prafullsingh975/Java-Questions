import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        /*
        Sum up to n terms.
         */
        System.out.println("Enter 'n'th number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i<=n; i++){
            sum += i; // or we can use sum = sum +i
        }
        System.out.println("Sum of first "+ n +" terms = "+ sum);
    }
}
