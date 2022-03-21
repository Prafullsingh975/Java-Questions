import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {
        /*
        Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
       Ex- 145 = 1! + 4! + 5! = 145

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int D_num = num;
        int rem=0,sum=0;
        while (D_num>0){
            rem = D_num%10;
            int fact= 1;
                    for(int i = rem;i>=1;i--){
                        fact*=i;
                    }
                    sum += fact;
                    D_num=D_num/10;
        }
       // System.out.println(sum);
        if (num==sum)
            System.out.println(num + " is a strong number");
        else
            System.out.println(num + " is not a strong number");
    }
}
