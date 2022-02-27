import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Accept the three sides of triangle and calculate the area using herons formula
        */
        System.out.println("Enter all the three sides of triangle");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        double s = (a + b + c)/2;
        double area = s*(s-a)*(s-b)*(s-c);
        double Area = Math.sqrt(area);
        System.out.println("Area of triangle is = " + Area);
    }
}
