package PBO1;

/** Menyimpan tipe akun menggunakan enum AccountType. */
public class Account {
    private final AccountType type;

    public Account(AccountType type) {
        this.type = type;
    }

    public AccountType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Account{type=" + type + "}";
    }
}
