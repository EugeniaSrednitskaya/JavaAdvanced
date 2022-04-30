package JavaAdvanced.JA_HW9_2;

public abstract class EmployeeAbstract {

    String eName;
    int eAge;
    String eGender;
    Float eBaseSalary;
    Float eSalary;
    String eTypePayroll;
    private String[] arrayTypePayroll = new String[] {"Month", "Day", "Hour"};

    public EmployeeAbstract(String eName, int eAge, String eGender,
                            Float eBaseSalary, Float eSalary, String eTypePayroll) {
        this.eName = eName;
        this.eAge = eAge;
        this.eGender = eGender;
        this.eBaseSalary = eBaseSalary;
        this.eSalary = eSalary;
        this.eTypePayroll = eTypePayroll;
    }

    public abstract Float getSalary();

    public void setSalary(Float eSalary) {
        this.eSalary = eSalary;
    }

    public String getName() {
        return eName;
    }

    public void setName(String eName) {
        this.eName = eName;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public String geteTypePayroll() {
        return eTypePayroll;
    }

    public void seteTypePayroll(String eTypePayroll) {
        this.eTypePayroll = eTypePayroll;
    }
}
