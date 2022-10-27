public class BankApplication {
    double balance;
    public BankApplication()
    {
        balance=0;
    }
    public BankApplication(double initialBalance)
    {
        balance=initialBalance;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double amount)
            throws IllegalAccessException
    {
        if(amount<0)
        {
            throw new IllegalAccessException("Amount is under zero");
        }
        balance=balance-amount;
    }
    public double getbalance()
    {
        return balance;
    }
}
class ThrowableException
{
    public static void main(String[] args)
    {
        BankApplication checking = new BankApplication();
        checking.deposit(2000);
        checking.withdraw(-1000);
        System.out.println(checking.getbalance());
    }
}
