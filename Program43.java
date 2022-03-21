import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        /*
        Accept a number and check if it is a Harshad number
      Harshad number is a number or an integer which is completely divisible by sum of  its digits.
      Ex - 24 = Sum of 2+4 = 6 & 24%6 = 0
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int D_num = num;
        int rem=0,sum=0;
        while (D_num>0){
            rem = D_num % 10;
            sum += rem;
            D_num = D_num/10;
        }
        if (num % sum ==0)
            System.out.println(num + " is Harshad number");
        else
            System.out.println(num + " is not Harshad number");
    }
}
