package JavaAdvanced.Work;

import JavaAdvanced.Work.Employee;
import JavaAdvanced.Work.Person;
import JavaAdvanced.Work.Salary;
import JavaAdvanced.Work.EmployeeUtilities;

public class JA_HW6_2 {
    public static void main(String[] args) {

        Person p1 = new Person("Kate", 30, "female");
        Person p2 = new Person("Don", 45, "male");
        Person p3 = new Person("Don", 40, "male");

        Employee e1 = new Employee("Don", 40, "male", 756.38F, 200F, "Норма за 1 день");
        Employee e2 = new Employee("Tramp", 38, "male", 1700.00F, 1000F, "Норма за 1 день");
        Employee e3 = new Employee("Trond", 18, "male", 700.00F, 1000F, "Норма за 1 день");

//        System.out.println(p2.getName());
//        System.out.println(e2.isSameName(e1));

        Employee[] empArr = new Employee[3];
        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;

        Salary sumEmpl = new Salary();
        //System.out.println(sumEmpl.getSum(empArr));

        e1.setName("Don Din");
        //System.out.println(e1.getName());

        EmployeeUtilities eU = new EmployeeUtilities();
        //1. поиск сотрудника в массиве по его имени
        eU.getEmployee(empArr, "Tramp");

        //2. поиск сотрудника в массиве по вхождению указанной строки в его имени
        eU.getEmployeePartName(empArr, "Tr");

        //3. подсчет зарплатного бюджета для всех сотрудников в массиве
        System.out.println("Общая сумма зарплаты " + eU.getAllSalary(empArr));

        //4. поиск наименьшей зарплаты в массиве
        System.out.println("Минимальная сумма зарплаты " + eU.getMinSalary(empArr));

        //5. поиск наибольшей зарплаты в массиве
        System.out.println("Максимальная сумма зарплаты " + eU.getMaxSalary(empArr));

        //6. поиск наименьшего количества подчиненных в массиве менеджеров
        Manager manager1 = new Manager("Don", 40, "male", 756.38F, 200F, "", 2);
        Manager manager2 = new Manager("Tramp", 38, "male", 1700.00F, 1000F, "", 10);
        Manager manager3 = new Manager("Trond", 18, "male", 700.00F, 1000F, "", 3);

        Manager[] managers = new Manager[3];
        managers[0] = manager1;
        managers[1] = manager2;
        managers[2] = manager3;

        System.out.println("Минимальное количество подчиненных " + eU.getMinNumberOfSubordinates(managers));

        //7. поиск наибольшего количества подчиненных в массиве менеджеров
        System.out.println("Максимальное количество подчиненных " + eU.getMaxNumberOfSubordinates(managers));

        //8. поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
        System.out.println("Наибольшая надбавка " + eU.getMaxPaySpplement(managers));

        //9. поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
        System.out.println("Наименьшая надбавка " + eU.getMinPaySpplement(managers));

        MonthUtils monthUtils = new MonthUtils();
        System.out.println(e1.getSalaryPerDay(MonthUtils.getMonths()));
//        System.out.println(monthUtils. .months[1].quandFactWorkDayOfMonth);
//
//        //Month[] monthArray = {"February", "June", "November"};
//        MonthUtils monthArray = new MonthUtils();
//        Month[] months = new Month[12];
//        for (int i = 0; i < monthArray.months.length; i += 1) {
//            System.out.println(monthArray.months[i].nameMonth);
//            //System.out.println(e1.getSalaryPerDay(months[i].nameMonth));
//        }


    }
}
