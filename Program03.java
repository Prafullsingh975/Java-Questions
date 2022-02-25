import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        /*char ch = 97;//small alphabets from 97
        System.out.println(ch);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter Second number ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum " + c);
    }
}
