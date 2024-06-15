package Day0614.Bank;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String massage) {
        super(massage);
    }
}
