import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //STDOUT yani print
        //STDIN yani input
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        System.out.println("Hello " + name + ", You are " + age + " years old.");
    }
}
// Scanner glitch