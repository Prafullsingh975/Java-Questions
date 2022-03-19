import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {
        /*
        Accept a number and check if it is a pallindromic number (If number and its reverse are equal)
       Ex - 12321 - Reverse - 12321
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int num_copy = num;
        int Rvc_num = 0;
        while (num_copy > 0){
            int rem = num_copy %10;
            Rvc_num = Rvc_num*10+rem;
            num_copy = num_copy /10;
        }
//        System.out.println(num);
//        System.out.println(Rvc_num);
        if (num == Rvc_num)
            System.out.println(num +" is Pallindromic number");
        else
            System.out.println(num + " is not pallindromic number");
    }
}
