import java.util.Scanner;
public class Program05 {
    public static void main(String[] args) {
        /*Accept the length and width of a rectangle.
        Calculate & print the area and perimeter.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        double l = sc.nextDouble();
        System.out.println("Enter Breath");
        double b = sc.nextDouble();
        System.out.println("Area of rectangle = " + (l*b));
        double p = 2*(l+b);
        System.out.println("Perimeter of rectangle = " + p);
//        System.out.println("Perimeter of rectangle = "+ (2*(l+b)));
    }
}
