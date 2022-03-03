import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept a year and check if it is a leap year or not
        (google to find out what's a leap year)
         */
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println( year +" is a Leap year");
            }else{
                System.out.println(year + " is not a Leap year");
            }
        }
            else if (year % 4 == 0){
                System.out.println(year + " is a Leap year");
            }else {
            System.out.println(year + " is not a Leap year");
        }
    }
}
