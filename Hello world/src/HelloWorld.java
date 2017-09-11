import java.util.Scanner;

public class HelloWorld {

    public static void  main(String[] args) {

        // Variable type name ( = value);

        int myNumber = 100;

        System.out.println(myNumber -1);

        // reassign value

        myNumber = 110;

        // Strings
        String message = "This is a message";
        String message2 = "This is the number: " + myNumber;
        System.out.println(message);
        System.out.println(message2);

        // Scanner



        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your favourite number: ");
        int favouriteNumber = input.nextInt();

        System.out.println("Your favourite number is: " + favouriteNumber);
        System.out.println("Enter an amount in double format, for example: 12.5: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        System.out.println("Remaining Amount:" +remainingAmount);

        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        System.out.println("Remaining Amount is:  " + remainingAmount);
        System.out.println("Number of dollars is: " + dollars);

        int nickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        System.out.println("Number of nickles: " + nickles );

        // % is remainder amennyi marad

        // BOOLEAN
        // Operators
        // equal to                 ==
        // greater than             >
        // less than                <
        // greater than equal to    >=
        //less than equal to        <=
        // not equal to             !=

        // AND                      &&
        // OR                       ||
        // NOT                      !

        boolean b = (2 == 2);
        System.out.println(b);

        // IF
        //if (condition is true) {
        // do this code}

        if (true) {
            System.out.println("Condition is true ");
        }
        // if it was false we would not see anything

        boolean a = (10 - 1 == 8) || (true);
        boolean c = (10 - 1 == 8) && (true);

        System.out.println(a);

        System.out.println("This is false " + c);

        // ELSE statement
        boolean d = false;

        if (d) {
            System.out.println("Condition is true");
        }
        else {
            System.out.println("Condition is false because of ELSE");

        }

        //else if(a || b) {
        // System.out.println("a AND b are true");
        //}

        // WHILE - reaping IF statement LOOPS


        int m = 0;
        while (m < 100) {
            System.out.println(m);
            m = m + 1;
        // same as m++;

            System.out.println("Loop finished");
        }
        // same as the one before
        for (int p = 0; p < 100; p++)
            System.out.println(p);
        // DO while LOOP code is run then the condition is checked

        int u = 10;

        do {
            System.out.println("Hello World");
        } while (u < 10);

        }



    }


