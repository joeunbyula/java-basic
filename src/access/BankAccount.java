package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유호하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (balance < amount && !isAmountValid(amount)) {
            System.out.println("잔액 부족이거나 유효하지 않은 금액입니다.");
        } else {
            balance -= amount;
        }

    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }
}
