import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.
        ArrayList<String> newFar = new ArrayList<>();

        String s = "";
        for(int i = 0; i < far.size(); i++) {
            s = far.get(i);
            newFar.add(s.concat("a"));
        }

        System.out.println(newFar);

        }
    }


