public class MyString {
    public static void main(String[] args) {
        char[] ch= {'j','a','v','a'};

        String s = new String(ch);
        System.out.println(s);

        System.out.println(s.substring(1));
        System.out.println(s.substring(0, 3));
    }
}
