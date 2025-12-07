class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna();
        p.umur = 25;
        p.berat = 60.0;
        p.tinggi = 170.0;

        p.tampilInfo();
        System.out.println();
        System.out.println("Demonstrasi Konstanta Final");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faltor aktivitas bersifat final(konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasikan\n");

        /*System.out.println("Jika kita coba nulis:");
        System.out.println("p.faktorAktivitas = 1.5;\n");
        System.out.println("Maka compiler akan menolak dengan error:");
        System.out.println("'cannot assign a value to final variable faktorAktivitas'");
        */
    }
}