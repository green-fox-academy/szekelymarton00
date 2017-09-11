import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the distance in Kilometers : ");
        int KM = input.nextInt();
        System.out.println(" Distance in miles :" + KM * 0.621371192);
    }
}
