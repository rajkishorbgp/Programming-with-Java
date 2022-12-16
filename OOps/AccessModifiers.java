/*
 *              Access Modifiers/specifier
 */

public class AccessModifiers {
    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();
        myAcc.username = "rajkishorbgp";
        myAcc.setPassword("raj@1234");
        ;

        System.out.println(myAcc.username); // rajkishorbgp
        System.out.println(myAcc.getPassword()); // raj@1234
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

    public String getPassword() {
        return password;
    }

}

/*
 * Output:
 * rajkishorbgp
 * raj@1234
 */