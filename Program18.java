import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept two numbers and print the greatest between them
        */
        System.out.println("Enter two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a > b){
            System.out.println(a + " is greater than " + b);
        }else {
            System.out.println(b + " is greater than " + a);
        }
    }
}
