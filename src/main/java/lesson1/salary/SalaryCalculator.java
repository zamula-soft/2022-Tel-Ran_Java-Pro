package lesson1.salary;

public class SalaryCalculator {
    private double baseSalary = 50_000;
    private double yearlyIncrease = 20_000;

    public SalaryCalculator(double baseSalary, double yearlyIncrease) {
        this.baseSalary = baseSalary;
        this.yearlyIncrease = yearlyIncrease;
    }

    public double calculate(int year) {
        return baseSalary + year * yearlyIncrease;
    }
}
/*
-baseSalary: double = 50_000
-yearlyIncrease: double = 20_000
---------------------------------
+SalaryCalculator(baseSalary:double, yearlyIncrease:double)
+calculate(years: int): double

 */


