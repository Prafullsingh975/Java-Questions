import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Extend the previous program and handle the wrong inputs.
        Print Good Morning sir for input m or M & Good morning Maam for input F or f
        else print Wrong Input
         */
        System.out.println("Select Gender M/F");
        char gender = sc.next().charAt(0);
        if(gender == 'M' || gender == 'm'){
            System.out.println("Good morning Sir");
        }else if(gender == 'F' || gender == 'f') {
            System.out.println("Good morning Ma'am");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
