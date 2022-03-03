import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Bijli Bill - Description on Graphic
         */
        System.out.println("Enter Electricity Consumed ");
        double unit = sc.nextDouble();
        double amt = 0;
        if (unit < 0) {
            System.out.println("Invalid Input");
        }
        if (unit>0){
        if (unit > 400) {
            amt = amt + (unit - 400) * 13;
            unit = 400;
        }
        if (unit > 200) {
            amt = amt + (unit - 200) * 8;
            unit = 200;
        }
        if (unit > 100) {
            amt = amt + (unit - 100) * 6;
            unit = 100;
        }
        if (unit > 0) {
            amt = amt + (unit * 4.2);
        }
        System.out.println("Total Bill amount = " + amt);
    }
         /*if (unit <=100){
             amt = amt + (unit*4.2);
        }else if (unit > 100 && unit<=200){
             amt  = amt + (unit-100)*6;
        }else if (unit > 200 && unit<=400){
             amt = amt + (unit-200)*8;
            }else
                amt = amt + (unit - 400)*13;
        System.out.println("Total Bill Amount = " + amt);*/
    }
}
