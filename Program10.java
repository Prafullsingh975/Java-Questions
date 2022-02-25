import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        /*
        Take 3 int inputs from user and check and print the result.
	    all are equal
	    any of two are equal
	    ( use && || )
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && b==c && c==a ){
            System.out.println("All are equal");
            System.out.println("i.e. " + a + "=" + b + "=" + c);
        }
        else if (a==b || b==c || a==c){
            System.out.println("Any of two are equal");
        }
        else {
            System.out.println("All three are unequal");
        }

    }
}
