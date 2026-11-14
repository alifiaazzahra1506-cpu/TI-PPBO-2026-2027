public class BangunDatarDemo {
    public static void main(String[] args) {

        // Membuat array berrisi lima objek dari tiga subclass
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran 1", 7),
                new Lingkaran("Lingkaran 2", 5),
                new Persegi("Persegi 1", 4),
                new Persegi("Persegi 2", 6),
                new PersegiPanjang("Persegi Panjang", 8, 5)
        };

        // Variabel untuk menyimpan total luas seluruh bangun datar
        double totalLuas = 0;

        // Variabel untuk menyimpan bangun datar dengan luas terbesar
        BangunDatar bangunTerbesar = daftarBangun[0];

        // Menampilkan informasi seluruh bangun menggunkan perulangan
        System.out.println("================================");
        System.out.println("       DATA BANGUN DATAR        ");
        System.out.println("================================");

        // Perulangan untuk menampilkan informasi bangun
        for (int i = 0; i < daftarBangun.length; i++) {

            System.out.println("\nBangun ke-" + (i + 1));

            daftarBangun[i].tampilkanInfo();

            // Menghitung total luas
            totalLuas += daftarBangun[i].hitungLuas();

            // Mencari bangun dengan luas terbesar
            if (daftarBangun[i].hitungLuas()
                    > bangunTerbesar.hitungLuas()) {

                bangunTerbesar = daftarBangun[i];
            }
        }

        System.out.println("\n================================");
        System.out.println("         HASIL PERHITUNGAN        ");
        System.out.println("==================================");

        System.out.printf("Total Luas Seluruh Bangun : %.2f%n",
                totalLuas);

        System.out.println("Bangun dengan Luas Terbesar: "
                + bangunTerbesar.namaBangun);

        System.out.printf("Luas Terbesar              : %.2f%n",
                bangunTerbesar.hitungLuas());

        System.out.println("=================================");
    }
}