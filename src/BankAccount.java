public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.ownerName = accountName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println("유효하지 않는 금액 입니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    public void printBalance() {
        System.out.println("현재 잔액은 "+balance+"원 입니다.");
    }
}
