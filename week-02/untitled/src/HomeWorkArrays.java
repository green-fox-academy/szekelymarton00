import java.util.Scanner;

public class HomeWorkArrays {

    static double myPI = 3.14159; // Class Variable you can use them anywhere
    // but you can overwrite them!!!

    public static void main(String[] args)
    {

        addThem(1,2);
        System.out.println("Global " + myPI);
    }

    public static int addThem(int a, int b) // THESE ARE METHODS with ARGUMENTS statements form a METHOD
    {

        double smallPI = 3.140;

        double myPI = 3.0;
        System.out.println("Local " + myPI);
        return 1;
    }
}

