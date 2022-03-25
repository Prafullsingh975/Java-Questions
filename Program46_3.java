public class Program46_3 {
    public static void main(String[] args) {
        /*
        Right Triangle - Alphabet
	A
	A B
	A B C
	A B C D
	A B C D E

         */
        int n = 5;
        for (int i = 1;i<=n;i++){
            char a ='A';
            for (int j = 1;j<=i;j++){
                System.out.print(a+" ");
              a++;
            }
            System.out.println();
        }
    }
}
