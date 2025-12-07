public abstract class KendaraanGalaksi {
    private String namaKendaraan;
    private int levelEnergi;          // 0–100
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // default
    }
    public String getNamaKendaraan() {
        return namaKendaraan;
    }
    public int getLevelEnergi() {
        return levelEnergi;
    }
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    private void setLevelEnergi(int energiBaru) {
        if (energiBaru < 0) energiBaru = 0;
        if (energiBaru > 100) energiBaru = 100;
        this.levelEnergi = energiBaru;
    }
    public final void kurangiEnergi(int jumlah) {
        setLevelEnergi(this.levelEnergi - jumlah);
    }
    public final void tambahEnergi(int jumlah) {
        setLevelEnergi(this.levelEnergi + jumlah);
    }

    public final void tampilStatus() {
        System.out.println(
                getNamaKendaraan() + " | Energi: " + levelEnergi +
                        "% | Kapasitas: " + kapasitasPenumpang + " orang"
        );
    }
    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
}