package Question2;
import java.util.Scanner;
public class ManageSavingsAccountUI 
{
    //Variables
    static double balance;
    static double annualInterestRate;
    static double totalDeposit;
    static double totalWithdraws;
    
    
    public static void main(String[]args)
    {
        btnCalculateAllActionPerformed();
        btnDisplayOutputActionPerformed();
    }
    
    private static void btnCalculateAllActionPerformed()
    {
        //Variables
        Scanner input=new Scanner (System.in);
        
        //Display and Input
        System.out.println("SAVINGS ACCOUNT MANAGEMENT SYSTEM");
        System.out.print("Starting Balance:RM");
        balance=input.nextDouble();
        System.out.print("Annual Interest Rate(5,7 or 9)%:");
        annualInterestRate=input.nextDouble();
        System.out.print("Annual Deposit Amount:RM");
        totalDeposit=input.nextDouble();
        System.out.print("Annual Withdraw Amount:RM");
        totalWithdraws=input.nextDouble();
        
        SavingsAccount acc=new SavingsAccount(balance,annualInterestRate);
        acc.setTotalDeposit(totalDeposit);
        acc.setTotalWithdraws(totalWithdraws);
        acc.calculateTotalInterest();
        acc.calculateTotalBalance();
    }
    
    private static void btnDisplayOutputActionPerformed()
    {   
        SavingsAccount svAcc=new SavingsAccount();
        System.out.println(svAcc.toString());
    }
   
}
