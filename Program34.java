import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        /*
         Print the sum of all even & odd numbers in a range seperately
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum_odd = 0;
        int sum_even = 0;
        for (int i = n;i<=m;i++){
            if (i%2==0){
              sum_even += i;
            }
            if (i%2==1){
                sum_odd += i;
            }
        }
        System.out.println("Sum of all even numbers between "+n+ " to "+m+" = "+ sum_even);
        System.out.println("Sum of all odd numbers between "+ n+" to "+m+" = "+ sum_odd);

    }
}
