import java.util.ArrayList;
import java.util.Arrays;

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(4);
        myArrayList.add(67);
        myArrayList.add(111);
        myArrayList.add(3);

        myArrayList.addAll(Arrays.asList(23, 34, 454, 32));
        myArrayList.set(1, 87);
        System.out.println(myArrayList);

    }
}
