package PBO1;

/** Menjalankan contoh Latihan 1. */
public class Latihan01 {
    public static void main(String[] args) {
        Account account = new Account(AccountType.SAVINGS);
        System.out.println("Contoh akun: " + account);

        System.out.println("Semua tipe akun:");
        for (AccountType type : AccountType.values()) {
            System.out.println(type);
        }
    }
}
