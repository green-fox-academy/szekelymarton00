import java.util.Scanner;


public class Cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the Width: ");
        double Width = input.nextInt();
        while (Width > 0 == true) {
            if (Width > 0 == false) {
                System.out.println("The Number has to be greater than 0 please re-enter below");
                break;

            }
        }


        System.out.println("Please enter the Height: ");
        double Height = input.nextInt();
        System.out.println("Please enter the Lenght: ");
        double Lenght = input.nextInt();

//        double Width = 10;
//        double Height = 10;
//        double Lenght = 10;
        double SurfaceArea = 2*(Width * Lenght) + 2*(Lenght * Height) + 2*(Height * Width);
        System.out.println("The Surface Area is " + SurfaceArea);
        double Volume = Lenght * Width * Height;
        System.out.println("The Volume is " + Volume);

    }
}
