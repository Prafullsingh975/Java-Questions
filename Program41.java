import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        /*
         Accept a number and check if it is an armstrong number (Sum of cube of all digits will be equal to original number)
       Ex - 407 = 64 + 0 + 343 = 407
              153 = 1 + 125 + 27 = 153

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int D_num = num;
        int rem=0,sum=0;
        while (D_num >0){
            rem = D_num%10;
            D_num = D_num/10;
            sum +=Math.pow(rem,3);
        }
        //System.out.println(sum);
        if (num==sum)
            System.out.println(num  + " is an armstrong number");
        else
            System.out.println(num + " is not an armstrong number");
    }
}
