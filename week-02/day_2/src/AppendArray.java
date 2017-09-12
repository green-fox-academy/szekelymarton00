// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end


import java.util.Arrays;
public class AppendArray {
    public static void main(String[] args) {
        String [] nimals = {"kuty", "macsk", "cic"};
            String [] animals = {nimals[0] + "a", nimals[1] + "a", nimals[2] + "a"};
        System.out.println(Arrays.toString(animals));

    }
}
