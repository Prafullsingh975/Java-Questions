import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        /*
        Automorphic number 5 = 25 = 625 = 390625
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int tem_num = num;
        int rem = 0,count =0,num1;
        int sq_no = (int)Math.pow(num,2);
        while (tem_num>0) {
            tem_num = tem_num / 10;
            count++;
        }
        num1 = sq_no%(int)Math.pow(10,count);
//        System.out.println(num);
//        System.out.println(num1);
//        System.out.println(count);
        if (num==num1)
            System.out.println(num + " is Automorphic number");
        else
            System.out.println(num + " is not Automorphic number");


    }
}
