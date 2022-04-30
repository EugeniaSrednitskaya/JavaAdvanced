package JavaForBeginners.Lessons;

public class Lesson3 {
    static int a;
    static Integer A;
    static double d;
    static Double D;
    static String s;

    public static void main (String[] agrs) {

        System.out.println(a);
        System.out.println(A);
        System.out.println(d);
        System.out.println(D);
        System.out.println(s);

        a = 50;
        A = 3;
        System.out.println(a);
        System.out.println(A);

        A.intValue();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(A.toString(a) + " " + a);

        System.out.println(Integer.sum(a, A));

        System.out.println(Integer.SIZE);
    }
}
