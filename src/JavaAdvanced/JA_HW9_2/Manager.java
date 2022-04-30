package JavaAdvanced.JA_HW9_2;

public final class Manager extends Worker{

    int numSubOrd;
    int COEFFICIENT_SALARY = 3;

    public Manager(String eName, int eAge, String eGender,
                   Float eBaseSalary, Float eSalary, String eTypePayroll, int numSubOrd) {
        super(eName, eAge, eGender, eBaseSalary, eSalary, eTypePayroll);
        this.numSubOrd = numSubOrd;
    }

    public int getNumSubOrd() {
        return numSubOrd;
    }

    public void setNumSubOrd(int numSubOrd) {
        this.numSubOrd = numSubOrd;
    }

    @Override
    public Float getSalary(){
        if (this.numSubOrd == 0) {
            return this.eBaseSalary;
        }
        else {
            return this.eBaseSalary * (this.numSubOrd / 100 * COEFFICIENT_SALARY);
        }
    }


}
