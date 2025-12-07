public class EWalletPayment implements PaymentMethod {

    private String layanan;
    private double nominal;
    private double saldo;

    public EWalletPayment(String layanan, double nominal, double saldo) {
        this.layanan = layanan;
        this.nominal = nominal;
        this.saldo = saldo;
    }
    @Override
    public String processPayment() {
        double totalBayar = nominal + getTransactionFee();

        if (saldo >= totalBayar) {
            saldo -= totalBayar;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + layanan;
    }
    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
