package junit;

public class Bank_client{
    public static void main(String[] args) throws InsufficientBalanceException {
        BankAccount customer1 = new BankAccount(21,54000);
        customer1.withdraw(90000);
    }
}
