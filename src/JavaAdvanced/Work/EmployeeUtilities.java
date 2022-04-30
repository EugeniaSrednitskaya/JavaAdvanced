package JavaAdvanced.Work;

import JavaAdvanced.Work.Employee;

import javax.swing.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class EmployeeUtilities {

    public void getEmployee(Employee[] employeeArray, String name) {

        for (int i = 0; i < employeeArray.length; i += 1) {
            if (employeeArray[i].getNames().equals(name) == true) {
                System.out.println("Found employee " + employeeArray[i].getName() + " " + employeeArray[i].getAge());
            } else {
                continue;
            }
        }
    }

    public void getEmployeePartName(Employee[] employeeArray, String namePart) {
        for (int i = 0; i < employeeArray.length; i += 1) {
            //System.out.println(employeeArray[i].getNames());
            if (employeeArray[i].getNames().regionMatches(true,
                    //employeeArray[i].getNames().length(), namePart, 0, namePart.length()))
                    0, namePart, 0, namePart.length())) {
                System.out.println("Found with part of name employee " + employeeArray[i].getName() + " " + employeeArray[i].getAge());
            } else {
                //System.out.println("No");
                continue;
            }
        }
    }

    public Float getAllSalary(Employee[] employeeArray) {

        Float sum = 0F;
        for (int i = 0; i < employeeArray.length; i += 1) {
            sum = sum + employeeArray[i].getSalary();
        }
        return sum;
    }

    public Float getMinSalary(Employee[] employeeArray) {

        Float min_value = 10000F;
        for (int i = 0; i < employeeArray.length; i += 1) {
            if (min_value > employeeArray[i].getSalary()) {
                min_value = employeeArray[i].getSalary();
            }
        }
        return min_value;
    }

    public Float getMaxSalary(Employee[] employeeArray) {

        Float max_value = 0F;
        for (int i = 0; i < employeeArray.length; i += 1) {
            if (max_value < employeeArray[i].getSalary()) {
                max_value = employeeArray[i].getSalary();
            }
        }
        return max_value;
    }

    public int getMinNumberOfSubordinates(Manager[] managers) {

        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i += 1) {
            if (min_value > managers[i].getNumberOfSubordinates()) {
                min_value = managers[i].getNumberOfSubordinates();
            }
        }
        return min_value;
    }

    public int getMaxNumberOfSubordinates(Manager[] managers) {

        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < managers.length; i += 1) {
            if (max_value < managers[i].getNumberOfSubordinates()) {
                max_value = managers[i].getNumberOfSubordinates();
            }
        }
        return max_value;
    }

    public Float getMaxPaySpplement(Manager[] managers) {
        Float max_value = 0F;

        for (int i = 0; i < managers.length; i += 1) {
            if (max_value < Math.abs(managers[i].getSalary() - managers[i].getBaseSalary())) {
//                System.out.println(i + " " + managers[i].getName() + " "
//                        + managers[i].getSalary() + " " + managers[i].getBaseSalary());
                max_value = Math.abs(managers[i].getSalary() - managers[i].getBaseSalary());
            }
        }
        return max_value;
    }

    public Float getMinPaySpplement(Manager[] managers) {
        Float min_value = Float.MAX_VALUE;
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < managers.length; i += 1) {
            //System.out.println(i);
            if (min_value > Math.abs(managers[i].getSalary() - managers[i].getBaseSalary())) {
//                System.out.println(i + " " + managers[i].getName() + " "
//                        + managers[i].getSalary() + " " + managers[i].getBaseSalary());
//                System.out.println(Math.abs(managers[i].getSalary() - managers[i].getBaseSalary()));
                min_value = Math.abs(managers[i].getSalary() - managers[i].getBaseSalary());//Float.valueOf(df.format(Math.abs(managers[i].getSalary() - managers[i].getBaseSalary())));
            }
        }
        return min_value;
    }
}
