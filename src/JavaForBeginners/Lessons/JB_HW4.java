package JavaForBeginners.Lessons;

public class JB_HW4 {

    public static String ResultClassScore(int nScore) {
        String result;
        if (nScore == 5) {
            result = "выдать похвальную грамоту и перевести в следующий класс";
            return result;
        } else if (nScore == 4) {
            result = "перевести в следующий класс";
            return result;
        } else if (nScore == 3) {
            result = "дать задание на лето и перевести в следующий класс";
            return result;
        } else if (nScore == 2) {
            result = "вызвать родителей и оставить в текущем классе на второй год";
            return result;
        } else {
            result = "Все очень плохо";
            return result;
        }
//        System.out.println("ku " + result);
//        return result;
    }

    public static Double CelsiusToFahrenheit(double tempC) {
        Double tempF = (tempC * 9 / 5) + 32;
        return tempF;
    }

    public static int remainder(int x, int y) {
        int result = x % y;
        return result;
    }

    public static void testNum(String sNum, String sCondition) {

        System.out.println();
        System.out.println("\u001B[32m" + sNum + ". " + sCondition + "\u001B[0m");
        System.out.println();

    }

    public static void main(String[] args) {

        testNum("3", "Записать в виде кода следующие логические выражения");

        System.out.println("1. 2 = 2 И 7 = 7:");
        System.out.println((2 == 2) && (7 == 7));

        System.out.println("2. Не(15 < 3):");
        System.out.println(!(15 < 3));

        System.out.println("3. (Сосна = Дуб) ИЛИ (Вишня = Клён)");
        System.out.println(("Сосна" == "Дуб") || ("Вишня" == "Клён"));

        System.out.println("4. Не(Сосна = Дуб)");
        System.out.println(!("Сосна" == "Дуб"));

        System.out.println("5. (Не(15 < 3)) И (10 > 20)");
        System.out.println((!(15 < 3)) && (10 > 20));

        System.out.println("6. (Глаза даны, чтобы видеть) И (Под третьим этажом находится второй этаж)");
//        System.out.println(("Глаза даны, чтобы видеть") && ("Под третьим этажом находится второй этаж"));

        System.out.println("7. (6/2 = 3) ИЛИ (7*5 = 20)");
        System.out.println(((6 / 2) == 3) || ((7 * 5) == 20));

        testNum("4", "Записать в виде кода следующие логические выражения");

        System.out.println("1. (В минуте 70 секунд) ИЛИ (Работающие часы показывают время)");

        System.out.println("2. !(28 > 7) И !(300/5 = 60)");
        System.out.println((!(28 > 7)) && (!((300 / 5) == 60)));

        System.out.println("3. (Телевизор - электрический прибор) И (Стекло - дерево)");
        System.out.println(("Телевизор" == "электрический прибор") && ("Стекло" == "дерево"));

        System.out.println("4. Не((300 < 100))  → (Жажду можно утолить водой)");
        String format = (((300 < 400)) ? "Жажду можно утолить водой" : "\n");
        System.out.printf(format);
        System.out.println();

        System.out.println("5. (75 < 81) → (88 = 88)");
        format = ((75 < 81) ? "88 = 88" : "\n");
        System.out.printf(format);
        System.out.println();

        testNum("5", "Записать в виде кода следующие выражения:\n" +
                "\tа) Андрей старше Светы. Наташа старше Светы.\n" +
                "б) На полке стоят учебники, а на столе лежат справочники.\n" +
                "в) Большая часть детей — девочки. Остальные - мальчики)\n");

        int nAgeAndrew = 35;
        int nAgeSveta = 20;
        int nAgeNatali = 40;
        format = (((nAgeAndrew > nAgeSveta) && (nAgeNatali > nAgeSveta)) ?
                "а) Андрей старше Светы. Наташа старше Светы" : "\n");
        System.out.printf(format);

        String str1 = "Полка";
        String str2 = "Стол";
        format = (((str1 == "Полка") && (str2 == "Стол")) ?
                "б) На полке стоят учебники, а на столе лежат справочники" : "\n");
        System.out.printf(format);

        int quantGirls = 50;
        int quantBoy = 30;
        format = ((quantGirls > quantBoy) ? "в) Большая часть детей — девочки. " +
                "Остальные - мальчики" : "\n");
        System.out.printf(format);

        testNum("6", "Водительские права можно получить, только когда исполнится 16 лет");

        int nAge = 33;
        format = ((nAge > 16) ? "Водительские права можно получить, только когда исполнится 16 лет" : "\n");
        System.out.printf(format);

        testNum("7", "Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно");

//        String sName = "Петя";
//        String sAct = "едет";
//        String sTransport = "в автобусе";
//        System.out.println(sName + !sAct + sTransport);

        testNum("8", "Если с другом ты, это хорошо, а когда наоборот - плохо");

        testNum("9", "Записать выражения в виде условий if-else");

        int nYourAge = 20;
        if (nYourAge > 18) {
            System.out.println("Ты взрослый");
        } else {
            System.out.println("Ты ребенок");
        }

        String sLandCondition = "влажная";
        if (sLandCondition == "сухая") {
            System.out.println("Нет дождя");
        } else if (sLandCondition == "мокрая") {
            System.out.println("Идет дождь");
        } else {
            System.out.println("Идет снег");
        }

        String sSkyCondition = "облака";
        if (sSkyCondition == "тучи") {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет “слепой” дождь");
        }

        String sDay = "Понедельник";
        if (sDay == "Суббота") {
            System.out.println("Завтра воскресенье");
        } else if (sDay == "Пятница") {
            System.out.println("Вчера был четверг");
        } else {
            System.out.println("Иначе вчера был не четверг, а завтра - не воскресенье");
        }

        String sActCrawfish = "свистнул";
        if (sActCrawfish == "свистнул") {
            System.out.println("прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }

        nYourAge = 18;
        Boolean bSchool = true; // true - leave school, false - study
        if (nYourAge >= 18 && bSchool == true) {
            System.out.println("ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }

        testNum("10", "Проверьте число на четность. Если число четное, " +
                "удвойте это число, иначе возведите число в квадрат");

        int nNum = 0;
        if ((nNum % 2) == 0) {
            nNum = nNum * 2;
            System.out.println("nNum = " + nNum);
        } else {
            nNum = nNum * nNum;
            System.out.println("nNum = " + nNum);
        }

        testNum("11", "Напишите алгоритм проверки " +
                "возраста на соответствие условиям (if-else)");

        nYourAge = 102;
        if (nYourAge < 5) {
            System.out.println("Вы еще слишком малы");
        } else if (nYourAge >= 5) {
            if (nYourAge < 16) {
                System.out.println("Можно ходить в школу");
            } else if (nYourAge >= 16 && nYourAge < 18) {
                System.out.println("Можно водить машину и ходить в школу");
            } else if (nYourAge >= 18) {
                System.out.println("Можно голосовать и водить машину");
            }
        }

        testNum("12", "Напишите алгоритм программы, которая проверяет оценку " +
                "ученика и выполняет следующие действия");

        int nScore = 0;
//        String result;
//        switch (nScore) {
//            case 5:
//                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
//                result = "выдать похвальную грамоту и перевести в следующий класс";
//                break;
//            case 4:
//                System.out.println("перевести в следующий класс");
//                result = "перевести в следующий класс";
//                break;
//            case 3:
//                System.out.println("дать задание на лето и перевести в следующий класс");
//                result = "дать задание на лето и перевести в следующий класс";
//                break;
//            case 2:
//                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
//                result = "вызвать родителей и оставить в текущем классе на второй год";
//                break;
//            default:
//                System.out.println("Все очень плохо");
//                break;
//        }

        ResultClassScore(0);

//        nScore = 5;
//        if (result.equals("выдать похвальную грамоту и перевести в следующий класс")) {
//            System.out.println("It's ok");
//        }

        testNum("13", "Напишите алгоритм программы, которая проверяет 2 числа. " +
                "Программа складывает числа, которые делятся на 3 без остатка, " +
                "и вычитает числа, которые делятся на 5 без остатка. " +
                "Программа умножает числа, которые делятся на 2 без остатка, " +
                "но если хотя бы одно число отрицательное, программа умножает результат " +
                "предыдущего действия на (-1).\n" +
                "Если числа не прошли ни одну проверку, программа выводит на печать " +
                "ошибку о невозможности произвести действия");

        int nNum1 = 378;
        int nNum2 = 36;
        int nResult;
        if (((nNum1 % 3) == 0) && ((nNum2 % 3) == 0)) {
            nResult = nNum1 + nNum2;
            System.out.println("Сумма чисел, кратных трем, равна = " + nResult);
        } else if (((nNum1 % 5) == 0) && ((nNum2 % 5) == 0)) {
            nResult = nNum1 - nNum2;
            System.out.println("Разница чисел, кратных пяти, равна = " + nResult);
        } else if (((nNum1 % 2) == 0) && ((nNum2 % 2) == 0)) {
            if (nNum1 < 0 || nNum2 < 0) {
                nResult = nNum1 * nNum2 * (-1);
                System.out.println("Произведение чисел, кратных двум, равна = " + nResult);
            } else {
                nResult = nNum1 * nNum2;
                System.out.println("Произведение чисел, кратных двум, равна = " + nResult);
            }
        } else {
            System.out.println("Error");
        }

        testNum("14", "Распечатать следующие выражения, " +
                "используя метод и параметры");

        int k = 5;//150;
        int l = 10; //7;
        int m = 15; //23;

        System.out.println(remainder(k, l));

        testNum("17", "Напишите метод, который примет " +
                "на вход параметр температуры в Цельсиях, и распечатает " +
                "результат температуры в Цельсиях и в Фаренгейтах");

        Double tempC = 123.2;
        System.out.println("" + tempC + " градусов по Цельсию равно "
                + CelsiusToFahrenheit(tempC) + " градусов по Фаренгейту");

        testNum("21", "Напишите алгоритм программы, " +
                "которая проверяет число типа short на количество разрядов, " +
                "и выводит результат проверки");

        short nNumber = 32767;
        short nTemp = nNumber;
        short nDischarge = 10;
        int n = 0;
        while (nNumber != 0) {
            n++;
            nNumber = (short) (nNumber / nDischarge);
        }
        System.out.println("Number " + nTemp + " is " + n + " discharge number");
    }
}
