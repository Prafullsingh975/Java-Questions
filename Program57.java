import java.util.Scanner;

public class Program57 {
    public static void main(String[] args) {
        /*
        Choice calc
         */
        Scanner sc = new Scanner(System.in);
        float num1,num2;
        int options;
        char choice;
        do {
            System.out.println("Press 1 to Addition\nPress 2 to Subtraction\nPress 3 to Multiply\nPress 3 to Divide");
            options = sc.nextInt();
            switch (options){
                case 1 -> {
                System.out.println("Enter two numbers to get sum ");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Sum = "+ (num1+num2));
            }
            case 2 -> {
                System.out.println("Enter two numbers to get difference");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Difference = "+ (num1-num2));
            }
            case 3 -> {
                System.out.println("Enter two numbers to get product ");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Product = "+ (num1*num2));
            }
            case 4 -> {
                System.out.println("Enter two numbers to get sum ");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Divide = "+ (num1/num2));
            }
                default -> System.out.println("Invalid input");
            }
            System.out.println("Press Y to repeat or press any key to exit");
            choice = sc.next().charAt(0);
        }while(choice=='Y'||choice=='y');
        }
    }
