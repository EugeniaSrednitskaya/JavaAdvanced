package JavaAdvanced.Work;

import JavaAdvanced.Work.Month;

public class MonthUtils {

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

    public static Month[] getMonths() {
            return MONTH_ARRAY;
    }
}
