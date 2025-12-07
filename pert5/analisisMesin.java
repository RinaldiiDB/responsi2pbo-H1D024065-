import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] list = new defaultMesin[5];

        list[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        list[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        list[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        list[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        list[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : list) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }
        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : list) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        defaultMesin terbaik = list[0];
        for (defaultMesin m : list) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        Arrays.sort(list, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin a, defaultMesin b) {
                return Double.compare(b.nilaiPerforma(), a.nilaiPerforma());
            }
        });

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + list[i].namaMesin + " → " + list[i].nilaiPerforma());
        }
    }
}