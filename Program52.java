public class Program52 {
    public static void main(String[] args) {
        /*
        Diamond or Kite
         *
	    * *
	   * * *
	  * * * *
	 * * * * *
	* * * * * *
	 * * * * *
	  * * * *
	   * * *
	    * *
	     *

         */
        int n = 6;
        for (int i = 1;i<n;i++){
            for (int k = 1;k<=n-i;k++)
                System.out.print(" ");
            for (int j = 1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = 0;i<n;i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = 1; j <= n - i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

