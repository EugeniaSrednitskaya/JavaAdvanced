package JavaForBeginners.Lessons;

import java.util.ArrayList;

public class JB_HW6 {

    public static void getDecimalLop(double start, double end, double step) {
        for (double i = start; i <= end; i += step) {
            System.out.print(i + " ");
        }
    }

    public static void getEvenLoop(int l) {
        for (int i = 0; i <= l; i += 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void getDegreeNumber(int n) {
        for (int i = 1; i <= 9; i += 1) {
            System.out.print(Math.pow(2, i) + " ");
        }
    }

    public static void getOddNumber(int n, int m, int l) {
        for (int i = n; i <= l; i += m) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void getSequenceDouble(int n, int l) {
        for (int i = n; i < l; i += 1) {
            System.out.print(2 * i + " ");
        }
    }

    public static void getSeqDifBetweenDigitsofNum(int l) {
        for (int i = 10; i <= l; i += 1) {
            if (((i / 10) - (i % 10)) > 0 && ((i / 10) - (i % 10)) <= 3) {
                System.out.print(i + " ");
            }
        }
    }

    public static ArrayList<Double> getFunction() {

        ArrayList<Double> y = new ArrayList<>();
        //for (double x = Double.MIN_VALUE; x < Double.MAX_VALUE; x += 1) {
        for (double x = -20; x < 20; x += 1) {

            if (x < 0) {
                y.add(x);
            }
            else if (x >= 0 && x <= 1.5) {
                y.add(x + 1);
            }
            else if (x > 1.5) {
                y.add(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);

            }
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("\u001B[32m" + "1. Распечатать последовательность " +
                "чисел от 0 до 9 включительно" + "\u001B[0m");

        for (int i = 0; i <= 9; i += 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\u001B[32m" + "2. Распечатать последовательность " +
                "чисел от 10 исключительно до 0 включительно" + "\u001B[0m");

        for (int i = 9; i >= 0; i -= 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\u001B[32m" + "3. Распечатать последовательность " +
                "чисел от 50 до 55 включительно с шагом 2" + "\u001B[0m");

        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\u001B[32m" + "4. Распечатать последовательность " +
                "чисел, кратных 7, в промежутке (327, 300)" + "\u001B[0m");

        for (int i = 327; i >= 300; i -= 1) {
            String format = ((i % 7 == 0) ? "Число, кратное, 7 = %d" : " ");
            System.out.printf(format, i);
        }
        System.out.println();

        System.out.println("\u001B[32m" + "5. Распечатать последовательность " +
                "чисел в промежутке [12, 13] с шагом 0.1" + "\u001B[0m");

        for (double i = 12; i <= 13; i += 0.1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\u001B[32m" + "6. Распечатать последовательность" +
                " четных чисел от 215 до 237 включительно" + "\u001B[0m");

        for (int i = 215; i <= 237; i += 1) {
            String format = ((i % 2 == 0) ? "Число, кратное, 2 = %d" : " ");
            System.out.printf(format, i);
        }
        System.out.println();

        System.out.println("\u001B[32m" + "7. Распечатать последовательность " +
                "чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно" + "\u001B[0m");

        for (int i = 8; i < 14; i += 1) {
            String format = ((i % 7 == 0) ? "Число, кратное, 7 = %d" : " ");
            System.out.printf(format, i);
        }
        System.out.println();

        System.out.println("\u001B[32m" + "8. Распечатать последовательность которая " +
                "начинается с минимального значения типа данных short и " +
                "заканчивается максимальным значением short. Числа в " +
                "последовательности должны быть кратны 15001" + "\u001B[0m");

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i += 1) {
            //String format = ((i % 15001 == 0) ?  "Число, кратное, 15001 = %d": " ");
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "9. Распечатать последовательность" +
                " чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, " +
                "должны быть распечатаны синим цветом. Числа, кратные 12, должны быть " +
                "распечатаны красным цветом. А ноль необходимо распечатать словом ZERO" + "\u001B[0m");

        for (int i = -10; i <= 34; i += 1) {
            if (i % 11 == 0) {
                System.out.print("\u001B[34m" + " " + i + "\u001B[0m" + " ");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + " " + i + "\u001B[0m" + " ");
            } else if (i == 0) {
                System.out.print("ZERO" + " ");
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "10. Написать метод, который принимает " +
                "на вход параметры start,  end, step, и печатает последовательность " +
                "десятичных  чисел, начиная с числа start, с шагом step. " +
                "Точка выхода из цикла - число end" + "\u001B[0m");

        double start = -20.23;
        double end = 0.15;
        double step = 0.1;

        getDecimalLop(start, end, step);
        System.out.println();

        System.out.println("\u001B[32m" + "11. Написать метод, который принимает параметр l" +
                "и печатает  последовательность четных чисел от нуля. " +
                "Длина последовательности = l" + "\u001B[0m");

        int l = 27;
        getEvenLoop(l);
        System.out.println();

        System.out.println("\u001B[32m" + "12. Напишите метод, который принимает целое " +
                "число n, и выводит все степени числа 2 от 1 до n включительно" + "\u001B[0m");

        int n = 5;
        getDegreeNumber(n);
        System.out.println();

        System.out.println("\u001B[32m" + "13. Вывести последовательность " +
                "012345678900112233445566778899000…  до числа 9999 включительно" + "\u001B[0m");

        System.out.println();

        System.out.println("\u001B[32m" + "14. Распечатайте последовательность чисел:\n" +
                "0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5\n" + "\u001B[0m");

        for (int i = 0; i <= 5; i += 1) {
            if (i == 0) {
                System.out.print(i);
            } else {
                int j = (-1) * i;
                System.out.print(", " + i + ", " + j);
                //System.out.println(i + " " + (-1) * i);
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "15. Распечатать последовательность чисел:\n" +
                "0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25" + "\u001B[0m");

        for (int i = 0; i <= 25; i += 1) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        System.out.println("\u001B[32m" + "16. Написать метод, который принимает параметры n, m, l, " +
                "и печатает последовательность нечетных чисел начиная " +
                "с числа n, с шагом m, l длина последовательности" + "\u001B[0m");

        int n16 = (-1) * 23;
        int m16 = 3;
        int l16 = 40;

        getOddNumber(n16, m16, l16);
        System.out.println();

        System.out.println("\u001B[32m" + "17. Сгенерируйте и распечатайте " +
                "последовательность по формуле: n + 1 = n + 2" + "\u001B[0m");

        for (int i = 0; i < 20; i += 1) {
            System.out.print(i + 2 + " ");
        }
        System.out.println();

        System.out.println("\u001B[32m" + "18. Написать метод, который принимает " +
                "параметры l, n, и печатает последовательность чисел, начиная с числа n, " +
                "по формуле для n + 1 члена последовательности: n + 1 = 2n" + "\u001B[0m");

        int n18 = 3;
        int l18 = 36;

        getSequenceDouble(n18, l18);
        System.out.println();
        System.out.println();

        System.out.println("\u001B[32m" + "19. Сгенерируйте последовательность целых " +
                "положительных  двузначных чисел, в которых разница между первой цифрой " +
                "(десятки) и второй цифрой (единицы) не превышает 3" + "\u001B[0m");

        int k = 99;
        getSeqDifBetweenDigitsofNum(k);
        System.out.println();
        System.out.println();

        System.out.println("\u001B[32m" + "20. Написать метод, который вычислит значение функции" + "\u001B[0m");

        System.out.println(getFunction());

        
    }
}
