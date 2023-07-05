package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
                double taxRate;
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        } else if (salary <= 10000) {
            taxRate = 0.15;
        } else if (salary <= 20000) {
            taxRate = 0.18;
        } else {
            taxRate = 0.2;
        }
        double netSalary = salary * (1 - taxRate);
        System.out.println("Net Salary: " + netSalary);
    }
}
