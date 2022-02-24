import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        /*
        Accept the gender from the user as char and print the respective greeting message
        Ex - Good Morning Sir (on the basis of gender)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Gender M/F");
        char gender = sc.next().charAt(0);
        if(gender == 'M' || gender == 'm'){
            System.out.println("Good morning Sir");
            }else {
            System.out.println("Good morning Ma'am");
            //In this program we can not handle invalid inputs
            //For example: when user enter any char except M the output will be "Good morning Ma'am"
            //We are fixing it in our next Program i.e. Program12
        }
    }
}
