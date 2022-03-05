import java.util.Scanner;

public class Program25 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 'n'th number");
      int n = sc.nextInt();
      /*
      Print natural number up to n, n to 1.
      */
        for(int i = n;i>=1;i--){
            System.out.print(i+", ");
        }

    }
}
