public class BankAccount {
    String bank,
           ownersName;
    static int idGeneral = 0;
    int id;
    int money;
    boolean isValid;

    BankAccount() {
        bank = "ING";
        ownersName = "Jan Kowalski";
        id = idGeneral++;
        money = 0;
        isValid = true;
    }

    BankAccount(String bank, String ownersName, int money, boolean isValid) {
        this.bank = bank;
        this.ownersName = ownersName;
        this.id = idGeneral++;
        this.isValid = isValid;
    }

    void login(int id) {
        if (this.id == id)
            System.out.println("Logined successfully");
        else
            System.out.println("Wrong ID");
    }

    void addMoney(int amount) {
        this.money += amount;
    }

    void withdraw(int amount) {
        if (this.money >= amount) {
            this.money -= amount;
        } else {
            System.out.println("Insufficient money on your account.");
        }
    }
}
