package JavaAdvanced;

public class JA_HW5_2 {
    public static void main(String[] args) {

        System.out.println("\u001B[32m" + "1. Вывести пирамиду" + "\u001B[0m");

        for (int i = 0; i < 10; i += 1) {
            for (int j = 0; j < 10 - i; j += 1) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\u001B[32m" + "2. Вывести пирамиду" + "\u001B[0m");

        for (int i = 0; i < 10; i += 1) {
            System.out.printf("  ".repeat(i));
            for (int j = 0; j < 10 - i; j += 1) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }

        System.out.println("\u001B[32m" + "3. Вывести пирамиду" + "\u001B[0m");

        for (int i = 0; i < 10; i += 1) {
            System.out.printf("  ".repeat(i));
            for (int j = 9 - i; j > 0; j -= 1) {
                System.out.printf(j + " ");
            }
            for (int j = 0; j < 10 - i; j += 1) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }

    }
}
