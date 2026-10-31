public class BankDemo {
    public static void main(String[] args) {
        System.out.println("==== DEMOSTRASI PROGRAM REKENING BANK ====");

        // 1. Membuat minimal 2 object RekeningBank
        RekeningBank akun1 = new RekeningBank("ACC-001", "Budi Santoso", 1000000.0, "Tabungan");
        RekeningBank akun2 = new RekeningBank("ACC-002", "Siti Aminah", 500000.0, "Giro");

        // Tampilkan kondisi awal
        System.out.println("\n===== SALDO AWAL =====");
        akun1.cetakMutasi();
        akun2.cetakMutasi();

        // 2. Skenario Uji 1: Setor dan Tarik Berhasil
        System.out.println(">> Skenario 1: Uji Setor dan Tarik Tunai Berhasil");
        akun1.setor(250000.0);
        akun1.tarik(150000.00);
        System.out.println();

        // 3. Skenario Uji 2: Tarik Gagal (Saldo Tidak Cukup / Jumlah Negatif)
        System.out.println(">>> Skenario 2: Uji Tarik Gagal (Saldo Tidak Cukup)");
        akun2.tarik(2000000.0); // Saldo Siti hanya 500rb
        System.out.println();

        // 4. Transfer 4: Tranfer BERHASIL antar kedua rekening[cite: 1]
        System.out.println(">>> Skenario 4: Uji Transfer BERHASIL");
        akun1.transferKe(akun2, 2000000.0); // Siti mencoba trasfer melibihi saldonya
        System.out.println();

        // 5. Skenario Uji 4: Transfer Gagal
        System.out.println("\n>>> Skenario 4: Uji Transfer GAGAL");
        akun2.transferKe(akun1, 2000000.0);
        System.out.println();

        // Menampilkan mutasi akhir kedua rekening menggunakan cetakMutasi()[cite: 1]
        System.out.println(">>> MUTASI AKHIR KEDUA REKENING <<<\n");
        akun1.cetakMutasi();
        akun2.cetakMutasi();
    }
}
