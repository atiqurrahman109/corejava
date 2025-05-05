
public class Saving extends AccountMain{
    
    private float interestRate;

    public Saving() {
    }

    public Saving(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void printDetails() {
        super.printDetails(); 
        System.out.println("interest rate "+interestRate);
    }
    
    
    
}
