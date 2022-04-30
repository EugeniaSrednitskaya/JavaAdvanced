package JavaAdvanced.JA_HW9_2;

public class MonthUtilities {
    private static final String[] TYPE_OF_PERIOD = new String[] {"Month", "Quarter", "HalfYear", "Year"};

    private static Month[] MONTH_ARRAY = {new Month("January", 31, 19),
            new Month("February", 28, 20),
            new Month("March", 31, 22),
            new Month("April", 30, 20),
            new Month("May", 31, 20),
            new Month("June", 30, 20),
            new Month("July", 31, 21),
            new Month("August", 31, 22),
            new Month("September", 30, 22),
            new Month("October", 31, 20),
            new Month("November", 30, 22),
            new Month("December", 31, 21)};

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }

    public static Month[] getQuarter(int numQuarter) {
        if (numQuarter == 1) {
            return new Month[]{new Month("January", 31, 19),
                    new Month("February", 28, 20),
                    new Month("March", 31, 22)};
        }
        else if (numQuarter == 2) {
            return new Month[] {new Month("April", 30, 20),
                    new Month("May", 31, 20),
                    new Month("June", 30, 20)};
        }
        else if (numQuarter == 3) {
            return new Month[] {new Month("July", 31, 21),
                    new Month("August", 31, 22),
                    new Month("September", 30, 22)};
        }
        else if (numQuarter == 4) {
            return new Month[] {new Month("October", 31, 20),
                    new Month("November", 30, 22),
                    new Month("December", 31, 21)};
        }
        else return null;
    }

    public static Month[] getHalfYear(int numHalf) {
        if (numHalf == 1) {
            return new Month[] {new Month("January", 31, 19),
                    new Month("February", 28, 20),
                    new Month("March", 31, 22),
                    new Month("April", 30, 20),
                    new Month("May", 31, 20),
                    new Month("June", 30, 20)};
        }
        else if (numHalf == 2) {
            return new Month[] {new Month("July", 31, 21),
                    new Month("August", 31, 22),
                    new Month("September", 30, 22),
                    new Month("October", 31, 20),
                    new Month("November", 30, 22),
                    new Month("December", 31, 21)};
        }
        else return null;
    }

    public static String[] getTYPE_OF_PERIOD() {
        return TYPE_OF_PERIOD;
    }
}
