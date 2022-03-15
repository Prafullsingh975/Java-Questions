import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        /*
        Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum=0;

        for (int i=1;i<=num;i++){

            if (num%i==0){
                sum+=i;
                System.out.println("Factors are "+ i);
            }
        }
        System.out.println("Sum of all the factors ="+ sum);
    }
}
