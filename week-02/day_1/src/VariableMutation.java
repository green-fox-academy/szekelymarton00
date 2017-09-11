public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;
            System.out.println(a);

        int b = 100;
        b -= 7;
            System.out.println(b);

        int c = 44;
        c *= 2;
            System.out.println(c);

        int d = 125;
        d /= 5;
            System.out.println(d);

        int e = 8;
        e *= e * e;
            System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        boolean bigger = true;
        {
            if (f1 > f2) {
                System.out.println("F1 is bigger than F2");
            } else System.out.println("F1 is smaller than F2");
        }
        int g1 = 350;
        int g2 = 200;

        boolean doublebigger = (g2 * 2) > g1;
            System.out.println(doublebigger);
        int h = 135798745;
        boolean divisor = h / 11 >= 0;
            System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;
        boolean gettingtired = i1 > i2*i2 && i1 < i2*i2*i2;
            System.out.println(gettingtired);

        int j = 1521;
        boolean reallytired = (j % 3) == 0 || (j % 5) == 0;
            System.out.println(reallytired);

      //  String k = new String[] {"Apple", "Apple", "Apple", "Apple"};

       // System.out.println(k);

    }

        }



