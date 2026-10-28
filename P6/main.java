package mypack;

/* making my own exception class */
class MoneyException extends Exception {
    public MoneyException(String s) {
        super(s);
    }
}

public class Prac6 {
    /* static and final variables */
    public static final String BANK = "HDFC";
    public static int count = 0;
    
    double balance;
    String name;

    public Prac6(String n, double b) {
        name = n;
        balance = b;
        count++;
    }

    public void withdraw(double amt) throws MoneyException {
        if (amt > balance) {
            throw new MoneyException("Not enough balance");
        }
        balance = balance - amt;
        System.out.println("Withdraw done. Left: " + balance);
    }

    public static void main(String[] args) {
        Prac6 p = new Prac6("Rahul", 2000);
        
        try {
            p.withdraw(5000);
        } catch (MoneyException e) {
            System.out.println("Error came: " + e.getMessage());
        } finally {
            System.out.println("Bank name is " + BANK);
            System.out.println("Total accounts: " + count);
        }
    }
}
