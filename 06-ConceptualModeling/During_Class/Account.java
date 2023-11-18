package During_Class;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public double getDeposit() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 500) {
            if (this.getDeposit() < amount) {
                System.out.println("Amount is higher than accessible deposit. No money has been withdrawn.");
            } else {
                this.balance -= amount;
            }
        } else {
            System.out.println("You can't withdraw more than 500 PLN at once.");
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getDeposit());
        account.deposit(200);
        System.out.println(account.getDeposit());
        account.withdraw(300);
        System.out.println(account.getDeposit());
        account.deposit(300);
        System.out.println(account.getDeposit());
        account.withdraw(501);
        System.out.println(account.getDeposit());
    }
}