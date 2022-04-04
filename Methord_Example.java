public class Methord_Example {
    public static int fact(int n){
        int fact = 1;
        while (n>0)
            fact *= n--;
        return fact;
    }

    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;
        while (n > 0){
            int rem = n%10;
            sum += Methord_Example.fact(rem);
            n/=10;
        }
        System.out.println(sum == temp);
    }
}
