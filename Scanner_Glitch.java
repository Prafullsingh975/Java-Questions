import java.util.Scanner;
public class Scanner_Glitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        System.out.println("Enter the name ");
        //Is glitch ko fix krne k liye ek demo next line
        // for ex : sc.nextLine();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", You are " + age + " years old.");
    }
}
