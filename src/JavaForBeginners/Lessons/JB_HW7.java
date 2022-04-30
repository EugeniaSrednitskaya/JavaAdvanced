package JavaForBeginners.Lessons;

import java.util.ArrayList;


public class JB_HW7 {

    public static double getAvarage(Integer[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        result = result / array.length;
        return result;
    }

    public static Double[] getMinMaxAvr(ArrayList<Integer> array) {
        Double[] result = new Double[3];
//        int min = array[0];
//        int max = array[0];
        int min = array.get(0);
        int max = array.get(0);
        Double avr = 0.0;

        //for (int i = 0; i < array.length; i++) {
        for (int i = 0; i < array.size(); i++) {
//            if (min > array.[i]) {
//                min = array[i];
//            }
//
//            if (max < array[i]) {
//                max = array[i];
//            }
//
//            avr = avr + array[i];
            if (min > array.get(i)) {
                min = array.get(i);
            }

            if (max < array.get(i)) {
                max = array.get(i);
            }

            avr = avr + array.get(i);
        }

        result[0] = (double) min;
        result[1] = (double) max;
        //result[2] = avr / array.length;
        result[2] = avr / array.size();
        return result;

    }

    public static void main(String[] args) {

        System.out.println("\u001B[32m" + "1. Создать массив catsNames, заполнить " +
                "его любыми значениями (см картинку котов из презентации)" + "\u001B[0m");

        String[] catsNames = {"Пушистик", "Бельчик", "Кукся", "Тундрик", "Мурик", "Петрик", "Карик"};
        System.out.println(catsNames);
        System.out.println();

        System.out.println("\u001B[32m" + "2. В массиве catsNames изменить значение " +
                "элемента с индексом 4 на “Рыжик”,  а значение элемента с индексом 1 на “Черныш”" + "\u001B[0m");

        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";
        System.out.println(catsNames[1] + " " + catsNames[4]);
        System.out.println();

        System.out.println("\u001B[32m" + "3. Создать массив catsColors и заполнить его значениями" + "\u001B[0m");

        String[] catsColors = {"Black", "White", "Grey", "Ginger", "Red", "Black", "Ginger"};
        System.out.println();

        System.out.println("\u001B[32m" + "4. Создать массив catsAges и заполнить его любыми значениями" + "\u001B[0m");

        Integer[] catsAges = {2, 3, 1, 10, 17, 6, 5};
        System.out.println();

        System.out.println("\u001B[32m" + "5. Создать массив isCatRed и " +
                "заполнить его соответствующими значениями" + "\u001B[0m");

        Boolean[] isCatRed = new Boolean[7];// = {false, false, false, false, true, false, false};
        for (int i = 0; i < isCatRed.length; i += 1) {
            if (catsColors[i].equals("Red") == true) {
                isCatRed[i] = true;
            } else isCatRed[i] = false;
        }
        for (int i = 0; i < isCatRed.length; i += 1) {
            System.out.println(isCatRed[i]);
        }
        System.out.println();

        System.out.println("\u001B[32m" + "6. Распечатать для массивов catsNames и catsColors:\n" +
                "имя кота в коробке с номером 6\n" +
                "имена котов из коробок с четными индексами\n" +
                "имена котов из коробок, чьи индексы кратны 4\n" +
                "цвет котов из коробок с нечетными индексами\n" +
                "цвет котов из коробок, чьи индексы кратны 3\n" + "\u001B[0m");

        System.out.println(catsNames[6] + " " + catsColors[6]);
        System.out.println();

        for (int i = 0; i < catsNames.length; i += 1) {
            if (i != 0 && i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < catsNames.length; i += 1) {
            if (i != 0 && i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < catsNames.length; i += 1) {
            if (i != 0 && i % 2 != 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < catsNames.length; i += 1) {
            if (i != 0 && i % 3 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "7. Распечатать “Накорми кота!” для всех серых котов" + "\u001B[0m");

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.println("Накорми кота " + catsNames[i]);
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "8. Распечатать “Отнеси кота на прививку!”, " +
                "если возраст кота меньше 2 лет" + "\u001B[0m");

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку! " + catsNames[i]);
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "9. Для кота в последней коробке " +
                "распечатать имя, цвет, возраст" + "\u001B[0m");

        System.out.println(catsNames[catsNames.length - 1] + " " + catsColors[catsColors.length - 1]
                + " " + catsAges[catsAges.length - 1]);
        System.out.println();

        System.out.println("\u001B[32m" + "10. Распечатать имена всех котов, " +
                "чей возраст больше 2 лет" + "\u001B[0m");

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.print(catsNames[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("\u001B[32m" + "11. Распечатать “Накорми кота!” " +
                "если имя кота “Рыжик” и значение isCatRed == true" + "\u001B[0m");

        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Рыжик") && isCatRed[i].equals(true)) {
                System.out.println("Накорми кота!");
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "12. Распечатать средний возраст котов из массива catsAges" + "\u001B[0m");

        double ageCats = 0;
        for (int i = 0; i < catsAges.length; i++) {
            ageCats = ageCats + catsAges[i];
        }
        ageCats = ageCats / catsAges.length;
        System.out.println(ageCats);
        System.out.println();

        System.out.println("\u001B[32m" + "13. Распечатать возраст самого молодого кота" + "\u001B[0m");

        int minAgeCat = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (minAgeCat > catsAges[i]) {
                minAgeCat = catsAges[i];
            }
        }
        System.out.println(minAgeCat);
        System.out.println();

        System.out.println("\u001B[32m" + "14. Распечатать возраст самого старого кота" + "\u001B[0m");

        int maxAgeCat = catsAges[0];
        for (int i = 0; i < catsAges.length; i++) {
            if (maxAgeCat < catsAges[i]) {
                maxAgeCat = catsAges[i];
            }
        }
        System.out.println(maxAgeCat);
        System.out.println();

        System.out.println("\u001B[32m" + "15. Распечатать количество серых котов" + "\u001B[0m");

        int countGrey = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                countGrey = countGrey + 1;
            }
        }
        System.out.println(countGrey);
        System.out.println();

        System.out.println("\u001B[32m" + "16. Распечатать имя кота, если кот " +
                "находится в коробке с четным индексом и его возраст не больше 3 лет" + "\u001B[0m");

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0 && catsAges[i] <= 3) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "17. Создать массив четных положительных чисел, " +
                "значения которых не больше 10. (заполняем значения с помощью цикла for)" + "\u001B[0m");

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i <= 10; i += 1) {
            if (i % 2 == 0) {
                arrList.add(i);
            }
        }

        System.out.println("Массив четных положительных чисел " + arrList);
        System.out.println();
        int[] arr = new int[11];
        for (int i = 0; i <= 10; i += 1) {
            if (i % 2 == 0) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("\u001B[32m" + "18. Написать метод, который принимает " +
                "на вход массив int, и возвращает среднее значение. Проверить работу " +
                "метода тестом, если параметр - массив catsAges" + "\u001B[0m");

        System.out.println(getAvarage(catsAges));
        System.out.println();

        System.out.println("\u001B[32m" + "19. Создать массив нечетных отрицательных " +
                "чисел в промежутке от -1000 до -900" + "\u001B[0m");

        ArrayList<Integer> arrayOddNegNum = new ArrayList<>();
        for (int i = -1000; i <= -900; i++) {
            if (Math.abs(i) % 2 != 0) {
                arrayOddNegNum.add(i);

            }
        }
        System.out.println(arrayOddNegNum);
        System.out.println();

        System.out.println("\u001B[32m" + "20. Создать массив из 10 случайных " +
                "положительных целых чисел" + "\u001B[0m");

        ArrayList<Integer> arrayRandomNum = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
//            arrayRandomNum.add((int)(Math.random() * (Integer.MAX_VALUE + 1 - Integer.MIN_VALUE) + Integer.MIN_VALUE));
            arrayRandomNum.add((int) (Math.random() * (i) + i));
        }
        System.out.println(arrayRandomNum);
        System.out.println();

//        Random random = new Random();
//        List result = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            result.add(random.nextInt(Integer.MAX_VALUE - Integer.MIN_VALUE + 2) + Integer.MIN_VALUE);
//        }
//        System.out.println(result);

        //System.out.println(Integer.MAX_VALUE - Integer.MIN_VALUE + 2);

        System.out.println("\u001B[32m" + "21. Создать метод, который принимает " +
                "на вход массив int,  и возвращает минимальное значение, максимальное " +
                "значение и среднее значение всех чисел массива. Проверить работу " +
                "метода на массиве из задания 20" + "\u001B[0m");

        System.out.println(getMinMaxAvr(arrayRandomNum).length);

        System.out.println("\u001B[32m" + "22. Создать массив четных чисел и массив " +
                "нечетных чисел из элементов массива из задания 20" + "\u001B[0m");

        ArrayList<Integer> arrayEven = new ArrayList<>();
        ArrayList<Integer> arrayOdd = new ArrayList<>();

        for (int i = 0; i < arrayRandomNum.size(); i++) {
            if (arrayRandomNum.get(i) % 2 == 0) {
                arrayEven.add(arrayRandomNum.get(i));
            }
        }
        System.out.println(arrayEven);


    }
}
