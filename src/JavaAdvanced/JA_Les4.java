package JavaAdvanced;

import java.util.Arrays;

public class JA_Les4 {
    public static void main (String[] args) {

        int i = 0;
        while (i < 5) {
            System.out.print(" " + i);
            i += 1;
        }
        System.out.println();
        i = 0;
        do {
            System.out.println(" " + i);
            i += 1;
        } while (i != 5);

        int[] arr = {2, 4, 6, 8};

        for (int j = 0; j < arr.length; j = j + 1) {
            System.out.println(arr[j]);
        }

        System.out.println(Arrays.toString(arr));

        String srt1 = "Hello AQA";
        String result1 = srt1.substring(1, 2);
        System.out.println(result1);
        System.out.println(srt1.length());

        System.out.println(srt1.charAt(1));

        String square = "Квадрат";
        String circle = "Круг";

        System.out.println(square = circle);

        System.out.println(311 % 100);
    }
}
