import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        /*
        Sum of digits of a number, 936 = 18
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum = 0;
        while (num>0){
            sum += num%10;
            num = num /10;
        }
        System.out.println("Sum = " + sum);
    }
}
