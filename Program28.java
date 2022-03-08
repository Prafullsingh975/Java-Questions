import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        /*
        Factorial of a number
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = n; i>=1; i--){
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " i.e. "+n+"! "+" = "+factorial );
    }
}
