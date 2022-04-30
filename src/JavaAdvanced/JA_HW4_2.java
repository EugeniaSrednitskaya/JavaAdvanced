package JavaAdvanced;

public class JA_HW4_2 {
    public static void main(String[] args) {

        System.out.println("\u001B[32m" + "1. Дана строка: \n" +
                "String s = “Перестановочный алгоритм быстрого действия”;\n" +
                "необходимо вывести все буквы “о” из этой строки.\n" +
                "Для указанной строки ответ будет “ооооо” (или в столбик)\n" + "\u001B[0m");

        String s1 = "Перестановочный алгоритм быстрого действия";
        String strO = "";
        for (int i = 0; i < s1.length(); i += 1) {
            if (s1.regionMatches(i, "о", 0, 1)) {
                strO = strO + "o";
            }

        }

        System.out.println(strO);
        System.out.println();

        System.out.println("\u001B[32m" + "2. Дана строка:\n" +
                "String s = “Перевыборы выбранного президента”;\n" +
                "необходимо подсчитать количество букв “е” в строке.\n" +
                "Для указанной строки ответ будет 4\n" + "\u001B[0m");

        String s2 = "Перевыборы выбранного президента";
        int quant_s2 = 0;
        for (int i = 0; i < s2.length(); i += 1) {
            if (s2.regionMatches(i, "е", 0, 1)) {
                quant_s2 = quant_s2 + 1;
            }
        }

        System.out.println("Количество букв 'е' = " + quant_s2);
        System.out.println();

        System.out.println("\u001B[32m" + "3. Дана строка:\n" +
                "String s = “Посмотрите как Рите нравится ритм”;\n" +
                "необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.\n" +
                "Для указанной строки ответ будет 6, 15, 29\n" + "\u001B[0m");

        String s3 = "Посмотрите как Рите нравится ритм";
        String sFind3 = "рит";
        for (int i = 0; i < s3.length(); i += 1) {
            if (s3.regionMatches(true, i, sFind3, 0, sFind3.length())) {
//                System.out.println(s2.regionMatches(false, i, sFind3, 0, sFind3.length()));
                System.out.println(i);
            }
        }

        System.out.println();

        System.out.println("\u001B[32m" + "4. Дан массив:\n" +
                "String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};\n"
                + "необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”\n" + "\u001B[0m");

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        String sFindArray = "е";
        int quantArray = 0;
        int q = 0;

        for (int i = 0; i < array.length; i += 1) {
            for (int j = 0; j < array[i].length; j += 1) {
                if (array[i][j].contains("е")) {
                    continue;
                }
                else {
                    quantArray += 1;
                }
            }
        }

        System.out.println("Количество строк без букв Е = " + quantArray);
    }
}
