package c322.homework.homework5.parta;

public class CreateBankAccount {
    private static CreateBankAccount newAccount;
    private CreateBankAccount() {}

    public static CreateBankAccount getNewAccount() {
        if (newAccount == null) {
            newAccount = new CreateBankAccount();
            System.out.println("New Account created.");
        } else {
            System.out.println("Account already opened.");
        }
        return newAccount;
    }
}
