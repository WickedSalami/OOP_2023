package employee.version1;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        Date dateHired = new Date();
        Date birthDate = new Date();

        HourlyEmployee employee = new HourlyEmployee(
                22,
                "Emplo Yee",
                dateHired,
                birthDate,
                50,
                20.0f
        );

        String employeeInfo = employee.toString();

        System.out.printf(employeeInfo);
    }
}

