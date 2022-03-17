import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        /*
         Make a choice based calculator using do while
         */
        Scanner sc = new Scanner(System.in);
        float num1,num2;
        int options;
        char choice;
        do {
            System.out.println("Press 1 to add\nPress 2 to sub\nPress 3 to multiply\nPress 3 to divide");
            options = sc.nextInt();
            if (options==1){
                System.out.println("Enter two numbers to get sum ");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Sum = "+ (num1+num2));
            }if (options==2){
                System.out.println("Enter two numbers to get difference");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Difference = "+ (num1-num2));
            }if (options==3){
                System.out.println("Enter two numbers to get product ");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Product = "+ (num1*num2));
            }if (options==4){
                System.out.println("Enter two numbers to get sum ");
                num1= sc.nextFloat();
                num2= sc.nextFloat();
                System.out.println("Divide = "+ (num1/num2));
            }
            System.out.println("Press Y to repeat or press any key to exit");
            choice = sc.next().charAt(0);
        }while(choice=='Y'||choice=='y');
    }
}
