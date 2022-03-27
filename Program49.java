public class Program49 {
    public static void main(String[] args) {
        /*
        Mirrored Inverted Right Triangle
     	* * * * *
	      * * * *
	        * * *
	          * *
	            *
         */
        int n = 5;
        for (int i =0;i<n;i++){
            for (int j =1;j<=i;j++)
                System.out.print("  ");
            for (int k = n-i;k>=1;k--)
                System.out.print("* ");
        System.out.println();
        }
    }
}
