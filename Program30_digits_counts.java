import java.util.Scanner;

public class Program30_digits_counts {
    public static void main(String[] args) {
         /*
        Sum of digits of a number, 936 = 18
        and also check no of digits in input number, 936 = 3 digits
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum = 0;
        int count=0;
        while (num>0){
            sum += num%10;
            num = num /10;
            count++;
        }
        System.out.println("Sum = " + sum);
        System.out.println(count + " Digit number");
    }
}
