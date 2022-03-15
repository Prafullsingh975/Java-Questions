import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        /*
        Accept a number and check if it is a perfect number or not.
      A number whose sum of factors(excluding number itself)  = Number
      Ex -  6 = 1, 2, 3 = 6

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int factor=0;
        int sum = 0;
        for (int i = 1;i<num;i++){

            if (num %i==0){
                sum+=i;
            }
        }
           // System.out.println(sum==num ?" Perfect number": "Not prefect" ); ////we can also use  ternurry opperators  conition
        if (sum==num){
            System.out.println(num + " is a perfect number");
        }else
            System.out.println(num+" is not a perfect number");
    }
}
