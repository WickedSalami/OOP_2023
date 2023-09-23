package employee.version1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired; // date - month - year format
    private Date empBirthDate; // date - month - year format
    private float totalPiecesFinished; // guess the data type
    private float ratePerPiece;
        // default constructor
    public PieceWorkerEmployee() {
    }
        // all info constructor
    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
        // basic info constructor
    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

        // ID, name, piecesFinished, and ratePerHour constructor

    public PieceWorkerEmployee(int empID, String empName, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
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

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

        // method computeSalary
    /*
    *override toString()-> same as hourly employee
    */

    public double computeSalary() {
        /*
        computeSalary():double -> computes the salary based on the finished (pieces) times the rate.
        A bonus is given for every hundred pieces finished which is times 10 of the rate per piece.
        (total*rate/piece )/100 *10
         */
        return (totalPiecesFinished * ratePerPiece) + (totalPiecesFinished / 100 * 10 * ratePerPiece);
    }

        //  *displayinfo():void -> same as hourly employee
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public void displayInfo() {
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Date Hired: " + dateFormat.format(getEmpDateHired()));
        System.out.println("Employee Birth Date: " + dateFormat.format(getEmpBirthDate() ));
        System.out.println("Total pieces finished: " + getTotalPiecesFinished());
        System.out.println("Rate per piece: " + getRatePerPiece());
        System.out.println("Salary: Php " + computeSalary());
    }

    @Override
    public String toString() {
        return "\n\nEmployee ID: " + empID +
                "\nEmployee Name: " + empName +
                "\nDate Hired: " + dateFormat.format(getEmpDateHired()) +
                "\nDate of Birth: " + dateFormat.format(getEmpBirthDate()) +
                "\nTotal pieces finished: " + totalPiecesFinished +
                "\nRate per piece: " + ratePerPiece +
                "\nSalary: Php " + computeSalary();
    }
}