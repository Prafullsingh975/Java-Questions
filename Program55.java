public class Program55 {
    public static void main(String[] args) {
        /*
        Hollow Rectangle
	*****
	*   *
	*   *
	*   *
	*****
         */
       int rows =5;
        for (int r = 0;r<rows;r++){
            System.out.print("*");
        }
        System.out.println();
        for (int r = 0;r<3;r++){
            for (int c = 0;c<rows;c++){
            if (c==0 ||c==4)
            System.out.print("*");
                System.out.print(" ");
            }
                System.out.println();
        }
//        System.out.println();
        for (int r = 0;r<rows;r++){
            System.out.print("*");
        }
    }
}
