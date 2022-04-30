package JavaForBeginners.Lessons;

import java.util.*;

public class JB_HW8 {
    public static Integer numInt = 500;
    public static Double numDobl = 123.0;
    public static String str = "test";

    public static int[] getArrayIntNum(int count, int num0, int num1, int num2, int num3, int num4) {
        int[] arrayIntNum = new int[count];

        arrayIntNum[0] = num0;
        arrayIntNum[1] = num1;
        arrayIntNum[2] = num2;
        arrayIntNum[3] = num3;
        arrayIntNum[4] = num4;

        return arrayIntNum;
//        StringBuilder sb = new StringBuilder();
//
//        for (Integer i = 0; i < count; i++) {
//            sb.append("num" + i.toString());
//            System.out.println(sb);
//
//            //arrayIntNum[i] = sb.chars();
//            sb.delete(0, sb.length());
//
//        }
//        return null;
    }

    public static double[] getArrayDoubleNum(double num0, double num1, double num2, double num3, double num4) {
        double[] arrayDoubleNum = new double[5];

        arrayDoubleNum[0] = num0;
        arrayDoubleNum[1] = num1;
        arrayDoubleNum[2] = num2;
        arrayDoubleNum[3] = num3;
        arrayDoubleNum[4] = num4;

        return arrayDoubleNum;
    }

    public static String[] getArrayStr(String str0, String str1, String str2, String str3, String str4) {
        String[] ArrayStr = new String[5];

        ArrayStr[0] = str0;
        ArrayStr[1] = str1;
        ArrayStr[2] = str2;
        ArrayStr[3] = str3;
        ArrayStr[4] = str4;

        return ArrayStr;
    }

    public static double[] getArrayTwiceInt(int[] array) {
        double[] arrayTwice = new double[array.length];

        for (int i = 0; i < arrayTwice.length; i++) {
            arrayTwice[i] = array[i] * 2.5;
        }

        return arrayTwice;

    }

