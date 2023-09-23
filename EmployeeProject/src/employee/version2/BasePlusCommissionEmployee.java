package employee.version2;
import employee.version2.CommissionEmployee;

import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(int empID, String empName, DateFormat empDateHired, DateFormat empBirthDate, Double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String empName, Double totalSales, double baseSalary) {
        super(empID, empName, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        double commissionSalary = super.computeSalary();
        return commissionSalary + baseSalary;
    }

    public void displayBCEInfo() {
        super.displayCommEmpInfo();
        System.out.println("Base Salary: Php" + getBaseSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase Salary: Php" + getBaseSalary();
    }
}