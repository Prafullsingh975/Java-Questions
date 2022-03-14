import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) {
        /*
        Print all the factors of a number
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            if (num%i==0){
                System.out.println("Factor of "+num+" = "+ i);
            }
        }
    }
}
