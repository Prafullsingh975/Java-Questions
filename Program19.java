import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept three numbers and print the greatest among them
         */
        System.out.println("Enter three numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a != b && b != c && c != a) {
            if (a > b && a > c) {
                System.out.println(a + " is greatest number");
            } else if (b > a && b > c) {
                System.out.println(b + " is greatest number");
            } else if (c>a && c>b){
                System.out.println(c + " is greatest number");
            }
        }else
            System.out.println("Please enter distinct numbers");
    }
}