public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        String correct = "";
        int length = reversed.length();
            for ( int i = length - 1 ; i >= 0 ; i-- )
            correct = correct + reversed.charAt(i);
                System.out.println("Reverse of entered string is: "+correct);
        }
    }
