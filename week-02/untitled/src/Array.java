public class Array {
    public static void main(String[] args) {
        int[] myFavNumbers = {8, 7, 9, 21};


        // change value
        myFavNumbers[1] = 9;

        for (int i = 0; i < myFavNumbers.length; i++) {
            System.out.println(myFavNumbers[i]);
        }
    }
}
