import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept the value of a, b, c
        The values in a quadratic equation and find its roots.
        */
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();
        double b2 = Math.pow(b,2);
        double root1 = (-b + Math.sqrt(b2 - 4*a*c))/2.0*a;
        double root2 = (-b - Math.sqrt(b2 - 4*a*c))/2.0*a;
        System.out.println("Roots of Quadratic equation " + " are " + root1 + " , " + root2);

    }
}
