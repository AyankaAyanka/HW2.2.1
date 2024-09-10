public class BankAccount {
    private double amount;

    public BankAccount() {
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
        }
    }

    public void withDraw(int sum) throws limitException {
        if (sum > amount) {
            throw new limitException("Запрашиваемая сумма больше остатка на счете.", amount);
        } else {
            amount -= sum;
        }
    }
}
