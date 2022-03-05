import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept a day number between 1-7 and print the corresponding dynamic
         */
        System.out.println("Enter numbers between 1 to 7");
        int day = sc.nextInt();
        if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if (day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if( day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else if (day == 7){
            System.out.println("Sunday");
        }if (day<1 || day>7){
            System.out.println("Invalid input");
        }
    }
}
