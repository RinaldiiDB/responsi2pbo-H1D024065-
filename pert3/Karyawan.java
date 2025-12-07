class Karyawan {
    private String nama;
    private double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    public String getNama() {
        return nama;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}