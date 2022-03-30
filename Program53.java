public class Program53 {
    public static void main(String[] args) {
        /*
        V - Min Height = 3
	*       *
	 *     *
	  *   *
	   * *
	    *

         */
        int n =6;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n*2-1 ; j++) {
                if(i==j || i+j==n*2) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
