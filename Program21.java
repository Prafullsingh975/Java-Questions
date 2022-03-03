import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Shop discount - Description on Graphic
         */
        System.out.println("Enter Total Amount ");
        float amount = sc.nextFloat();
        float percent = 0;
        if (amount >= 0){
        if (amount > 5000 && amount<= 7000){
            percent = 10;
        }else if (amount>7000 && amount<=10000){
            percent = 20;
        }else if (amount > 10000)
            percent = 30;
            double discount = amount * percent / 100;
            double amt = amount - discount;
            System.out.println("Amount to Pay = " + amt);}
        if(amount < 0){
            System.out.println("Invalid Input");
        }/*else{
            System.out.println("Amount to Pay = " + amount);}*/
}
}
