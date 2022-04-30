package JavaAdvanced.Work;
//import JavaAdvanced.Work.Employee;

public class Worker extends Employee {

    public Worker(String name, int age, String sex, float salary, float baseSalary, String salaryRate) {
        super(name, age, sex, salary, baseSalary, salaryRate);
    }

    public Float getSalary() {
        return this.getBaseSalary();
    }
}
