import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notes = 0;
        /*
        INR Denomination - Description on Graphic
         */
        System.out.println("Enter Amount");
        int amt = sc.nextInt();
        if (amt < 0){
            System.out.println("Invalid Input");
        }else if (amt>0){
            if (amt >= 2000){
                 notes = amt / 2000;
                amt = amt % 2000;
                System.out.println("Number of 2000 notes = " + notes);
            }if (amt >= 500){
                 notes = amt / 500;
                amt = amt % 500;
                System.out.println("Number of 500 notes = " + notes);
            }if (amt>=200){
                notes = amt / 200;
                amt = amt % 200;
                System.out.println("Number of 200 notes = " + notes);
            }if (amt>=100){
                notes = amt / 100;
                amt = amt % 100;
                System.out.println("Number of 100 notes = " + notes);
            }if (amt>=50){
                notes = amt / 50;
                amt = amt % 50;
                System.out.println("Number of 50 notes = " + notes);
            }if (amt>=20){
                notes = amt / 20;
                amt = amt % 20;
                System.out.println("Number of 20 notes = " + notes);
            }if (amt>=10){
                notes = amt / 10;
                amt = amt % 10;
                System.out.println("Number of 10 notes = " + notes);
            }if (amt>=5){
                notes = amt / 5;
                amt = amt % 5;
                System.out.println("Number of 5 notes = " + notes);
            }if (amt>=2) {
                notes = amt / 2;
                amt = amt % 2;
                System.out.println("Number of 2 notes = " + notes);
            }if (amt>=1) {
                notes = amt;
                amt = 0;
                System.out.println("Number of 1 notes = " + notes);
            }
        }else
        System.out.println("Number of notes = 0");
    }
}
