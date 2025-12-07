class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    @Override
    void tampilInfo() {
        double total = getGajiPokok() + tunjangan;
        System.out.println(
                "Nama: " + getNama() +
                        " | Gaji Pokok: Rp " + getGajiPokok() +
                        " | Tunjangan: Rp " + tunjangan +
                        "\nTotal Pendapatan: Rp " + total
        );
    }
}