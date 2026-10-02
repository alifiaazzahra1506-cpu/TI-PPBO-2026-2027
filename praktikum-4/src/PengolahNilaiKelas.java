import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi dan inisialisasi nilai KKM
        int KKM = 70;

        System.out.println("==========================================");
        System.out.println("          PENGOLAHAN NILAI KELAS          ");
        System.out.println("==========================================");

        // Membaca inputan jumlah mahasiswa
        System.out.println("Masukkan jumlah mahasiswa:");
        int N = input.nextInt();

        // Membuat array untuk menyimpan nilai maksimum
        int[] nilai = new int[N];

        // Membaca nilai setiap mahasiswa
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menghitung jumlah nilai, nilai tertinggi, nilai terendah, jumlah lulus, dan tidak lulus
        int jumlahNilai = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < N; i++) {

            // Menghitung jumlah seluruh nilai
            jumlahNilai += nilai[i];

            // Mencari nilai tertinggi
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            // Menaci nilai terendah
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            // Menentukan mahasiswa Lulus atau tidak Lulus
            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata kelas
        double rataRata = (double) jumlahNilai / N;

        // Menampilkan hasil perhitungan
        System.out.println();
        System.out.println("=================================================");
        System.out.println("                HASIL NILAI KELAS                ");
        System.out.println("=================================================");
        System.out.println("Jumlah mahasiswa       : " + N);
        System.out.println("KKM                     : " + KKM);
        System.out.printf("Rata-rata kelas         : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi         : " + nilaiTertinggi);
        System.out.println("Nilai terendah          : " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa lulus  : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);

        // Menampilkan array sebelum diurutkan
        System.out.println();
        System.out.print("Array sebelum diurutkan : ");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println();

        // Bubble Sort Ascending
        // Mengurutkan nilai dari terkecil ke terbesar
        for (int i = 0; i < N - 1; i++) {

            for (int j = 0; j < N - 1; j++) {

                // jika nilai sebelah kiri lebih besar, maka kedua nilai ditukar
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan array setelah diurutkan
        System.out.print("Array setelah diurutkan : ");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println();

        System.out.println("===========================================================");

        input.close();
    }
}