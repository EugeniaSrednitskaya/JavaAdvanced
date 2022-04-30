package JavaAdvanced;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JA_HW8_1 {
    public static String abbrevName(String name) {
        //получить инициалы
        String initials = "";
        int count = 0;

        StringBuilder builder = new StringBuilder(name);
        //меняем все символы на строчные, кроме первого
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                builder.setCharAt(i, Character.toUpperCase(name.charAt(i)));
            } else if (i != 0) {
                builder.setCharAt(i, Character.toLowerCase(name.charAt(i)));
            }
        }
        //pavel ivanov = Pavel ivanov = Pavel Ivanov
        //перед пробелом всегда заглавные
        for (int i = 1; i < name.length(); i++) {
            if (Character.isAlphabetic(name.charAt(i)) && Character.isSpaceChar(name.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(name.charAt(i)));
        }

        //формируем строку из первых букв слова
        char[] array = builder.toString().toCharArray();
        for (char x : array) {///x in array
            if (Character.isUpperCase(x) && x == array[0]) {
                initials = initials + x + ".";
            }//Pavel - 6, итерации 8 - что 7 символ является пробелом
            else if (Character.isUpperCase(x) && x != array[0] && Character.isWhitespace(array[count - 1])) {
                initials = initials + x;
            }
            count++;
        }
        return initials;

    }

    public static boolean feast(String beast, String dish) {
        //на входе имя животного и название блюда, если первые и последние буквы слов совпадают, то true

        if (beast.charAt(0) == dish.charAt(0) &&
                beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)) {
            return true;
        } else return false;

    }

    public static String tripleTrouble(String one, String two, String three) {
        //конкатенация трех строк, но сначала первые символы, потом группировка остальных
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result = result + String.valueOf(one.charAt(i)) + String.valueOf(two.charAt(i)) +
                    String.valueOf(three.charAt(i));
        }

        return result;
        //expected:<ttlh[eoiscst]k> but was:<ttlh[isestoc]k>
        //this test lock = ttl
    }

    public static String position(char alphabet) {
        //вывести номер позиции в алфавите
        String result = "";
        if (Character.isAlphabetic(alphabet)) {
            result = "Position of alphabet: " + (Character.getNumericValue(alphabet) - 9);
        }
        return result;
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            sum2 = sum2 + arr2[i];
        }

        return sum1 + sum2;
    }


    public static void main(String[] args) {
        //kata1
        String name = "EADPSLBQP A DPSLBQP";//"David Bars";
        System.out.println("kata1 " + abbrevName(name));
        System.out.println();

        //kata2
        String beast = "Giraff";
        String dish = "Ghyyyy";
        System.out.println("kata2 " + feast(beast, dish));
        System.out.println();

        //kata3
        String one = "this";
        String two = "test";
        String three = "lock";
        System.out.println("kata3 " + tripleTrouble(one, two, three));
        System.out.println();

        //kata4
//        When provided with a letter, return its position in the alphabet.
//        Input :: "a"
//        Output :: "Position of alphabet: 1"
        char alphabet = (char) 'd';
        System.out.println("kata4 " + position(alphabet));
        System.out.println();

        //kata5
//        I'm new to coding and now I want to get the sum of two arrays...actually
//        the sum of all their elements. I'll appreciate for your help.
//        P.S. Each array includes only integer numbers. Output is a number too.

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        System.out.println("kata5 " + arrayPlusArray(arr1, arr2));

    }
}
