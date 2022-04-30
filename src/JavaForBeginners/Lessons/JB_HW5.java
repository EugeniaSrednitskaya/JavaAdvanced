package JavaForBeginners.Lessons;

import javax.management.ObjectName;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class JB_HW5 {

    static String[] arrayDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static String getDayofWeek(int num) {
        String sDayWeek;
        switch (num) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "No days";
        }
    }

    public static Boolean verifyEquals(String[] expectedResult, String actualResult) {

        return Arrays.asList(expectedResult).contains(actualResult);
    }

//    public static OptionalDouble getAverageArray (Double[] arrayTemperature) {
//        //Stream<Double> average = Arrays.stream(arrayTemperature)
//        OptionalDouble doubleAverage;
//        doubleAverage = DoubleStream.of(arrayTemperature).average();
//        return doubleAverage;//Arrays.stream(arrayTemperature).sum(); // average().orElse(Double.NaN);
//    }
//    public static Double verifyEquals (Double expectedResult, Double actualResult) {}

    public static void verifyDayOfWeek(Date dDate) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(dDate);

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;

        getDayofWeek(dayOfWeek);

        DateFormat formData = new SimpleDateFormat("EEEE", Locale.getDefault());
        //DateFormat formData = new SimpleDateFormat("dd-MM-yyyy", new Locale("English"));

        System.out.println("Результат проверки дня недели, полученного методом\n" +
                "для подбора дня по заданному порядковому номеру дня, и через методы класса: \n"
                + verifyEquals(arrayDay, formData.format(dDate)));

    }

    public static Double getMaxValue(Double x, Double y, Double z) {
        Double lagest = x;
        if (y > x && y > z) {
            lagest = y;
        } else if (z > x && z > y) {
            lagest = z;
        }
        return lagest;
    }

    public static Double getMinValue(Double x, Double y, Double z) {
        Double smallest = x;
        if (y < x && y < z) {
            smallest = y;
        } else if (z < x && z < y) {
            smallest = z;
        }
        return smallest;
    }

    public static void setArrayDay(String[] arrayDay) {
        JB_HW5.arrayDay = arrayDay;
    }

    public static Double getAverage(Double[] array) {
        Double avr = 0.0;
        for (int i = 0; i < array.length; i += 1) {
            avr = avr + array[i];
        }
        avr = avr / array.length;
        return avr;
    }

    public static String getMoney(Float money) {
        String sMoney;
        if (money < 0) {
            //System.out.println("Количество денег не может быть отрицательным");
            sMoney = "Количество денег не может быть отрицательным";
        } else {
            Integer rubles = money.intValue();
            Integer coins = (int) ((money - rubles) * 100);

            String strCoins = String.format("%02d", coins);//decimalFormat.format(coins);
            sMoney = rubles.toString() + " рублей " + strCoins + " коп";
        }
        return sMoney;
    }

    public static void verifyEquals(float money) {//, String expectedResult, String actualResult) {
        NumberFormat formatMoney = NumberFormat.getCurrencyInstance();
        String moneyString = formatMoney.format(money);
        System.out.println(moneyString);
//        String sm = String.format("%.2f", money);
//        System.out.println(sm);

    }

    public static void getWeight(Float weight) {
        if (weight >= 0) {
            int kilos = weight.intValue();
            int grams = (int) ((weight - kilos) * 1000);
            System.out.println(kilos + " кг " + grams + " г");
        } else {
            System.out.println("Вес не может быть отрицательным");
        }

    }

    public static Float getCost(Float price, Float quant) {
//        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
//        String result = decimalFormat.format(price * quant);
        Float scale = (float) Math.pow(10, 2);
        return (float) Math.ceil(price * quant * scale) / scale;
    }

    public static Float getSalary(Integer worksHours, Float costPerHourOfWork, Integer monthlyNormDays) {
        return worksHours * costPerHourOfWork * monthlyNormDays;
    }

    public static void getResultConditionalOperator(Float x) {
        if (x < 0) {
            System.out.println("X is negative");
        } else if (x > 0) {
            System.out.println("X is positive");
        } else {
            System.out.println("X is zero");
        }
    }

    public static Integer getHappyNumber(Integer year) {
        Integer d1;
        Integer d2;
        Integer d3;

        d1 = (year - year % 1000) / 1000 + (year % 1000) / 100 + (year % 100) / 10 + year % 10;
        d2 = (d1 % 100) / 10 + d1 % 10;
        d3 = (d2 % 100) / 10 + d2 % 10;

        return d3;
    }

    public static Double getAverageNum(Double num1, Double num2, Double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static Double getMedianNum(Double num1, Double num2, Double num3) {

        Double mediumNum = 0.0;

        if (!Objects.equals(num1, getMinValue(num1, num2, num3))
                && !Objects.equals(num1, getMaxValue(num1, num2, num3))) {
            mediumNum = num1;
        }
        if (!Objects.equals(num2, getMinValue(num1, num2, num3))
                && !Objects.equals(num1, getMaxValue(num1, num2, num3))) {
            mediumNum = num2;
        }
        if (!Objects.equals(num3, getMinValue(num1, num2, num3))
                && !Objects.equals(num1, getMaxValue(num1, num2, num3))) {
            mediumNum = num3;
        }
        return mediumNum;
    }

    public static Double comparisonAverageMedian(Double numAverage, Double numMedian) {
        return numAverage - numMedian;
    }

    public static Double comparisonAverageMedianMath(Double num1, Double num2, Double num3) {

        Double numMin = Math.min(num1, Math.min(num2, num3));
        Double numMax = Math.max(num1, Math.max(num2, num3));

        Double numMedian = Math.max(Math.min(num1, num2), Math.min(Math.max(num1, num2), num3));

        Double numAverage = getAverageNum(num1, num2, num3);

        return Math.abs(numMedian - numAverage);
    }

    public static Double getFormula(int a, int b, int c) {

        return Math.ceil(Math.sqrt((a * b + c) * Math.pow(a, b)) / Math.PI);
    }

    public static Integer getRandomNumber(int min, int max) {
        return (int) (Math.random() * ++max) + min;
    }

    public static Boolean getLeapYear(int year) {
        boolean isLeapYear;
        if ( (year % 4) == 0 && (year % 100) != 0) {
            isLeapYear = true;
        }
        else isLeapYear = false;
        return isLeapYear;
    }

    public static void main(String[] args) {

        System.out.println("\u001B[32m" + "2. Написать метод, который принимает " +
                "на вход число от 1 до 7  и возвращает день недели" + "\u001B[0m");

        System.out.println("Результат соответствие названия дня недели,\n" +
                "который возвращается методом выбора названя дня по номеру дни недели,\n" +
                "со массивом - справочником дней недели: " +
                "\u001B[31m" + verifyEquals(arrayDay, getDayofWeek(1)) + "\u001B[0m");

        System.out.println();

        Calendar calendar = Calendar.getInstance();//new GregorianCalendar(2022, 2,29) ;
        calendar.set(2022, 03, 29);
        Date date = calendar.getTime();
        verifyDayOfWeek(date);

        System.out.println();

        System.out.println("\u001B[32m" + "3. Дано три числа, определить наибольшее" +
                " и присвоить значение новой перменной" + "\u001B[0m");

        Double x = 38.56;
        Double y = 78.78;
        Double z = 369.01;

        System.out.println("Наибольшее число из трех = " + getMaxValue(x, y, z));
        System.out.println();

        System.out.println("\u001B[32m" + "4. Дано три числа, определить наименьшее" +
                " и присвоить значение новой перменной" + "\u001B[0m");

        System.out.println("Наименьшее число из трех = " + getMinValue(x, y, z));
        System.out.println();

        System.out.println("\u001B[32m" + "5. Написать алгоритм вычисления среднего " +
                "значения из 5 показателей температуры тела кота" + "\u001B[0m");

        Double[] arrayTemperature = {38.0, 38.2, 38.4, 39.0, 39.3};
        System.out.println("Средняя температура кота " + getAverage(arrayTemperature));
        System.out.println();

        System.out.println("\u001B[32m" + "6. Написать метод, " +
                "который принимает на вход десятичное число (например, 10.75), " +
                "и возвращает строку “10 руб 75 коп”.\n" + "\u001B[0m");

        Float money = 10.13F;
        System.out.println(getMoney(money));
        verifyEquals(money);
        System.out.println();

        System.out.println("\u001B[32m" + "7. Написать метод, который принимает " +
                "на вход десятичное число и возвращает строку “10 кг 75 гр”" + "\u001B[0m");

        Float weight = 10.075F;
        getWeight(weight);
        System.out.println();

        System.out.println("\u001B[32m" + "8. Написать метод, который принимает " +
                "на вход 2 параметра -  цену и количество товара " +
                "(может быть вес товара, или количество в штуках). " +
                "Алгоритм возвращает сумму покупки в виде десятичного числа" + "\u001B[0m");

        Float price = 34.55F;
        Float quant = 1236.54F;
        System.out.println(getCost(price, quant));
        System.out.println();

        System.out.println("\u001B[32m" + "9. Написать метод, который принимает " +
                "на вход необходимые параметры, и печатает чек" + "\u001B[0m");

        String product = "Яблоки";
        String sLine = "_____________________________";
        price = 50.13F;
        weight = 3.4F;
        System.out.println(product);
        System.out.println("Цена за 1 кг        " + price);
        System.out.println("Количество товара   " + weight);
        System.out.println(sLine);
        System.out.println("Сумма к оплате      " + getMoney(getCost(price, weight)));
        System.out.println();

        System.out.println("\u001B[32m" + "10. Написать метод, который принимает " +
                "на вход количество часов работы в день и " +
                "стоимость одного часа работы, и возвращает заработную плату в месяц." + "\u001B[0m");

        Integer worksHours = 8;
        Float costPerHourOfWork = 350.26F;
        Integer monthlyNormDays = 20;
        System.out.println(getSalary(worksHours, costPerHourOfWork, monthlyNormDays));
        System.out.println();

        System.out.println("\u001B[32m" + "11. Написать метод, который принимает " +
                "на вход необходимые параметры и печатает строку " +
                "ведомости выдачи зарплаты сотрудникам" + "\u001B[0m");

        String sMonth = "Март 2022";
        String[] sEmployee = {"Смирнова Мария Ивановна", "Серебряков Иван Петрович"};
        Float[] fSalary = {70000.00F, 128059.00F};

        System.out.println(sMonth);
        for (int i = 0; i < sEmployee.length; i += 1) {
            System.out.println(sEmployee[i] + " " + getMoney(fSalary[i]));
        }
        System.out.println();

        System.out.println("\u001B[32m" + "12. Написать в виде метода" + "\u001B[0m");

        getResultConditionalOperator(0F);
        System.out.println();

        System.out.println("\u001B[32m" + "13. Написать метод, который принимает " +
                "на вход год рождения и возвращает ваше счастливое число. " +
                "Счастливое число рассчитывается по формуле: " +
                "сумма всех чисел, если результат больше 9, " +
                "снова считается сумма всех чисел" + "\u001B[0m");

        System.out.println(getHappyNumber(1999));
        System.out.println();

        System.out.println("\u001B[32m" + "14a. Дано 3 числа. Необходимо рассчитать " +
                "разницу между средним значением и медианой (median) значением. \n" +
                "Если разница больше 2, необходимо показать сообщение: " +
                "“Среднее значение … отличается от медианы … на … “.\n" +
                "Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”." + "\u001B[0m");

        Double num1 = 500.36;
        Double num2 = 54.78;
        Double num3 = 147.46;

        System.out.println(getAverageNum(num1, num2, num3));
        System.out.println(getMedianNum(num1, num2, num3));
        System.out.println(comparisonAverageMedian(getAverageNum(num1, num2, num3), getMedianNum(num1, num2, num3)));

        if (comparisonAverageMedian(getAverageNum(num1, num2, num3), getMedianNum(num1, num2, num3)).equals(0)) {
            System.out.println("Среднее значение равно медиане");
        } else if (!comparisonAverageMedian(getAverageNum(num1, num2, num3), getMedianNum(num1, num2, num3)).equals(0)) {
            System.out.println("Среднее значение " + getAverageNum(num1, num2, num3)
                    + " отличается от медианы " + getMedianNum(num1, num2, num3)
                    + " на " + comparisonAverageMedian(getAverageNum(num1, num2, num3), getMedianNum(num1, num2, num3)));
        }
        System.out.println();

        System.out.println("\u001B[32m" + "14b. Посчитать все то же самое с помощью " +
                "методов класса Math, где возможно их использовать" + "\u001B[0m");

        System.out.println(comparisonAverageMedianMath(num1, num2, num3));
        System.out.println();

        System.out.println("\u001B[32m" + "15. Написать метод, который использует методы " +
                "класса Math, принимает на вход сумму к оплате (например, 10.75) " +
                "и округляет сумму в пользу покупателя. Метод возвращает новую " +
                "сумму к оплате в виде строки, например “10 руб 00 коп”." + "\u001B[0m");

        Float amount = 10.75F;
        System.out.println(Math.floor(amount));
        System.out.println();

        System.out.println("\u001B[32m" + "16. Посчитать с помощью методов класса Math" + "\u001B[0m");

        int a = 3;
        int b = 4;
        int c = 20;

        System.out.println(getFormula(a, b, c));
        System.out.println();

        System.out.println("\u001B[32m" + "17_1. Write the java statement that assigns" +
                " 1 to x if y is greater than 0" + "\u001B[0m");

        int xInt;
        int yInt = 9;

        if (yInt > 0) {
            xInt = 1;
            System.out.println(xInt);
        } else {
            System.out.println("Y less zero");
        } ;

        System.out.println("\u001B[32m" + "17_2. Suppose that score is a variable of type double. " +
                "Write the java statement that increases the score by 5 " +
                "marks if score is between 80 and 90" + "\u001B[0m");

        double score = 100;
        if (score >= 80 && score <= 90) {
            score += 5;
        }
        else {
            System.out.println("Score not between 80 and 90");
        }

        System.out.println("\u001B[32m" + "17_3. Rewrite in Java the following statement " +
                "without using tne NOT (!) operator: item = ! ((i<10) || (v>=50))" + "\u001B[0m");

        int iInt = 0;
        int vInt = 100;
        if ((iInt > 10) || (vInt < 50)) {
            System.out.println("Ok");
        }
        else System.out.println("No");

        System.out.println("\u001B[32m" + "17_4. Write a java statement " +
                "that prints true if x is an odd number and positive" + "\u001B[0m");

        int xInt2 = 57;
        if ((xInt2 % 2) != 0 && xInt2 > 0) {
            System.out.println("true");
        }

        System.out.println(((xInt2 % 2) != 0 && xInt2 > 0) ? "true": "\n");

        System.out.println("\u001B[32m" + "17_5. Write a java statement " +
                "that prints true if both x and y are positive numbers" + "\u001B[0m");

        System.out.println((x > 0 && y > 0) ? "true": "\n");

        System.out.println("\u001B[32m" + "17_6. Write a java statement " +
                "that prints true if both x and y have the same sign" + "\u001B[0m");

        System.out.println(((x > 0 && y > 0) || (x < 0 && y < 0)) ? "true": "\n");

        System.out.println("\u001B[32m" + "18. Написать метод, который с помощью " +
                "методов класса Math высчитывает любую степень сгенерированного " +
                "случайного числа. Метод возвращает математически округленное целое " +
                "значение и выводит на экран: “Число … в степени … = …”" + "\u001B[0m");

        System.out.println();

        System.out.println("\u001B[32m" + "19. Написать метод, который возвращает " +
                "случайное число в пределах от 1 до 99 включительно" + "\u001B[0m");

        int min = 1;
        int max = 99;
        System.out.println(getRandomNumber(min, max));
        System.out.println();

        System.out.println("\u001B[32m" + "20. Assume that the following declarations have been" +
                "made two parameters. Write a fragment that will assign isLeapYear to true" +
                "if year represents a leap year and false otherwise" + "\u001B[0m");

        int year = 2024;
        boolean isLeapYear;
        System.out.println(getLeapYear(year));

    }
}

