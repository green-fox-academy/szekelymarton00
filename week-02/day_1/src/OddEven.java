import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Number: ");
        double myNumber = input.nextDouble();

        boolean odd = myNumber % 2 == 0;
            if (odd == true) {
                System.out.println("Even");

            } else System.out.println("Odd");


    }
}
