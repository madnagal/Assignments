public class SavingsAccount {
    long id;
    double balance;
    SavingsAccount(double b,long id)
    {
        balance=2000;
        id = 1400054762;
    }
    double deposit(double m)
    {
        balance=balance+m;
        return balance;
    }
    double withdraw(double m)
    {
        balance = balance - m;
        return balance;
    }
}
