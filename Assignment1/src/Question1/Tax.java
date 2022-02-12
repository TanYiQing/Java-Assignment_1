package Question1;
public class Tax 
{
    private double taxableIncome;
    private String status;
    private double deductions;
    private double taxAmount;
    private final double Rate1 = 0.10;
    private final double Rate2 = 0.20;
    private final double Rate3 = 0.35;

    public Tax(double taxableIncome, String status) 
    {
        this.taxableIncome = taxableIncome;
        this.status = status;
    }

    public void setDeductions(double deductions) 
    {
        this.deductions=deductions;
        taxableIncome-=deductions;
    }

    public double getTaxableIncome() 
    {
        return taxableIncome;
    }

    public double calculateTax() 
    {
        switch (status) {
            case "single":
                if(taxableIncome<=21000)
                    taxAmount=taxableIncome*Rate1;
                else if(taxableIncome<=51000)
                    taxAmount=taxableIncome*Rate2;
                else
                    taxAmount=taxableIncome*Rate3;    
                break;
            case "married":
                if(taxableIncome<=35000)
                    taxAmount=taxableIncome*Rate1;
                else if(taxableIncome<=86000)
                    taxAmount=taxableIncome*Rate2;
                else
                    taxAmount=taxableIncome*Rate3;
                break;
            default:
                System.out.println("Error!");
                break;
        }
        
        return taxAmount;
    }
}    
