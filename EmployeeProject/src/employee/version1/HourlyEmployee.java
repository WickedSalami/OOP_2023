package employee.version1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired; // date - month - year format
    private Date empBirthDate; // date - month - year format
    private float totalHoursWorked;
    private float ratePerHour;

    // default constructor
    public HourlyEmployee() {
    }

    // full parameter
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    // basic info
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }
    public HourlyEmployee(int empID, String empName, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    // getters
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    // setters
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

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        /*
        Computes the salary based on a weekly work hours (40 hours a week) (8 hours per day)
        Excess hours is overtime with 150% rate
        */
        float regHours;
        float overtimeHours;

        if(totalHoursWorked <= 40) {
            regHours = totalHoursWorked;
            overtimeHours = 0;
        } else {
            regHours = 40;
            overtimeHours = totalHoursWorked - 40;
        }

        double regSalary = regHours * ratePerHour;
        double overSalary = overtimeHours * (ratePerHour * 1.5);

        return regSalary + overSalary;
    }

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public void displayInfo() {
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Date Hired: " + dateFormat.format(getEmpDateHired()));
        System.out.println("Employee Birth Date: " + dateFormat.format(getEmpBirthDate()));
        System.out.println("Total Hours Worked: " + getTotalHoursWorked());
        System.out.println("Rate Per Hour: " + getRatePerHour());
        System.out.println("Salary: Php " + computeSalary());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nDate Hired: " + dateFormat.format(empDateHired) +
                "\nDate of Birth: " + dateFormat.format(empBirthDate) +
                "\nTotal Hours Worked: " + totalHoursWorked +
                "\nRate Per Hour: " + ratePerHour +
                "\nSalary: Php " + computeSalary();
    }
}