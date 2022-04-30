package JavaAdvanced.Work;
import JavaAdvanced.Work.Employee;
import JavaAdvanced.Work.Worker;

public class Manager extends Employee{

    private Integer numberOfSubordinates;


    public Manager(String name, int age, String sex, float salary, float baseSalary, String salaryRate, int numberOfSubordinates) {
        super(name, age, sex, salary, baseSalary, salaryRate);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Integer getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    public void setNumberOfSubordinates(Integer numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Float getSalary() {
        if (this.numberOfSubordinates.equals(0)) {
            return this.getBaseSalary();
        }
        else {
            return this.getBaseSalary() * (this.numberOfSubordinates / 100F * 3F);
        }
    }
}
