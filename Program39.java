import java.util.Scanner;

public class Program39 {
    public static void main(String[] args) {
/*
 Accept a number and print its reverse
 */
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num/10;
        }
        System.out.println("Reverse of " + num + " = " + sum);
    }
}
