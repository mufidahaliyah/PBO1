package PBO1;

/** Tipe akun yang tersedia dalam latihan 1. */
public enum AccountType {
    SAVINGS("Akun tabungan"),
    CREDIT("Akun kredit"),
    DEPOSIT("Akun deposito");

    private final String description;

    AccountType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + " - " + description;
    }
}
