import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Write a program to accept temperature in Fahrenheit & convert into Celsius.
        (Look for the formula on internet)
        */
        System.out.println("Enter temperature in Fahrenheit ");
        float tem = sc.nextFloat();
        float celsius = (tem - 32) * 5/9;
        System.out.println("Temperature " + celsius + "℃");
    }
}
