package JavaAdvanced.JA_HW9_2;

import java.util.Arrays;

public class Main_9_2 {

    public static void main(String[] args) {
        Worker w1 = new Worker("Taras", 30, "M", 1000F, 0F, "Day");
        Worker w2 = new Worker("Mara", 38, "F",1000F, 0F, "Day");

        Manager m1 = new Manager("Oleksa", 40, "M",
                2000F, 0F, "Day", 0);
        Manager m2 = new Manager("Vesna", 30, "F",
                2000F, 0F, "Day",200);

        Director d1 = new Director("Dara", 50, "F",
                3000F, 0F, "Day", 500);

        System.out.println("Salary of w1 = " + w1.getBaseSalary());
        System.out.println("Salary of m1 = " + m1.getSalary());
        System.out.println("Salary of m2 = " + m2.getSalary());
        System.out.println("Salary of d1 = " + d1.getSalary());

        w1.setSalary(w1.geteTypePayroll(), "Month", 5);
        System.out.println(w1.getName() + " = " + w1.getSalary());

        m1.setSalary(m1.geteTypePayroll(), "Quarter", 1);
        System.out.println(m2.getName() + " = " + m2.getSalary());
    }
}
