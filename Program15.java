import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept the parameters and calculate the Compound Interest &
        print it on STDOUT (Use Math class methods)
         */
        System.out.println("Enter Principal amount");
        float principal = sc.nextFloat();
        System.out.println("Enter Rate of Interest P.A");
        float rate = sc.nextFloat();
        System.out.println("Enter Time period in year");
        float time = sc.nextFloat();
        double amount = principal * Math.pow((1 + rate/100),time);
        double CI = amount - principal;
        System.out.println("Compound Interest = " + CI);
        System.out.println("Total Amount = " + amount);
    }
}
