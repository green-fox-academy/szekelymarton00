// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array


import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] ag = {3, 4, 5, 6, 7};
        int[] times2 = {ag[0]*2, ag[1]*2, ag[2]*2, ag[3]*2,ag[4]*2 };
        System.out.println(Arrays.toString(times2));
        }


    }

