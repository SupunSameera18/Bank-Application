public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if(this.balance < amount){
            System.out.println("Your account balance is low!");
        } else {
            setBalance(getBalance()-amount);
        }
    }

    public void deposit(double amount) {
        setBalance(getBalance()+amount);
    }

    public void transfer(Account account, double amount){
        if(this.balance < amount){
            System.out.println("Your account balance is low!");
        } else {
            withdraw(amount);
            account.deposit(amount);
        }
    }

    public void printBalance() {
        System.out.println("Your account balance is: " + getBalance());
    }
}
