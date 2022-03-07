import java.util.Scanner;

public class Counting_with_lineBreak {
    public static void main(String[] args) {
        System.out.println("Please enter a number to write counting");
        Scanner sc = new Scanner(System.in);
        /*
         Separate each digit of a number and print it on the new line if 20 terms are in a line
        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40
        41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60

         */
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
            if (i % 20 == 0) {
                System.out.println();

            }
        }
    }
}
