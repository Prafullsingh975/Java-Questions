import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {
        /*
        Print hello until user gives wrong input using do while
         */
        Scanner sc = new Scanner(System.in);
        char input;
        do {
            System.out.println("Hello World!");
            System.out.println("Press Y to print again");
            input = sc.next().charAt(0);
        }while (input=='Y'||input=='y');
    }
}
