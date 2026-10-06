import java.util.Arrays;
import java.util.Scanner;

public class KalkulatorMethod {

    // Method untuk menjumlahkan 2 angka
    // Memiliki 2 parameter yaitu a dan b
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method untuk menjumlahkan 3 angka
    // ini adalah contoh method Overloading
    static double tambah(double a, double b, double c) {
        return a + b +c;
    }

    // Method untuk melakukan pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method untuk melakukan  perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method untuk melakukan pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method untuk melakukan
    // Math.pow(a, b) berarti a pangkat b
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method untuk menghitung akar kuadrat
    // Math.sqrt() untuk mencari akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    // Mencari hasil terbesar dari riwayat dari semua hasil yang tersimpan di array
    static double riwayatMaksimum(double [] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        // perulangan untuk memeriksa semua isi array
        for (double hasil : riwayatHasil) {

            // proses pengecekan
            if (hasil > maksimum) {
                maksimum = hasil;
            }
        }
        // mengembalikan nilai maksimum
        return maksimum;
    }

    public static void main(String[] args) {

        // membuat Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // membuat arrya riwayat hasil dengan ukuran awal 0
        double[] riwayatHasil = new double[0];

        // perulangan program kalkulator
        while (true) {

            // menampilkan menu pilihan program kalkulator
            System.out.println();
            System.out.println("KALKULATOR METHOD");
            System.out.println("1. Tambah 2 angka");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Pangkat");
            System.out.println("6. Akara Kuadrat");
            System.out.println("7. Tambah 3 angka");
            System.out.println("0. Keluar");
            System.out.println("Pilih: ");

            // membaca pilhan menu dari pengguba
            int pilihan = input.nextInt();

            // pengecekan, jika pengguna memilih 0, program akan berhenti
            if (pilihan == 0) {

                // mengecek apakah sudah ada riwayat hasil
                if (riwayatHasil.length  > 0) {
                    System.out.println("Hasil Maksimum: " + riwayatMaksimum(riwayatHasil));
                }

                // menampilkan pesan program selesai
                System.out.println("Program Selesai");
                break;
            }
            // variabel untuk menyimpan hasil perhitungan
            double hasil;

            // memprosen pilihan pengguna
            switch (pilihan) {
                case 1:

                    // input angka pertama
                    System.out.print("Masukkan angka pertma: ");
                    double a1 = input.nextDouble();

                    // input angka kedua
                    System.out.print("Masukkan angka kedua: ");
                    double b1 = input.nextDouble();

                    // memanggil method tambah
                    hasil = tambah(a1, b1);

                    // menampilkan hasil
                    System.out.println("Hasil = " + hasil);
                    break;

                case 2:

                    // input angka pertama
                    System.out.print("Masukkan angka pertama: ");
                    double a2 = input.nextDouble();

                    // input angka kedua
                    System.out.print("Masukkan angka kedua: ");
                    double b2 = input.nextDouble();

                    // memanggil method kurang
                    hasil = kurang(a2, b2);

                    // menampilkan hasil
                    System.out.println("Hasil = " + hasil);
                    break;

                case 3:

                    // input angka pertama
                    System.out.print("Masukkan angka pertama: ");
                    double a3 = input.nextDouble();

                    // input angka kedua
                    System.out.print("Masukkan angka kedua: ");
                    double b3 = input.nextDouble();

                    // memanggil method kali
                    hasil = kali(a3, b3);

                    // menampilkan hasil
                    System.out.println("Hasil + " +  hasil);
                    break;

                case 4:

                    // input angka pertama
                    System.out.print("Masukkan angka pertama: ");
                    double a4 = input.nextDouble();

                    // input angka kedua
                    System.out.println("Masukkan angaka kedua: ");
                    double b4 = input.nextDouble();

                    // mengecek apakah pembagi bernilai 0
                    if (b4 == 0) {

                        // pembagian dengan 0 tidak boleh
                        System.out.println("Tidak bisa membagi dengan nol.");

                        // kembali ke awal
                        continue;
                    }

                    hasil = bagi(a4, b4);
                    System.out.println("Hasil " + hasil);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    double a5 = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double b5 = input.nextDouble();

                    // memnaggil method pangkat
                    hasil = pangkat(a5, b5);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 6:
                    System.out.print("Masukkan angka pertama: ");
                    double a6 = input.nextDouble();

                    // mengecek apakah angka bernilai negatif
                    if (a6 < 0) {

                        // akar kuadrat jika bilangan negatif tidak di proses
                        System.out.println("Tidak bisa mencari akar bilangan negatif.");
                        continue;
                    }

                    hasil = akarKuadrat(a6);
                    System.out.println("Hasil = " + hasil);
                    break;

                case 7:
                    System.out.print("Masukkan angka pertama: ");
                    double a7 = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    double b7 = input.nextDouble();

                    System.out.print("Masukkan angka ketiga: ");
                    double c7 = input.nextDouble();

                    hasil = tambah(a7, b7, c7);
                    System.out.println("Hasil = " + hasil);
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
                    continue;
            }

            // Menambah ukuran array riwayat sebanyak 1
            // Arrays.copyOf digunakan untuk membuat array baru
            // dengan ukuran yang lebih besar
            riwayatHasil = Arrays.copyOf(
                    riwayatHasil,
                    riwayatHasil.length + 1
            );

            // menyimpan hasil perhitungan terakhir
            riwayatHasil[riwayatHasil.length - 1] = hasil;
        }

        // menutup Scanner setelah program selesai
        input.close();
    }
}
