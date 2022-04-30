package JavaForBeginners.Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JA_HW9 {

    public static int[] PeakElement(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[i] > array[i+1]) {
                arrayList.add(array[i]);
            }
//            else if (i == 0 && array[i] < array[i+1]) {
//                arrayList.add(array[i+1]);
//            }

            if (i > 0 && i < array.length - 1
                    && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                arrayList.add(array[i]);
            }
            if (i == array.length - 1 && array[i] > array[i - 1]) {
                arrayList.add(array[i]);
            }
//            else if (i == array.length - 1 && array[i] < array[i - 1]) {
//                arrayList.add(array[i - 1]);
//            }
        }

        int i = 0;
        int[] arrayResult = new int[arrayList.size()];

        for (int x: arrayList) {
            arrayResult[i] = x;
            i++;
        }
        return arrayResult;

    }

    public static int[] Intersection(int[] array1, int[] array2) {
        //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array1.length > array2.length) {
            for (int i = 0; i < array2.length; i++) {
                if (array1[i] == array2[i]) {
                    arrayList.add(array1[i]);
                    System.out.println(arrayList.get(i));
                }
            }
        }


        int i = 0;
        int[] arrayResult = new int[arrayList.size()];

        for (int x: arrayList) {
            arrayResult[i] = x;
            i++;
        }
        return arrayResult;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int res = 12;
        int[][] arrRes = new int[9][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == res) {
                    arrRes[i][0] = arr[i];
                    arrRes[i][1] = arr[j];
                    //System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        //System.out.println(Arrays.deepToString(arrRes));


        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] arrayExpected = {2, 4};
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array3.length; i++) {
            if (i >=0 && i < array1.length) {
                array3[i] = array1[i];
            }
            else if (i >= array1.length) {
                array3[i] = array2[array3.length - i - 1];
            }
        }
        System.out.println(Arrays.toString(array3));

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array3.length; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] == array3[j]) {
                    result.add(array3[i]);
                    System.out.print(result + " ");
                    break;
                }
            }
        }

        //System.out.println(Intersection(array1, array2));
        System.out.println();

        int[] array = {1, 1, 1};
        Set<Integer> arraySet = new HashSet<>();

        for (int x: array) {
            arraySet.add(x);
        }
        System.out.println(arraySet);

        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] ar = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 12;
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == k) {
                    arrayList.add(new int[] {ar[i], ar[j]});
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("15 = " + Arrays.toString(arrayList.get(i)));
        }

        int x = 0;
        int y = 0;
        int[][] arrayResult = new int[arrayList.size()][2];

        for (int i = 0; i < arrayList.size(); i++) {
            arrayResult[i] = arrayList.get(i);
        }
        System.out.println(Arrays.deepToString(arrayResult));
    }
}
