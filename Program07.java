import java.util.Scanner;
public class Program07 {
    public static void main(String[] args) {
        /*
          Accept the marks of Robert in three subjects Maths, Computer,
          English respectively (each out of 100 ),
          Write a program to calculate his total marks and percentage marks.
        */
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks each out of 100");
        System.out.println("Maths ");
        int Mat = sc.nextInt();
        System.out.println("Computer ");
        int Com = sc.nextInt();
        System.out.println("English ");
        int Eng = sc.nextInt();
        float Total = Mat + Com + Eng;
        float Percent = 100*(Total/300);
        System.out.println("Your Total marks = " + Total);
        System.out.println("You got " + Percent + "%");

    }
}
