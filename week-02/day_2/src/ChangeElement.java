//# - Create an array variable named `s`
//        #   with the following content: `[1, 2, 3, 8, 5, 6]`
//        # - Change the 8 to 4
//        # - Print the fourth element

import java.util.Arrays;
public class ChangeElement {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 8, 5, 6};
        int a = 4;
        swap(a, s);
        System.out.println(Arrays.toString(s));

    }
    public static void swap(int a, int s[]){
        int t = a;
        a = s[3];
        s[3] = t;

    }
}
