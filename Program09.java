import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        /*
        Accept the Principle amount, time & rate of interest
        and calculate the Simple Interest
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        float Principle = sc.nextFloat();
        System.out.println("Enter rate of interest per annum ");
        float rate = sc.nextFloat();
        System.out.println("Enter time in year ");
        float time = sc.nextFloat();
        float SI = Principle * rate/100 * time;
        System.out.println("Simple Interest is " + SI);
    }
}
