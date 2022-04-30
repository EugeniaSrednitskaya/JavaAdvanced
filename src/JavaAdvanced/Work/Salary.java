package JavaAdvanced.Work;

import JavaAdvanced.Work.Employee;

public class Salary {

    public Float getSum(Employee[] employeeArray) {
        Float sum = 0.0F;
        for (int i = 0; i < employeeArray.length; i+= 1) {
            sum += employeeArray[i].getSalary();
        }
        return sum;
    }
}
