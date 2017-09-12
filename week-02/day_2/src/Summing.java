//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter



public class Summing {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    public static int sum(int input) {
        int sumOfAll = 0;
        for (int i = 0; i < input; i++) {
            sumOfAll += i;
        }
        return sumOfAll;
    }
}
