package JavaAdvanced.Work;
//public immutable
public class Employee extends Person {

    private Float salary;
    private Float baseSalary;
    private String[] salaryRateArr = {"Должностной оклад за месяц", "Норма за 1 час", "Норма за 1 день"};
    private String salaryRate;


    public Employee(String name, int age, String sex, float salary, float baseSalary, String salaryRate) {
        super(name, age, sex);
        this.salary = salary;
        this.baseSalary = baseSalary;
        this.salaryRate = salaryRate;
    }

    public Boolean isSameName(Employee employee) {
        return this.getName().equals(employee.getName());
    }

    public Float getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(float salaryRate) {
        this.baseSalary = salaryRate;
    }

    // @Override
    public String getName() {
        return super.getName();
    }

    public String getNames() {
        return super.getNames();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public Float getSalary() {
        return this.salary;
    }

    //@Override
    public int getAge() {
        return super.getAge();
    }

    public Float getSalaryPerDay(Month[] monthArray) {
        int lengthArr = monthArray.length;
        //Float[] sumSalary = new Float[lengthArr];
        Float sum = 0F;

        if (this.salaryRate == salaryRateArr[2]) {
            for (int i = 0; i < lengthArr; i += 1) {
                //sumSalary[i] = this.baseSalary * monthArray[i].quandFactWorkDayOfMonth;
                sum = sum + this.baseSalary * monthArray[i].quandFactWorkDayOfMonth;
            }
        }
        //return sumSalary;
        return sum;
    }

}
