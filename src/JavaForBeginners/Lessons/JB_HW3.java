package JavaForBeginners.Lessons;

import java.text.DecimalFormat;

public class JB_HW3 {
    public static void main(String[] args) {

        System.out.println("\u001B[32m" + "2. Создать переменные a и b типа byte, " +
                "присвоить им значения из допустимого диапазона" + "\u001B[0m");

        byte a = 124;
        byte b = -32;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println();

        System.out.println("\u001B[32m" + "3. Создать переменные s и t типа short, " +
                "присвоить им негативное и позитивное значения с разницей 60000" + "\u001B[0m");

        short s = -30000;
        short t = (short) (s + 60000);
        System.out.println("s = " + s + ", t = " + t);
        System.out.println();

        System.out.println("\u001B[32m" + "4. Создать переменную i типа int и присвоить ей минимально " +
                "возможное значение этого типа. Затем присвоить максимально возможное " +
                "значение этого типа. Распечатать оба значения в виде таблицы" + "\u001B[0m");

        int i = Integer.MIN_VALUE;
        String sHLine = "__________________________";
        String sVLineL = "| ";
        String sVLineR = "  |";
        System.out.println(sHLine);
        System.out.println(sVLineL + "int min " + sVLineL + i + sVLineR);
        System.out.println(sHLine);
        i = Integer.MAX_VALUE;
        System.out.println(sVLineL + "int max " + sVLineL + i + sVLineR);
        System.out.println(sHLine);
        System.out.println();

        System.out.println("\u001B[32m" + "5. Создать переменную phoneNumber и присвоить ей " +
                "значение номера телефона с кодом страны и города" + "\u001B[0m");

        long phoneNumber = 380487513563L;
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println();

        System.out.println("\u001B[32m" + "6. Создать переменную f типа float и " +
                "присвоить ей значение 100.101101. Создать переменную d типа double " +
                "и присвоить ей значение 100.101101." + "\u001B[0m");

        float f = 100.101101f;
        double d = 100.101101;

        String strF = String.format("| float  f = 100.101101   | %s |", f);
        String strD = String.format("| double d = 100.101101   | %s |", d);
        System.out.println(strF);
        System.out.println(strD);
        System.out.println();

        System.out.println("\u001B[32m" + "7. a) Создать переменную типа Double с именем dd  " +
                "и инициализировать её результатом суммы чисел 10.09999 и 20.099999. \n" +
                "b) Создать переменную типа Float с именем ff  и инициализировать " +
                "её результатом суммы чисел 10.09999 и 20.099999." + "\u001B[0m");

        Double dd = (double) (10.09999 + 20.099999);
        Float ff = (float) (10.09999 + 20.099999);

        //DecimalFormat dF = new DecimalFormat( "#.##########" );
        String strDD = String.format("| double dd =             | %s |", dd);
        String strFF = String.format("| Float  ff =             | %s |", ff);
//        System.out.println(dF.format(dd));
//        System.out.println(dF.format(ff));
        System.out.println(strDD);
        System.out.println(strFF);
        System.out.println();

        System.out.println("\u001B[32m" + "8. Создать переменную result и присвоить ей " +
                "значение выражения 10 / 3 (с максимальной точностью)" + "\u001B[0m");

        Double result = (double) (10.0 / 3);
        System.out.println(result);
        System.out.println();

        System.out.println("\u001B[32m" + "9. Создать переменные sum, product, " +
                "quotient и remainder, и  присвоить им значения " +
                "вычислений переменных f и d" + "\u001B[0m");

        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;
        System.out.println("sum = " + sum + ", product = " + product +
                ", quotient = " + quotient + ", remainder = " + remainder);
        System.out.println();

        System.out.println("\u001B[32m" + "10. Распечатать слово HELLO точками" + "\u001B[0m");

        System.out.println("*  *  *** *   *     *" + '\n'
                + "*  *  *   *   *   *   *" + '\n'
                + "****  *** *   *  *     *" + '\n'
                + "*  *  *   *   *   *   *" + '\n'
                + "*  *  *** *** ***   *" + '\n');
        System.out.println();

        System.out.println("\u001B[32m" + "11. Создать переменные подходящего " +
                "ссылочного типа данных(выбирать минимально достаточный диапазон значений)" + "\u001B[0m");

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = -1000000.001;
        Short t9 = 1010;
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        System.out.println("t6 = " + t6);
        System.out.println("t7 = " + t7);
        System.out.println("t8 = " + t8);
        System.out.println("t9 = " + t9);
        System.out.println();

        System.out.println("\u001B[32m" + "12. С помощью полей классов ссылочного " +
                "типа распечатать таблицу" + "\u001B[0m");

        System.out.println("| Type      | Size in bits |     min                   |     max                   |");
        System.out.println("| byte      | " + Byte.SIZE + "            |    " + Byte.MIN_VALUE
                + "                   |    " + Byte.MAX_VALUE + "                    |");
        System.out.println("| short     | " + Short.SIZE + "           |    " + Short.MIN_VALUE
                + "                 |    " + Short.MAX_VALUE + "                  |");
        System.out.println("| Integer   | " + Integer.SIZE + "           |    " + Integer.MIN_VALUE
                + "            |    " + Integer.MAX_VALUE + "             |");
        System.out.println("| Long      | " + Long.SIZE + "           |    " + Long.MIN_VALUE
                + "   |    " + Long.MAX_VALUE + "    |");
        System.out.println("| Float     | " + Float.SIZE + "           |    " + Float.MIN_VALUE
                + "                |    " + Float.MAX_VALUE + "           |");
        System.out.println("| Double    | " + Double.SIZE + "           |    " + Double.MIN_VALUE
                + "               |    " + Double.MAX_VALUE + " |");

        System.out.println();

        System.out.println("\u001B[32m" + "13. Создать 2 переменные референсного типа Integer" +
                " - num1 и num2, присвоить им одинаковые значения, сравнить 2 переменные " +
                "друг с другом с помощью метода .equal. Вывести результат сравнения " +
                "на печать в виде выражения:\n" +
                "“Если num1 = num2, то результат сравнения методом .equal = …”\n" + "\u001B[0m");

        Integer num1 = 356;
        Integer num2 = 357;

        if (num1.equals(num2) == true) {
            System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));
        } else {
            System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));
        }
        System.out.println();

        System.out.println("\u001B[32m" + "14. Создать 2 переменные примитивного типа int - number1 " +
                "and number2. Инициализаровать их\n" +
                "а) одинаковыми значениями\n" +
                "b) number1 < number2\n" +
                "c) number1 > number2\n" +
                "сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет)" + "\u001B[0m");

        int number1 = 500;
        int number2 = 620;

        if (Integer.compare(number1, number2) == 0) {
            System.out.println("Если number1 = number2, то результат сравнения методом compare == "
                    + Integer.compare(number1, number2));
        } else if (Integer.compare(number1, number2) < 0) {
            System.out.println("Если number1 < number2, то результат сравнения методом compare = "
                    + Integer.compare(number1, number2));
        } else if (Integer.compare(number1, number2) > 0) {
            System.out.println("Если number1 > number2, то результат сравнения методом compare = "
                    + Integer.compare(number1, number2));
        }
        System.out.println();

        System.out.println("\u001B[32m" + "15. Создать переменную типа Float, присвоить " +
                "ей значение 234.9999 и распечатать значение в int" + "\u001B[0m");

        Float numF = 234.9999F;
        System.out.println("numF = " + numF.intValue());
        System.out.println();

        System.out.println("\u001B[32m" + "16. С помощью метода sum() " +
                "класса Double посчитать сумму двух переменных типа double" + "\u001B[0m");

        Double k = 236.56;
        Double l = 3789.19;

        System.out.println("k + l = " + Double.sum(k, l));
        System.out.println();

        System.out.println("\u001B[32m" + "17. С помощью метода sum() " +
                "класса Integer посчитать сумму двух переменных типа Float.\n" + "\u001B[0m");

        Float p = 489.123F;
        Float h = -3789.753F;

        System.out.println("p + h = " + Integer.sum(p.intValue(), h.intValue()));
        System.out.println();

        System.out.println("\u001B[32m" + "18. Создать 2 переменные типа Short" +
                "и найти их сумму методом класса" + "\u001B[0m");

        Short short1 = 12000;
        Short short2 = 12300;
        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));

        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));
        System.out.println();

        System.out.println("\u001B[32m" + "19. Создать переменные:\n" +
                "String str1 = \"123.56\";\n" +
                "String str2 = \"123.55\";\n" +
                "Double doub1 = 123.56;\n" +
                "Double doub2 = 123.55;\n" +
                "\n" +
                "Распечатать результат doub1 - doub2\n" +
                "\n" +
                "Используя методы ссылочного типа данных, посчитать " +
                "и распечатать результат str1 - str2\n" + "\u001B[0m");

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;
        Double resD = Double.parseDouble(str1) - Double.parseDouble(str2);

        System.out.println("doub1 - doub2 = " + Double.sum(doub1, -doub2));
        System.out.println("str1 - str2 = " + resD);
        System.out.println();

        System.out.println("\u001B[32m" + "20. Создать переменную подходящего типа " +
                "данных для хранения результатов измерения температуры тела кота " +
                "(значения температуры в Цельсиях). Присвоить этой переменной " +
                "сначала максимальное значение, затем минимальное значение. " +
                "Посчитать и распечатать среднее значение, округленное с помощью " +
                "метода класса Math. Распечатать результат среднего значения " +
                "температуры тела кота." + "\u001B[0m");

        Double temp = (39.5 + 38) / 2;
        System.out.println("average temperature = " + Math.round(temp));
        System.out.println();

        System.out.println("\u001B[32m" + "21. Создать переменную n типа Number, " +
                "присвоить ей максимально возможное значение." +
                "Присвоить n значение 10," +
                "затем присвоить n значение 10.999999999" + "\u001B[0m");

        Number n;// = Double.MAX_VALUE;
        System.out.println("Переменная n может принимать значения:");
        System.out.println("n = " + Double.MAX_VALUE);
        n = 10;
        System.out.println("n = " + n.byteValue());
        n = 10.999999999;
        System.out.println("n = " + n.doubleValue());
        System.out.println("Это возможно, потому что n имеет тип " + n.getClass());
        System.out.println();

        System.out.println("\u001B[32m" + "22. Создать переменную Integer " +
                "numberInteger = 100." +
                "Доказать, что numberInteger имеет тип Integer," +
                "а numberInteger.toString() имеет тип String" + "\u001B[0m");

        Integer numberInteger = 100;
        System.out.println("type of numberInteger " + numberInteger.getClass());
        System.out.println("type of numberInteger.toString() "
                + numberInteger.toString().getClass());
        System.out.println();

        System.out.println("\u001B[32m" + "23. Вывести на экран следующие выражения, " +
                "используя для печати только переменные:"
                + "“36.6 градусов по Цельсию  = … градусов по Фаренгейту”, " +
                "где значение по Фаренгейту должно быть вычислено по формуле"
                + "“50 kilogram = … lbs,  50 lb = … kg”, где значения должны " +
                "быть вычислены по формулам" + "\u001B[0m");

        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );

        Double tempC = 36.6;
        Double tempF = (tempC * 9 / 5) + 32;
        String strC = " градусов по Цельсию";
        String strFr = " градусов по Фаренгейту";
        String strEq = " = ";


        System.out.println("" + tempC + strC + strEq + decimalFormat.format(tempF) + strFr);
        System.out.println();

        Double nKg = 50.0;
        Double nLbs = nKg * 2.205;
        String strKg = " килограмм";
        String strLbs = " фунт";

        System.out.println("" + nKg + strKg + strEq + decimalFormat.format(nLbs) + strLbs);
        System.out.println();

        nLbs = 50.0;
        nKg = nLbs / 2.205;

        System.out.println("" + nLbs + strLbs + strEq + decimalFormat.format(nKg) + strKg);


    }
}
