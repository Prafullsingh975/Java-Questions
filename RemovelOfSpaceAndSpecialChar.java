import java.util.Scanner;

public class RemovelOfSpaceAndSpecialChar {
    public static void main(String[] args) {
        System.out.println("String Input");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s1 = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch>='A'&&ch<='z')
                s1 +=ch;
        }
        System.out.println(s1);
    }
}
