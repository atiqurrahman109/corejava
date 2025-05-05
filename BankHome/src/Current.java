
public class Current extends AccountMain{
    
    private int overdraftLimit;

    public Current() {
    }

    public Current(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double balance= getbalance();
        
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully (with overdraft if needed).");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount.");
        }
    
    

   
    
    
  }  

    @Override
    public void printDetails() {
        super.printDetails();
        
        System.out.println("overdraft limit ;"+overdraftLimit);
    }
}
