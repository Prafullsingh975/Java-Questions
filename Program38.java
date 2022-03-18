import java.util.Scanner;

public class Program38 {
    public static void main(String[] args) {
        /*
        Check if the number is Prime or not
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int count = 0,LoopC = 0;
        int num = sc.nextInt();
        if (num==2)
            System.out.println("Prime Number");
        else if (num % 2==0)                 //because only 2 is an even prime number
            System.out.println("Not Prime Number");
        else    {
            for (int i = 3;i<=Math.sqrt(num);i+=2){
               // System.out.println("Loop Count = "+ ++LoopC);
                if (num % i == 0)
                    count++;
            }
            if (count == 0)
                System.out.println("Prime Number");
            else
                System.out.println("Not Prime Number");
        }
    }
}
