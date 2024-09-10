public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(21000);

        while (true) {
            try {
                account.withDraw(7000);
                System.out.println("Снято 7000 сом. Остаток на счете: " + account.getAmount());
            } catch (limitException e) {
                System.out.println(e.getMessage());
                try {
                    account.withDraw((int) e.getRemainingAmount());
                    System.out.println("Снято " + e.getRemainingAmount() + " сом. Остаток на счете: " + account.getAmount());
                } catch (limitException ex) {
                }
                break;
            }
        }
    }
}
