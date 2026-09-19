import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {

        // Membuat Scanner untuk menerima inputan dari pengguna
        Scanner input = new Scanner(System.in);

        // Menentukan tarif listrik untuk setiap golongan daya
        final int TARIF_450 = 500;
        final int TARIF_900 = 1000;
        final int TARIF_1300 = 1500;
        final int TARIF_2200 = 1700;
        final int TARIF_DIATAS_2200 = 2000;

        // Menginput golongan daya listrik
        System.out.print("Masukkan golongan daya listrik (VA):  ");
        int daya = input.nextInt();

        // Memasukkan jumlah pemakaian listrik dalam kWh
        System.out.print("Masukkan jumlah pemakaian listrik (kWh):  ");
        double kWh = input.nextDouble();

        // Melakukan pengecekan apakah jumlah pemakaian valid
        if (kWh <= 0) {
            System.out.println("ERROR: Pemakaian kHw harus lebih dari 0");
        } else {

            // variabel untuk menyimpan nama golongan dan tarif
            int tarif;
            String golongan;

            // Menentukan tarif berdasarkan golongan daya
            if (daya == 450) {
                golongan = "450 VA";
                tarif = TARIF_450;

            } else if (daya == 900) {
                golongan = "900 VA";
                tarif = TARIF_900;

            } else if (daya == 1300) {
                golongan = "1300 VA";
                tarif = TARIF_1300;

            } else if (daya == 2200) {
                golongan = "2200 VA";
                tarif = TARIF_2200;

            } else if (daya > 2200) {
                golongan = "Di atas 2200 VA";
                tarif = TARIF_DIATAS_2200;

            // Menampilkan pesan error jika golongan tidak valid
            } else {
                System.out.println("ERROR: Golongan tidak valid.");
                input.close();
                return;
            }

            // menghitung tagihan listrik
            double totalTagihan = kWh * tarif;

            // Menampilkan Hasil
            System.out.println();
            System.out.println("=============================");
            System.out.println("TAGIHAN LISTRIK");
            System.out.println("=============================");
            System.out.println("Golongan Daya: " + golongan);
            System.out.printf("Jumlah kWh   : %.2f kWh%n", kWh);
            System.out.printf("Tarif per kWh : Rp%d%n", tarif);
            System.out.printf("Total Tagihan : Rp%.2f%n", totalTagihan);
            System.out.println("=============================");
        }

        // menutup fungsi Scanner
        input.close();
    }
}
