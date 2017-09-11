import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Please enter your Name: ");
        String UserName = input.next();
            System.out.println("Hello, " + UserName);

    }
}
