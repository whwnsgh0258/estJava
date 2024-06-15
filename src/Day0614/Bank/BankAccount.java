package Day0614.Bank;

public class BankAccount {
    private int balance;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (balance < amount) { // 잔액부족
            throw new InsufficientBalanceException("잔액이 부족 합니다");
        }
        balance -= amount;
    }
}
