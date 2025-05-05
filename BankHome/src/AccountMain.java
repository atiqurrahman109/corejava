
public class AccountMain {

    private int accountNumber;
    private int balance;

    public AccountMain() {
    }

    public AccountMain(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void Deposite(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("withdraw successful" + amount);

        } else {

            System.out.println("invalid deposite amount");
        }
    
    }
    

    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount) {

            balance -= amount;
            System.out.println("withdraw successful" + amount);

        } else {
            System.out.println("insufficient balance");

        }

    }
    
    public void printDetails(){
    
        System.out.println("accountNumber :"+accountNumber);
        System.out.println("balance  :"+balance);
    
    }
    
}

