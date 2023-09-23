package employee.version1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private Double totalSales;
        // Default Constructor
    public CommissionEmployee() {
    }
        // Basic info constructor
    public CommissionEmployee(int empID, String empName, Double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.totalSales = totalSales;
    }
        // Full constructor
    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, Double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

        // Getters
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public Double getTotalSales() {
        return totalSales;
    }
        // Setters

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

        // computeSalary method
    public double computeSalary() {
        // use totalSales
        // computes the salary base on adding the commission on sales plus the base salary
        /*
        * computes the salary based on commission,please refer to the table below:
            low sales       | 5%  | <50k
            typical sales	| 20% | >=50k but <100K
		                    | 30% | >=100k but <500k
            high sales	    | 50% | >=500k*/
        double baseSalary = 10000;

        if(totalSales < 50000) {
            return baseSalary + (totalSales * 0.05);
        } else if (totalSales >= 50000 && totalSales < 100000) {
            return baseSalary + (totalSales * .20);
        } else if (totalSales >= 100000 && totalSales < 500000) {
            return baseSalary + (totalSales * .30);
        } else {
            return baseSalary + (totalSales * 0.50);
        }
    }
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public void displayInfo() {
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Date Hired: " + dateFormat.format(getEmpDateHired()));
        System.out.println("Employee Birth Date: " + dateFormat.format(getEmpBirthDate()));
        System.out.println("Total Sales: " + getTotalSales());
        System.out.println("Salary: Php " + computeSalary());
    }

    @Override
    public String toString() {
        return "\n\nEmployee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nDate Hired: " + dateFormat.format(getEmpDateHired()) +
                "\nDate of Birth: " + dateFormat.format(getEmpBirthDate()) +
                "\nTotal Sales: " + totalSales +
                "\nSalary: Php " + computeSalary();
    }
}
