/*
 *              Access Modifiers/specifier
 */

public class AccessModifiers {
    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();
        myAcc.username = "rajkishorbgp";
        myAcc.setPassword("raj@1234");
        ;

        System.out.println(myAcc.username);
    }
}

/**
 * BankAccount
 */
class BankAccount {

    public String username; // Public username
    private String password; // private password

    public void setPassword(String password) {
        this.password = password;
    }

}
