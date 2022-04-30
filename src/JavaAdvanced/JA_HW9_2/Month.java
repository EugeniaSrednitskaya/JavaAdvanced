package JavaAdvanced.JA_HW9_2;

public final class Month {

    private final String monthName;
    private final Integer dayCalendar;
    private final Integer dayFactWork;



    public Month(String monthName, Integer dayCalendar, Integer dayFactWork) {
        this.monthName = monthName;
        this.dayCalendar = dayCalendar;
        this.dayFactWork = dayFactWork;
    }

    public String getMonthName() {
        return monthName;
    }

    public Integer getDayCalendar() {
        return dayCalendar;
    }

    public Integer getDayFactWork() {
        return dayFactWork;
    }
}
