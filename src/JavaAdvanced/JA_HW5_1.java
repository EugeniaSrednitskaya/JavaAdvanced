package JavaAdvanced;

public class JA_HW5_1 {

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static int getSub(int x, int y) {
        return x - y;
    }

    public static int getMult(int x, int y) {
        return x * y;
    }

    public static int getDiv(int x, int y) {

        return ((y != 0) ? x / y : 0);
    }

    public static String countingSheep(int num) {
        //Add your code here
        String str = "";
        if (num > 0) {
            for (int i = 1; i <= num; i += 1) {
                str = str + Integer.toString(i) + " sheep...";
            }
        } else if (num == 0) {
            str = "";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(0));
    }
}
