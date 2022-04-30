package JavaAdvanced;

public class JA_HW3_2 {
    public static void main(String[] args) {
        //Задание 1
        //Необходимо вывести числа от 0 до 15
        System.out.println("\u001B[32m" + "Задание 1" + "\u001B[0m");
        for (int i = 0; i < 16; i = i + 1)
            System.out.println("Значение числа i = " + i);
        System.out.println();

        //Задание 2
        // Необходимо вывести все положительные степени числа 5
        // которые меньше 10000, вывести результат возведения в степень.
        System.out.println("\u001B[32m" + "Задание 2" + "\u001B[0m");
        for (int a = 0; Math.pow(5, a) < 10000; a = a + 1)
            System.out.println("При возведении числа 5 в степень " + a + " результат равен " + Math.pow(5, a));
        System.out.println();

        //Задание 3
        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).

        System.out.println("\u001B[32m" + "Задание 3" + "\u001B[0m");

        for (int b = 40; b < 61; b = b + 1)
            if (b % 4 == 0) {
                System.out.println("1. Число, кратное 4 на интервале [40, 60], = " + b);
            }
        System.out.println();

        for (int c = 40; c < 61; c = c + 1) {
            switch (c % 4) {
                case 0:
                    System.out.println("2. Число, кратное 4 на интервале [40, 60] = " + c);
//                default:
//                    System.out.println("2. Число, некратное 4 на интервале [40, 60] = " + c);
            }
        }
        System.out.println();

        for (int c = 40; c < 61; c = c + 4)
            System.out.println("3. Число, кратное 4 на интервале [40, 60] = " + c);
        System.out.println();

        for (int c = 40; c < 61; c = c + 1) {
            //System.out.printf("4. Число кратное 4 - %d%s, ", c, (c % 4 == 0) ? "\n" : " ");
            String format = ((c % 4 == 0) ?  "4. Число, кратное 4 на интервале [40, 60] = %d" : "\n");
            System.out.printf(format, c);
        }

    }
}
