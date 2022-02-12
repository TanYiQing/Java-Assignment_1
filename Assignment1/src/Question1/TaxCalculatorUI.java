package Question1;
import java.util.Scanner;
public class TaxCalculatorUI 
{
    //Variables
    static String name;
    static String ID;
    static String status;
    static double taxableIncome;
    Tax[]tax=new Tax[3];
    
    private static void btnCalculateActionPerformed()
    {
        //Variables
        Scanner input=new Scanner (System.in);
        double income;
        double deductions;
        int num;
        
        //Display and Input
        for(num=0;num<3;num++)
        {
        System.out.println("INCOME TAX CALCULATOR");
        System.out.print("Enter name:");
        name=input.next()+input.nextLine();
        name=name.toUpperCase();
        System.out.print("Enter ID:");
        ID=input.nextLine();
        System.out.print("Status(single/married):");
        status=input.nextLine();
        System.out.print("Total Income:RM");
        income=input.nextDouble();
        System.out.print("Deductions:RM");
        deductions=input.nextDouble();
               
        Tax tax=new Tax(income,status);
        tax.setDeductions(deductions);
        
        //Display
        System.out.println();
        System.out.println(name+"("+ID+")");
        System.out.println("Your taxable income=RM"+tax.getTaxableIncome());
        System.out.println("Your tax amount=RM"+tax.calculateTax());
        System.out.println();
        }
        
    }
    
    public static void main(String[]args)
    {
        btnCalculateActionPerformed();
    }
}
