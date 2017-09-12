//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorio {
    public static void main(String[] args) {
        System.out.println(factorio(5));
    }

    public static int factorio(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorio(n - 1);
    }



    }

