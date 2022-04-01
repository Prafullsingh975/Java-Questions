public class Program54 {
    public static void main(String[] args) {
        /*
        - X
	*        *
	  *   *
	    *
	*     *
 *          *
         */
        int n = 5;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(" ");
                if (r == c)
                    System.out.print("*");
                if (r+c==n-1&& c!=2 && r!=2)
                    System.out.print("*");
            }
                System.out.println();
        }
    }
}