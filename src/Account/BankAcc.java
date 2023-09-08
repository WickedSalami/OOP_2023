package Account;

public class BankAcc {
    private String accNum;
    private double accBal;
    private String custName;
    private String email;
    private String phoneNum;

    // Constructor for accNum. Basically Initialization.

    public BankAcc(String accNum, double accBal, String custName, String email, String phoneNum) {
        this.accNum = accNum;
        this.accBal = accBal;
        this.custName = custName;
        this.email = email;
        this.phoneNum = phoneNum;
    }
    // Get and Set AccNum
    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }
    // Get and Set accBal
    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }
    // Get and Set custName
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    // Get and Set email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Get and Set phone number
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    // Method to deposit into account
    public void deposit(double amount) {
        if(amount > 0) {
            accBal += amount;
            System.out.println("Deposited Php " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= accBal) {
            accBal -= amount;
            System.out.println("Withdrawn Php " + amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }

}