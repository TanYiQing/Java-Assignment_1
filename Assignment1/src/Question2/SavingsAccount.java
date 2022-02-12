package Question2;
public class SavingsAccount 
{
    private static double balance;
    private static double annualInterestRate;
    private static double totalDeposit;
    private static double totalWithdraws;
    private static double totalInterest;
    
    SavingsAccount(double balance,double annualInterestRate)
    {
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    SavingsAccount() 
    {
        
    }
    
    public void setTotalDeposit(double totalDeposit)
    {
        this.totalDeposit=totalDeposit;
        balance+=totalDeposit;
    }
    
    public void setTotalWithdraws(double totalWithdraws)
    {
        this.totalWithdraws=totalWithdraws;
        balance-=totalWithdraws;
    }
    
    public void calculateTotalInterest()
    {
        totalInterest=(annualInterestRate*balance);
    }
                
    public void calculateTotalBalance()
    {
        balance+=totalInterest;
    }
    
    @Override
    public String toString()
    {
        return "\n The ending balance is:RM"+balance+
                "\n Total amount of deposits:RM"+totalDeposit+
                "\n Total amount of withdraws:RM"+totalWithdraws+
                "\n Total interest earned:RM"+totalInterest;
                
    }
   
    
}
