package ExerciciosFixacao.Exercicio_05;

public class Account {

    private int number;
    private String holder;
    private Double balance;

    public Account() {
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;

    }

    public Account(int number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        this.balance -= amount + 5.0;
    }

    public String toString() {
        return "\nUpdated account data: \n"
                + "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
