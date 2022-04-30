package JavaAdvanced;

import JavaAdvanced.Work.MonthUtils;

import java.util.Arrays;

public class JA_HW4_1 {
    public static void main (String [] args) {

        System.out.println("\u001B[32m" + "1. Дан массив:" +
                "int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6}; " +
                "необходимо вывести сумму всех значений массива" + "\u001B[0m");

        int[] arr1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < arr1.length; i += 1) {
            sum = sum + arr1[i];
        };
        System.out.println("sum = " + sum);
        System.out.println();

        System.out.println("\u001B[32m" + "2. Дан массив:" +
                "int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6}; " +
                "необходимо вывести максимальное значение массива" + "\u001B[0m");

        int[] arr2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max_value = 0;
        for (int i = 0; i < arr2.length; i += 1) {
            if (max_value < arr2[i]) {
                    max_value = arr2[i];
            };
        };
        System.out.println("Максимальное значение элементов массива = " + max_value);
        System.out.println();

        System.out.println("\u001B[32m" + "3. Дан массив:\n" +
                "int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};\n" +
                "необходимо вывести минимальное значение массива.\n" + "\u001B[0m");

        int[] arr3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < arr2.length; i += 1) {
            if (min_value > arr2[i]) {
                min_value = arr2[i];
            };
        };
        System.out.println("Минимальное значение элементов массива = " + min_value);
        System.out.println();

        System.out.println("\u001B[32m" + "4. Дан массив:\n" +
                "int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};\n" +
                "необходимо вывести среднее арифметическое всех значений массива\n" + "\u001B[0m");

        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sumEl = 0;
        for (int i = 0; i < arr4.length; i += 1) {
            sumEl = sumEl + arr4[i];
        };
        System.out.println("" + sumEl + " " + arr4.length);
        double avr_sum = sumEl / arr4.length;
        System.out.println("Среднее арифметическое значение элементов массива = " + avr_sum);
        System.out.println();

        System.out.println("\u001B[32m" + "5. Дан массив: \n" +
                "int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};\n" +
                "необходимо вывести сумму элементов массива\n" + "\u001B[0m");

        int[][] arr5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum_arr5 = 0;
        for (int i = 0; i < arr5.length; i += 1) {
            for (int j = 0; j < arr5[i].length; j += 1) {
                sum_arr5 = sum_arr5 + arr5[i][j];
            }
        }

        System.out.println("Сумма элементов массива = " + sum_arr5);
        System.out.println();

        System.out.println("\u001B[32m" + "6. Дан массив: \n" +
                "int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};\n" +
                "необходимо вывести максимальное значение массива.\n" + "\u001B[0m");

        int[][] arr6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max_value_arr6 = 0;
        for (int i = 0; i < arr6.length; i += 1) {
            for (int j = 0; j < arr6[i].length; j += 1) {
                if (max_value_arr6 < arr6[i][j]) {
                    max_value_arr6 = arr6[i][j];
                };
            };
        };

        System.out.println("Максимальное значение элементов массива = " + max_value_arr6);
        System.out.println();

        System.out.println("\u001B[32m" + "7. Дан массив: \n" +
                "int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};\n" +
                "необходимо вывести количество элементов в массиве\n" + "\u001B[0m");

        int[][] arr7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        long quant = 0L;
        for (int i = 0; i < arr7.length; i += 1) {
            quant = quant + Arrays.stream(arr7[i]).count();
        }
        System.out.println("Количество элементов в массиве = " + quant);
        System.out.println();


    }
}
