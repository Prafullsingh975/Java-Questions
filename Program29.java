import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
/*
Separate each digit of a number and print it on the new line (in reverse order)
input=320
output=
0
2
3
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num>0){
            System.out.println(num%10);
            num=num/10;
        }
    }
}