import java.util.Scanner;

public class Program59 {
    public static void main(String[] args) {
        /*
        Labra Number SOD is completely divisible by count of digits = 456 = 15/3 = 0 , = 96 = 15/2
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0,rem=0,count = 0;
        while (num>0){
            rem = num%10;
            sum+=rem;
            num=num/10;
            count++;
        }
        if (sum%count==0)
            System.out.println("Labra number");
        else
            System.out.println("Not a Labra number");
    }
}
