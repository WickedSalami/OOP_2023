package Account;

public class Main {
    public static void main(String[] args) {
        /*What to do:
       // this one, create an instance sa main
       // should be a scanner to input balance pero i dont think necessaryx
       // check balance
       // create or call the method deposit/withdraw to add or subtract the balance inputted in the scanner function
       // print information on the said new balance
       // basically simulate deposit and withdraw*/
        BankAcc bankObj = new BankAcc("1234", 1500.0, "Luis Mariano", "luismariano@gmail.com", "0908 865 1202");

        System.out.println("Account:");
        System.out.println("Account Number: " + bankObj.getAccNum());
        System.out.println("Balance: " + bankObj.getAccBal());
        System.out.println("Name: " + bankObj.getCustName());
        System.out.println("Email: " + bankObj.getEmail());
        System.out.println("Phone Number: " + bankObj.getPhoneNum());

        bankObj.deposit(200.0);
        bankObj.withdraw(500.0);

        System.out.println("Updated Balance: Php" + bankObj.getAccBal());

    }
}