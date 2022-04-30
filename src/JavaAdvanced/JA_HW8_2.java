package JavaAdvanced;

public class JA_HW8_2 {

    public static String boolToWord(boolean b){
        if (b == true) return "Yes";
        else return "No";
    }

    public static Integer basicMath(String op, int v1, int v2) {
        if (op.equals("+")) return v1 + v2;
        if (op.equals("-")) return v1 - v2;
        if (op.equals("*")) return v1 * v2;
        if (op.equals("/")) return v1 / v2;
        return null;
    }

    public static int[] reverse(int n){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n - i;
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int findSmallestInt(int[] args)
    {
        int min = args[0];
        for(int i = 1; i < args.length; i++)
        {
            if (args[i] < min)
            {
                min = args[i];
            }
        }
        return min;
    }

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static String correct(String string) {
        //if (string.contains("5")) {return string.replaceAll("5", "S");}
        //if (string.contains("0")) {return string.replaceAll("0", "O");}
        //if (string.contains("1")) return string.replaceAll("1", "I");
        //return null;
        return string.replaceAll("5", "S").
                replaceAll("0", "O").replaceAll("1", "I");
    }

    public static void main(String[] args) {
        //kata1
//        Complete the method that takes a boolean value and return a "Yes"
//        string for true, or a "No" string for false.
        boolean b = true;
        System.out.println(boolToWord(b));

//        kata2
//        Your task is to create a function that does four basic mathematical operations.
//        The function should take three arguments - operation(string/char), value1(number), value2(number).
//        The function should return result of numbers after applying the chosen operation.
        int v1 = 4;
        int v2 = 7;
        String op = "/";
        System.out.println(basicMath(op, v1, v2));

//        kata3
//        Build a function that returns an array of integers from n to 1 where n>0.
//        Example : n=5 --> [5,4,3,2,1]
        int n = 5;
        System.out.println(reverse(n));


        System.out.println(findSmallestInt(new int[]{34, 15, 88, 2}));

        //kata4
//        Write a function to split a string and convert it into an array of words.
        System.out.println(stringToArray("Robin Singh"));

//        kata5
//        Character recognition software is widely used to digitise printed texts.
//        Thus the texts can be edited, searched and stored on a computer.
//        When documents (especially pretty old ones written with a typewriter),
//            are digitised character recognition softwares often make mistakes.
//        Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
//
//        S is misinterpreted as 5
//        O is misinterpreted as 0
//        I is misinterpreted as 1
//        The test cases contain numbers only by mistake.
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));

    }
}
