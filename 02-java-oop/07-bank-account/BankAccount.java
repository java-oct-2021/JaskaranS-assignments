import java.util.*;
class BankAccount
{
    //Fields or variables
    private double checking_balance;
    private double savings_balance;
    private static int no_of_accounts;
    private static double total_money;
    private String account_number="";

    //Constructor
    public BankAccount(double checking_balance, double savings_balance)
    {
        this.checking_balance=checking_balance;
        this.savings_balance=savings_balance;
        no_of_accounts++;
        System.out.println("Your account number is "+account());
    }

    //Getter
    public double getChecking_balance() {
        return checking_balance;
    }
    //Getter
    public double getSavings_balance() {
        return savings_balance;
    }

    //Deposit
    public void deposit(double deposit_money,String account_type)
    {
        if (account_type.equals("Checking")|| account_type.equals("checking"))
        {
            System.out.println("Checking Balance :"+checking_balance);
            this.checking_balance+=deposit_money;
            total_money+=deposit_money;
            System.out.println("Checking Balance Updated: "+ checking_balance);
        }
        else if (account_type.equals("Savings")|| account_type.equals("savings"))
        {
            System.out.println("Savings Balance :"+this.savings_balance);
            this.savings_balance+=deposit_money;
            total_money+=deposit_money;
            System.out.println("Savings Balance Updated: "+ this.savings_balance);
        }
        
    }
    //Withdraw
    public void withdraw(double withdraw_money,String account_type)
    {
        System.out.println("Which Account you want to Withdraw");
        System.out.println("Checking\nSavings ");
        if (account_type.equals("Checking") || account_type.equals("checking"))
        {
            if(this.checking_balance>=withdraw_money)
            {
                System.out.println("Checking Balance :"+checking_balance);
                this.checking_balance-=withdraw_money;
                total_money-=withdraw_money;
                System.out.println("Checking Balance Updated: "+ checking_balance);
            }
            else
            {
                System.out.println("Not Sufficient Funds");
            }
        }    
        else if (account_type.equals("Savings")|| account_type.equals("savings"))
        {
            if (this.savings_balance>=withdraw_money)
            {
                System.out.println("Savings Balance :"+this.savings_balance);
                this.savings_balance-=withdraw_money;
                total_money-=withdraw_money;
                System.out.println("Savings Balance Updated: "+ this.savings_balance);
            }
            else
            {
                System.out.println("Not Sufficient Funds");
            }
        }
    }

    //Total Money
    public void total_money()
    {
        System.out.println("Checking Balance :"+ this.checking_balance);
        System.out.println("Savings Balance :"+ this.savings_balance);
        total_money=this.checking_balance+this.savings_balance;
        System.out.println("Total Balance :"+total_money);
    }   
    //Account Number
    public String account()
    {
        Random random_account= new Random();
        int number;
        for (int i=0;i<10;i++)
        {
            number=random_account.nextInt(11);
            account_number+=String.valueOf(number);
        }
        return account_number;
    }
    public static void number_accounts()
    {
        System.out.println("Total number of accounts "+no_of_accounts);
    }
}