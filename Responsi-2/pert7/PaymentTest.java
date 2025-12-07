public class PaymentTest {

    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment ewallet = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("Saldo awal: " + ewallet.getBalance());
        System.out.println("Memproses pembayaran sebesar " + 50000 + "...");

        String hasil = ewallet.processPayment();
        System.out.println(hasil);

        System.out.println("Sisa saldo: " + ewallet.getBalance());
        System.out.println("Detail Transaksi: " + ewallet.getPaymentDetails());
    }
}
