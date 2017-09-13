import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner UserInput = new  Scanner(System.in);
                System.out.println("Please type in the expression: ");
            char prompt = UserInput.next().charAt(0);
        Scanner UserNumberOne = new Scanner(System.in);
            int first = UserNumberOne.nextInt();
        Scanner UserNumberTwo = new Scanner(System.in);
            int second = UserNumberTwo.nextInt();

            if (prompt == '+' ){
                System.out.print(first + second);
            }
            if (prompt == '-'){
                System.out.print(first - second);
            }
            if (prompt == '*'){
                System.out.print(first * second);
            }
            if (prompt == '/'){
                System.out.print(first / second);
            }






//        Scanner operation = new Scanner(System.in);
//        String  prompt = operation.next();
//        String  multiply = UserInput * UserInput2;
//        if (prompt = "*")
//        double TheNumber = UserInput.nextInt();
//        double TheSecondNumber = UserInput.nextInt();




    }
}