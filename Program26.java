import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Take a number as input and print its table
       5 * 1 = 5
       5 * 2 = 10 ... up to 10 terms
         */
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i;
        for (i = 1;i<=10;i++){
            System.out.println(num + " * " + i + " = " +(num * i) );
        }
    }
}