    public static int getArrayEven(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int[] getArrayOdd(int[] array) {
        int[] arrayOdd = new int[array.length];

        for (int i = 0; i < arrayOdd.length; i++) {
            if (array[i] % 2 != 0) {
                arrayOdd[i] = array[i];
            }
        }
        return arrayOdd;
    }

    //public static int[] getN(int numbers) {
       // return new int[]{numbers};
    //}

    public static Boolean getTrueFalse(int[] array) {
        Boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                result = true;
            } else result = false;
        }
        return result;
    }

    public static String getStringFromStringArray(String[] array) {
        String result = "";

        for (int i = 0; i < array.length; i++) {
            result = result + array[i] + " ";
        }
        return result;
    }

    public static int getSumSecondArrayPart(int[] array) {
        int sum = 0;
        int length = array.length / 2;

        for (int i = 0; i <= length; i++) {
            //System.out.println(array[i+length]);
            sum = sum + array[i + length];
        }
        return sum;
    }

    public static int[] getMultiplicationTable(int num) {
        int[] result = new int[11];
        if (num > 1 && num < 10) {
            for (int i = 0; i < 11; i++) {
                result[i] = i * num;
            }
        }

        return result;
    }

    public static ArrayList<Integer> getArray(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven = countEven + 1;
            } else {
                countOdd = countOdd + 1;
            }
        }

        if (countEven > countOdd) {
            for (int i = 0; i < array.length; i = i + 2) {
                result.add(array[i]);
            }
        } else if (countEven < countOdd) {
            for (int i = 1; i < array.length; i = i + 2) {
                result.add(array[i]);
            }
        }

        return result;
    }

    public static ArrayList<Integer> getArrayRandomPositiveNumbers(int length) {
        ArrayList<Integer> arrayRandomNum = new ArrayList<>();
        int min = 0;
        int max = 100;
        int range = max - min;
        for (int i = 0; i < length; i++) {
//            arrayRandomNum.add((int)(Math.random() * (Integer.MAX_VALUE + 1 - Integer.MIN_VALUE) + Integer.MIN_VALUE));
            arrayRandomNum.add((int) (Math.random() * (range) + min));
        }
        return arrayRandomNum;
    }

    public static int[] getArrayRandom(int l, int d) {
        int[] result = new int[l];
        int min = (int) Math.pow(10, d - 1);
        //System.out.println("min " + min);
        int max = (int) Math.pow(10, d) - 1; // bound is exclusive
        //System.out.println("max " + max);
        int range = max - min;
        //System.out.println("range " + range);
        //Random random = new Random();
        //return Integer.toString(random.nextInt(max - min) + min);

        for (int i = 0; i < l; i++) {
            result[i] = (int) (Math.random() * (range) + min);
        }
        return result;
    }

    public static ArrayList<Integer> getArrayTwoDigitsNum(ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (Integer.toString(array.get(i)).length() == 2) {
                result.add(array.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Integer> getDiffBetweenTensOnes(ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            result.add(array.get(i) / 10 - array.get(i) % 10);
        }

        return result;
    }

    public static String[] getPhoneNumber(int[] array) {
        String[] result = new String[2];
        String temp = "";

        for (int i = 0; i < array.length; i++) {
            if (i == 0) temp = Integer.toString(array[i]) + "(";
            if (i == 1 || i == 2 || i == 3) temp = temp + Integer.toString(array[i]);
            if (i == 4) temp = temp + Integer.toString(array[i]) + ")";
            if (i == 5 || i == 6) temp = temp + Integer.toString(array[i]);
            if (i == 7) temp = temp + Integer.toString(array[i]) + "-";
            if (i == 8) temp = temp + Integer.toString(array[i]);
            if (i == 9) temp = temp + Integer.toString(array[i]) + "-";
            if (i == 10 || i == 11) temp = temp + Integer.toString(array[i]);

        }
        result[0] = temp;
        result[1] = "Ukraine";
        return result;
    }

    public static Set<Integer> getArrayUniqueNumbers(ArrayList<Integer> array) {
        Set<Integer> result = new HashSet<>();

        for (Integer x : array) {
            result.add(x);
        }

        return result;
    }

    public static int[] getQuantUniqueNonuniqueNum(ArrayList<Integer> array) {
        int[] result = new int[2];
        int res = 0;
        result[0] = 0;
        result[1] = 0;
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i) == array.get(j)) {
                    result[0] = result[0] + 1;
                    break;
                }
                //else result[1]++;
            }
        }

        for (int element : array) {
            res ^= element;
            System.out.print(element + " ");

        }
        System.out.println();
        result[1] = res;
        return result;
    }

    public static ArrayList<Integer> getPartArray(ArrayList<Integer> array, int index1, int index2) {

        ArrayList<Integer> result = new ArrayList<>();

        if (index1 <= array.size() && index2 <= array.size() && index1 <= index2) {
            for (int i = index1; i <= index2; i++) {
                result.add(array.get(i));
            }
        }
        return result;

    }

    public static Set<Integer> getUniqueArrayFromTwoArrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        Set<Integer> result = new HashSet<>();

        for (Integer x : array1) {
            result.add(x);
        }

        for (Integer x : array2) {
            result.add(x);
        }

        return result;
    }

    public static void main(String[] args) throws IllegalAccessException {
        JB_HW8_1.class.getName();

        System.out.println("\u001B[32m" + "6. Сравнить переменные соответствующих типов " +
                "из классов HW8_1 и HW8 и распечатать результат сравнения в виде таблички" + "\u001B[0m");

        System.out.println("JB_HW8 = " + numInt + "   JB_HW8_1 = " + JB_HW8_1.numInt);
        System.out.println("JB_HW8 = " + numDobl + " JB_HW8_1 = " + JB_HW8_1.numDobl);
        System.out.println("JB_HW8 = " + str + "  JB_HW8_1 = " + JB_HW8_1.str);
        System.out.println();

        System.out.println("\u001B[32m" + "7. Написать метод, который принимает " +
                "на вход 5 целых чисел,  и возвращает массив из этих же чисел" + "\u001B[0m");

        int num0 = 37;
        int num1 = 56;
        int num2 = 1;
        int num3 = 42;
        int num4 = 99;
        int count = 5;

        System.out.println(getArrayIntNum(count, num0, num1, num2, num3, num4));
        System.out.println();

        System.out.println("\u001B[32m" + "8. Написать метод, который принимает " +
                "на вход 5 чисел типа double,  и возвращает массив из этих же чисел" + "\u001B[0m");

        double numDoub0 = 37.0;
        double numDoub1 = 56.0;
        double numDoub2 = 1.0;
        double numDoub3 = 45.0;
        double numDoub4 = 99.0;

        System.out.println(getArrayDoubleNum(numDoub0, numDoub1, numDoub2, numDoub3, numDoub4));
        System.out.println();

        System.out.println("\u001B[32m" + "9. Написать метод, который принимает на вход 5 слов, " +
                "и возвращает массив из этих слов" + "\u001B[0m");

        String str0 = "str0";
        String str1 = "str1";
        String str2 = "str2";
        String str3 = "str3";
        String str4 = "str4";

        System.out.println(getArrayStr(str0, str1, str2, str3, str4));
        System.out.println();

        System.out.println("\u001B[32m" + "10. Написать метод, который принимает " +
                "на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5" + "\u001B[0m");

        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 50, 123};

        System.out.println(getArrayTwiceInt(arrayInt));
        System.out.println();

        System.out.println("\u001B[32m" + "11. Написать метод, который принимает " +
                "на вход массив целых положительных чисел,  и возвращает " +
                "количество четных чисел в этом массиве" + "\u001B[0m");

        System.out.println(getArrayEven(arrayInt));
        System.out.println();

        System.out.println("\u001B[32m" + "12. Написать метод, который принимает на вход " +
                "массив целых положительных чисел,  и возвращает массив нечетных чисел" + "\u001B[0m");

        System.out.println(getArrayOdd(arrayInt));
        System.out.println();

        System.out.println("\u001B[32m" + "13. Написать метод, который принимает на вход " +
                "масив целых чисел,  и возвращает массив значений true или false, " +
                "если числа больше 10" + "\u001B[0m");

        System.out.println(getTrueFalse(arrayInt));
        System.out.println();

        System.out.println("\u001B[32m" + "14. Написать метод, который принимает на вход " +
                "массив слов,  и возвращает строку, состоящую из этих слов" + "\u001B[0m");

        String[] arrayStr = {"I", "like", "java"};

        System.out.println(getStringFromStringArray(arrayStr));
        System.out.println();
        //System.out.println(getN(10).length);

        System.out.println("\u001B[32m" + "15. Написать метод, который принимает массив " +
                "целых чисел и считает сумму чисел во второй половине массива" + "\u001B[0m");

        System.out.println(getSumSecondArrayPart(arrayInt));
        System.out.println();

        System.out.println("\u001B[32m" + "16. Написать метод, который принимает на вход " +
                "целое положительные число в пределах от 1 до 10 исключительно, " +
                "и возвращает таблицу умножения на это число в виде массива\n" +
                "Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}" + "\u001B[0m");

        int num = 9;
        for (int i = 0; i < getMultiplicationTable(num).length; i++) {
            System.out.print(getMultiplicationTable(num)[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("\u001B[32m" + "17. Написать метод, который принимает массив целых " +
                "чисел и возвращает массив четных чисел, если четных чисел больше, " +
                "или массив нечетных чисел, если нечетных чисел больше" + "\u001B[0m");

        System.out.println(getArray(arrayInt));
        System.out.println();

        System.out.println("\u001B[32m" + "18. Написать метод, который принимает на вход " +
                "длину массива и генерирует массив случаейных положительных " +
                "чисел от 0 до 100 исключительно" + "\u001B[0m");

        int length = 50;

        System.out.println(getArrayRandomPositiveNumbers(length));
        System.out.println();

        System.out.println("\u001B[32m" + "19. Написать метод, который принимает на вход " +
                "длину массива l и количество знаков d (однозначные, двузначные, " +
                "трехзначные и тд числа), и генерирует массив случайных целых " +
                "положительных чисел длины l, в котором все числа имеют количество знаков d" + "\u001B[0m");

        int l = 10;
        int d = 3;

//        for (int i = 0; i < l; i++) {
//            System.out.print(getArrayRandom(l, d)[i] + " ");
//        }
//      System.out.println();
        System.out.println(Arrays.toString(getArrayRandom(l, d)));
        System.out.println();

        //System.out.println(Math.pow(10, 1));

        System.out.println("\u001B[32m" + "20. Написать метод, который принимает на вход массив " +
                "целых положительных чисел, и возвращает массив только двузначных чисел. " +
                "ПРоверить работу метода на массиве из задания 18" + "\u001B[0m");

        System.out.println(getArrayTwoDigitsNum(getArrayRandomPositiveNumbers(length)));
        System.out.println();

        System.out.println("\u001B[32m" + "21. Написать метод, который принимает на вход массив " +
                "целых положительных двузначных чисел, и возвращает массив разниц " +
                "между десятками и единицами" + "\u001B[0m");

        System.out.println(getDiffBetweenTensOnes(getArrayTwoDigitsNum(getArrayRandomPositiveNumbers(length))));
        System.out.println();

        System.out.println("\u001B[32m" + "22. Написать метод, который принимает массив из 11 целых " +
                "положительных чисел от 0 до 9, и возвращает массив, который содержит номер телефона, " +
                "состоящий из этих чисел,  и название страны, которой номер принадлежит.\n" +
                "Например: method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}" + "\u001B[0m");

        int[] arrayPhone = {3, 8, 0, 6, 6, 7, 5, 9, 1, 0, 7, 8};
        for (int i = 0; i < getPhoneNumber(arrayPhone).length; i++) {
            System.out.println(getPhoneNumber(arrayPhone)[i]);
        }
        System.out.println();

        System.out.println("\u001B[32m" + "23. Написать метод, который принимает массив целых " +
                "положительных чисел больше 0, и возвращает массив уникальных чисел" + "\u001B[0m");

        System.out.println(getArrayUniqueNumbers(getArrayRandomPositiveNumbers(length)));
        System.out.println();

        System.out.println("\u001B[32m" + "24. Написать метод, который принимает на вход массив " +
                "целых положительных чисел, и возвращает количество уникальных и неуникальных " +
                "элементов в этом массиве" + "\u001B[0m");

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(13);
        arr.add(7);
        arr.add(1);
        arr.add(13);
        arr.add(1);
        arr.add(17);

        //System.out.println(Arrays.toString(getQuantUniqueNonuniqueNum(getArrayRandomPositiveNumbers(length))));
        System.out.println(Arrays.toString(getQuantUniqueNonuniqueNum(arr)));
        System.out.println();

        System.out.println("\u001B[32m" + "25. Написать метод, который принимает на вход массив " +
                "целых положительных чисел, и 2 целых положительнх числа (значения индексов). " +
                "Метод возвращает массив, который содержит только числа из первого массива " +
                "в промежутке между индексами.\n" +
                "Например: method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}" + "\u001B[0m");

        int index1 = 10;
        int index2 = 33;

        System.out.println();
        System.out.println(getPartArray(getArrayRandomPositiveNumbers(length), index1, index2));
        System.out.println();

        System.out.println("\u001B[32m" + "26. Написать метод, который принимает на вход 2 массива int[] " +
                "и возвращает объединенный массив уникальных неповторяющихся элементов" + "\u001B[0m");

        int length1 = 5;
        int length2 = 6;
        System.out.println();
        System.out.println(getUniqueArrayFromTwoArrays(getArrayRandomPositiveNumbers(length1), getArrayRandomPositiveNumbers(length2)));
        System.out.println();

        int[] array1 = {1, 2, 4, 7, 9, 1, 7};
        int[] array2 = new int [7];//{0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < array1.length; i++) {
            if (Arrays.asList(array2).contains(array1[i]) == false) {
                array2[i] = array1[i];
            }
        }
        System.out.println("new " + Arrays.toString(array2));
    }
}
