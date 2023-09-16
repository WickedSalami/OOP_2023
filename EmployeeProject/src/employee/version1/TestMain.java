package employee.version1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date dateHired1 = dateFormat.parse("08-08-2021");
        Date birthDate1 = dateFormat.parse("01-22-2000");
        Date dateHired2 = dateFormat.parse("04-07-1989");
        Date birthDate2 = dateFormat.parse("01-01-1947");
        Date dateHired3 = dateFormat.parse("12-12-2023");
        Date birthDate3 = dateFormat.parse("28-02-2003");
        Date dateHired4 = dateFormat.parse("31-03-2019");
        Date birthDate4 = dateFormat.parse("22-07-2001");

        HourlyEmployee employeeHour = new HourlyEmployee(
                22,
                "Emplo Yee",
                dateHired1,
                birthDate1,
                50.0f,
                20.0f
        );
        String employeeInfo1 = employeeHour.toString();
        System.out.printf(employeeInfo1);

        PieceWorkerEmployee empPiece = new PieceWorkerEmployee(
                22,
                "Nae Nae",
                dateHired2,
                birthDate2,
                15,
                30.0f
        );
        String employeeInfo2 = empPiece.toString();
        System.out.println(employeeInfo2);

        CommissionEmployee empComm = new CommissionEmployee(
                123,
                "Michael Jackson III",
                dateHired3,
                birthDate3,
                130.0
        );
        String employeeInfo3 = empComm.toString();
        System.out.println(employeeInfo3);

        BasePlusCommissionEmployee empBaseComm = new BasePlusCommissionEmployee(
                422,
                "Eric Cartman",
                dateHired4,
                birthDate4,
                100.0,
                50.0
        );
        String employeeInfo4 = empBaseComm.toString();
        System.out.println(employeeInfo4);
    }
}

