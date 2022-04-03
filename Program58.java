import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        /*
        Restuarent
         */
        Scanner sc = new Scanner(System.in);
        int options,sum=0;
        char choice;
        do {
            System.out.println("\t\t\tMenu");
            System.out.println("Each item for rupees 100");
            System.out.println("Press 1 for Indian Food\nPress 2 for Italian Food\nPress 3 to Chinese Food");
            options = sc.nextInt();
            switch (options){
                case 1 -> {System.out.println("\t\tIndian Food list\nPress 1 to order Butter Paneer and kulch\nPress 2 to order Daal and Rice\nPress 3 to order Butter Paneer and Roti");
                    int order = sc.nextInt();
                    switch (order){
                        case 1 -> System.out.println("Amount = "+(sum+=100));
                        case 2 -> System.out.println("Amount = "+(sum+=100));
                        case 3 -> System.out.println("Amount = "+(sum+=100));
                        default -> System.out.println("Invalid input");
                    }
                }
                case 2 -> {System.out.println("\t\tItalian Food list\nPress 1 to order Pizza\nPress 2 to order White Pasta\nPress 3 to order Red Pasta");
                    int order = sc.nextInt();
                    switch (order){
                        case 1 -> System.out.println("Amount = "+(sum+=100));
                        case 2 -> System.out.println("Amount = "+(sum+=100));
                        case 3 -> System.out.println("Amount = "+(sum+=100));
                        default -> System.out.println("Invalid input");
                    }
                }
                case 3 -> {System.out.println("\t\tChinese Food list\nPress 1 to order Fried rice\nPress 2 to order Chowmein\nPress 3 to order Hakka noodles");
                    int order = sc.nextInt();
                    switch (order){
                        case 1 -> System.out.println("Amount = "+(sum+=100));
                        case 2 -> System.out.println("Amount = "+(sum+=100));
                        case 3 -> System.out.println("Amount = "+(sum+=100));
                        default -> System.out.println("Invalid input");
                    }
                }
                    default -> System.out.println("Invalid Input");
            }
            System.out.println("Press Y to repeat or press any key to exit");
            choice = sc.next().charAt(0);
        }while(choice=='Y'||choice=='y');
        System.out.println("\t\t\tThank You for order");
        System.out.println("Total amount for order ="+sum);
    }
}
