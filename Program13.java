import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept an integer and check whether it is an even number or odd.
         */
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num % 2 == 1){
            System.out.println(num + " is Odd Number");
        }else {
            System.out.println(num + " is Even Number");
        }
    }
}
