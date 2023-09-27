package employee.version4;

public class TestMain {
    public static void main(String[] args) {

        HourlyEmployee empHour = new HourlyEmployee(
                1,
                new Name("Mister", "Rodrigo", "Janjalani", "Obama"),
                43.00f,
                20.00f
        );
        empHour.setEmpDateHired(new DateFormat(3, 6, 2006));
        empHour.setEmpBirthDate(new DateFormat(5, 8, 1996));

        System.out.println("\n  Hourly Employee Info: ");
        empHour.displayHourlyEmpInfo();

        PieceWorkerEmployee empPiece = new PieceWorkerEmployee(
                2,
                new Name("Joe", "Rover", "Biden"),
                15.00f,
                30.00f
        );
        empPiece.setEmpDateHired(new DateFormat(26, 8, 2010));
        empPiece.setEmpBirthDate(new DateFormat(15, 12, 1988));

        System.out.println("\nPiece Worker Employee Info: ");
        empPiece.displayPieceEmpInfo();

        CommissionEmployee empComm = new CommissionEmployee(
                3,
                new Name("Doctor", "Mike", "Hock", "Hugh", "IV"),
                55000.00
        );
        empComm.setEmpDateHired(new DateFormat(28, 2, 2020));
        empComm.setEmpBirthDate(new DateFormat(19, 3, 1992));

        System.out.println("\nCommission Employee Information: ");
        empComm.displayCommEmpInfo();

        BasePlusCommissionEmployee empBCE = new BasePlusCommissionEmployee(
                4,
                new Name("Wood", "Jablomi"),
                100000.00,
                2000.00
        );
        empBCE.setEmpDateHired(new DateFormat(24, 3, 2001));
        empBCE.setEmpBirthDate(new DateFormat(8, 11, 1970));

        System.out.println("\nBase Salary + Commission Employee Info: ");
        empBCE.displayBCEInfo();
    }
}