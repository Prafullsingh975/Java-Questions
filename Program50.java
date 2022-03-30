public class Program50 {
    public static void main(String[] args) {
        /*
        Triangle
	    *
	   * *
	  * * *
	 * * * *
	* * * * *
         */
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int k = 1;k<=n-i;k++)
                System.out.print(" ");
            for (int j = 1;j<=i;j++)
                System.out.print("* ");
//            for (int l = 1;l<=k;l++)
//                System.out.print("  ");
            System.out.println();
        }
    }
}
