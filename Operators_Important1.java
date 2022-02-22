public class Operators_Important1
{
    public static void main(String[] args) {


        int x = 001, y=010, z=100;
        /*
        if x = 001 , y = 010,and z = 100
        Then they are treated as octal numbers
        and 001 binary = 1
            010 binary = 8
            100 binary = 100
         so therefor x = 1
                     y = 8
                     z = 100
        */
        int X = 1, Y = 10, Z = 100;

        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        int I = --X + Y++ - Z-- - --Z + ++Y - --X + Y-- - --X;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);

        System.out.println("The differance between output of i and I is due\nto octal number & decimal number ");

        System.out.println("X="+X);
        System.out.println("Y="+Y);
        System.out.println("Z="+Z);
        System.out.println("I="+I);
    }
}