package JavaForBeginners.Lessons;

public class test12 {
    public static String strClassScore(int nScore) {
        String str;
        if (nScore == 5) {
            str = "выдать похвальную грамоту и перевести в следующий класс";
        } else if (nScore == 4) {
            str = "перевести в следующий класс";
        } else if (nScore == 3) {
            str = "дать задание на лето и перевести в следующий класс";
        } else if (nScore == 2) {
            str = "вызвать родителей и оставить в текущем классе на второй год";
        } else {
            str = "Все очень плохо";
        }
        return str;
    }

    public static void main (String[] args) {

        String testStr = "выдать похвальную грамоту и перевести в следующий класс";
        if (strClassScore(5).equals(testStr)) {
            System.out.println("OK");
        }
        else {
            System.out.println("No");
        }

    }
}
