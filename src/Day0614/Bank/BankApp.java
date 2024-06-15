package Day0614.Bank;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();

        try{
            bankaccount.withdraw(10000);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
