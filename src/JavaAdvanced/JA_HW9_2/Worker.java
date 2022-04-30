package JavaAdvanced.JA_HW9_2;

public class Worker extends EmployeeAbstract {

    public Worker(String eName, int eAge, String eGender,
                  Float eBaseSalary, Float eSalary, String eTypePayroll) {
        super(eName, eAge, eGender, eBaseSalary, eSalary, eTypePayroll);
    }


    @Override
    public Float getSalary() {
        return super.eSalary;
    }

    public final Float getBaseSalary() {
        return this.eBaseSalary;
    }

    public final String geteTypePayroll() {
        return this.eTypePayroll;
    }

    public void setSalary(String typePayroll, String typePeriod, int numMonthQuarterHalfYear) {

        if (typePayroll == "Day" && typePeriod == MonthUtilities.getTYPE_OF_PERIOD()[0]) //{"Month", "Quarter", "HalfYear", "Year"}
        {
            //for (int i = 0; i < MonthUtilities.getMonthArray().length; i++) {
            for (int i = 0; i < numMonthQuarterHalfYear; i++) {
                this.eSalary += this.eBaseSalary * MonthUtilities.getMonthArray()[i].getDayFactWork();
                //System.out.println(MonthUtilities.getMonthArray()[i].getMonthName() + " " + this.eSalary);
            }
        } else if (typePayroll == "Day" && typePeriod == MonthUtilities.getTYPE_OF_PERIOD()[1]) {
            for (int i = 0; i < MonthUtilities.getQuarter(numMonthQuarterHalfYear).length; i++) {
                this.eSalary += this.eBaseSalary
                        * MonthUtilities.getQuarter(numMonthQuarterHalfYear)[i].getDayFactWork();
            }
        } else if (typePayroll == "Day" && typePeriod == MonthUtilities.getTYPE_OF_PERIOD()[2]) {
            for (int i = 0; i < MonthUtilities.getHalfYear(numMonthQuarterHalfYear).length; i++) {
                this.eSalary += this.eBaseSalary
                        * MonthUtilities.getHalfYear(numMonthQuarterHalfYear)[i].getDayFactWork();
            }
        }
        //return this.eSalary;
    }
}