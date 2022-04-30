package JavaForBeginners.Lessons;

public class JB_HW2 {
    public static void main(String[] args) {
        int k = 5;//150;
        int l = 10; //7;
        int m = 15; //23;

        System.out.println("\u001B[32m" + "11-12. Вывести значения переменных в столбик" + "\u001B[0m");
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println();

        System.out.println("\u001B[32m" + "13-14. Вывести значения переменных в строку" + "\u001B[0m");
        System.out.println("" + k + " " + l + " " + m);
        System.out.println("" + k + ", " + l + ", " + m);
        System.out.println();

        System.out.println("\u001B[32m" + "15. Вывести значения этих переменных так, " +
                "чтобы было понятно, какое значение к какой переменной относится" + "\u001B[0m");
        System.out.println("int k = " + k);
        System.out.println("int k = " + l);
        System.out.println("int k = " + m);
        System.out.println();

        System.out.println("\u001B[32m" + "16-17. Результаты арифметических операций" + "\u001B[0m");
        int res1 = k + l;
        System.out.println("Sum of k and l = " + res1);

        int res2 = k * m;
        System.out.println("k * m = " + res2);

        int res3 = l - m;
        System.out.println("Разность переменных l и m = " + res3);
        System.out.println();

        int res4 = k / l;
        int res5 = k % l;
        System.out.println("Результат деления k на l = " + res4 + ", а остаток от деления  = " + res5);

        int res6 = k / m;
        int res7 = k % m;
        System.out.println("Результат деления k на m = " + res6 + ", а остаток от деления  = " + res7);

        int res8 = l / m;
        int res9 = l % m;
        System.out.println("Результат деления l на m = " + res8 + ", а остаток от деления  = " + res9);

        int res10 = m / k;
        int res11 = m % k;
        System.out.println("Результат деления m на k = " + res10 + ", а остаток от деления  = " + res11);
        System.out.println();


        System.out.println("\u001B[32m" + "18. Яблоки и студенты" + "\u001B[0m");
        int apple1 = 40;
        int student1 = 6;
        int res12 = apple1 / student1;
        int res13 = apple1 % student1;

        System.out.println("Если " + apple1 + " яблок поделить на " + student1
                + " учеников, то каждый ученик получит по " //+ res12
                + modulDeclension.chooseEnding(res12, "яблоко", "яблока", "яблок")
                + ", и "
                + modulDeclension.chooseEnding(res13, "яблоко", "яблока", "яблок")
                + " останется учителю.");

        int apple2 = 100;
        int student2 = 21;
        int res14 = apple2 / student2;
        int res15 = apple2 % student2;

        System.out.println("Если " + apple2 + " яблок поделить на " + student2
                + " учеников, то каждый ученик получит по " //+ res12
                + modulDeclension.chooseEnding(res14, "яблоко", "яблока", "яблок")
                + ", и "
                + modulDeclension.chooseEnding(res15, "яблоко", "яблока", "яблок")
                + " останется учителю.");
        System.out.println();

        System.out.println("\u001B[32m" + "19. Распечатать вычисления и итоговый результат" + "\u001B[0m");

        int sumKLM = k + l + m;
        sumKLM--;
        m++;

        int res16 = k + l + m + sumKLM;
        System.out.println("k + l + m++ + sumKLM-- = " + res16);
        System.out.println();

        int res17 = m - sumKLM;
        System.out.println("m++ - sumKLM-- = " + res17);
        System.out.println();

        System.out.println("\u001B[32m" + "20. Показать, что число 48 кратно 8, " +
                "и что оба этих числа - четные. А числа 47 и 49 - нечетные" + "\u001B[0m");

        if (48 % 8 == 0) {
            System.out.println("Число 48 кратно 8");
        } else {
            System.out.println("Число 48 не кратно 8");
        }

        if (48 % 2 == 0 && 8 % 2 == 0) {
            System.out.println("Оба числа 48 и 8 - четные");
        } else {
            System.out.println("Оба числа 48 и 8 - нечетные");
        }

        if (47 % 2 == 0) {
            System.out.println("Число 47 - четное");
        } else {
            System.out.println("Число 47 - нечетное");
        }

        if (49 % 2 == 0) {
            System.out.println("Число 49 - четное");
        } else {
            System.out.println("Число 49 - нечетное");
        }
        System.out.println();

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        System.out.println("\u001B[32m" + "21. Вычислить (х+3) в квадрате" + "\u001B[0m");
        int result21 = (int) Math.pow(x + 3, 2);//(x + 3) * (x + 3);
        System.out.println("(x+3)" + "\u00B2" + " = " + result21);
        System.out.println();

        int result22 = (3 + 4 * x) / 5 - (10 * (y - 5) * (a + b + c) / x) + (9 * (4 / x + (9 + x) / y));
        System.out.println("result22 = " + result22);

        int result23 = ((5 * x + 7 * y) / (8 * x + 10 * y) * (x + y) / 3 * x - 7) /
                (a + b + c / d + (a + b) / (c + d) + a * b);
        System.out.println("result23 = " + result23);

        String line1 = " ________________";
        String line2 = "|";
        System.out.println(line1);
        System.out.println(line2 + " task " + line2 + " result " + line2);
        System.out.println(line1);
        System.out.println(line2 + " 21   " + line2 + "  " + result21 + "    " + line2);
        System.out.println(line1);
        System.out.println(line2 + " 22   " + line2 + "  " + result22 + "    " + line2);
        System.out.println(line1);
        System.out.println(line2 + " 23   " + line2 + "  " + result23 + "     " + line2);


    }

}
