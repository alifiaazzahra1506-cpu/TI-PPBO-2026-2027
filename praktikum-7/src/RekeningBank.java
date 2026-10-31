
public class RekeningBank {

    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private final String jenisRekening; // Read-only, hanya diisi lewat constructor

    // Constructor untuk inisialisasi data rekening
    public RekeningBank(String nomorRekening, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;

        // Validasi saldo awal minimal 0
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("[PERINGATAN] Saldo awal tidak boleh negatif. Saldo diset ke 0.");
        }
    }

    // Getter dan Setter nomor rekening
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        if (nomorRekening != null && !nomorRekening.isBlank()) {
            this.nomorRekening = nomorRekening;
        }
    }

    // Getter dan Setter pemilik
    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    // Getter saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter jenis rekening (read-only, tanpa setter)
    public String getJenisRekening() {
        return jenisRekening;
    }

    // Method setor tunai
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor tunai sebesar Rp " + jumlah
                    + " BERHASIL ke rekening " + nomorRekening);
        } else {
            System.out.println("Setor tunai GAGAL: Jumlah setoran harus lebih besar dari 0.");
        }
    }

    // Method tarik tunai dengan validasi
    public void tarik(double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Tarik tunai sebesar Rp " + jumlah
                        + " BERHASIL dari rekening " + nomorRekening);
            } else {
                System.out.println("Tarik tunai GAGAL: Saldo tidak mencukupi (Saldo saat ini: Rp "
                        + saldo + ")");
            }
        } else {
            System.out.println("Tarik tunai GAGAL: Jumlah penarikan harus lebih besar dari 0.");
        }
    }

    // Method transfer antar rekening
    public void transferKe(RekeningBank tujuan, double jumlah) {

        if (tujuan == null) {
            System.out.println("Transfer GAGAL: Rekening tujuan tidak ditemukan.");
            return;
        }

        System.out.println("\n--- Memproses Transfer dari "
                + this.pemilik + " ke " + tujuan.getPemilik() + " ---");

        if (tujuan == this) {
            System.out.println("Transfer GAGAL: Tidak dapat transfer ke rekening sendiri.");
        } else if (jumlah <= 0) {
            System.out.println("Transfer GAGAL: Jumlah transfer harus lebih besar dari 0.");
        } else if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer BERHASIL! Sebesar Rp " + jumlah
                    + " telah dikirim ke rekening " + tujuan.getNomorRekening());
        } else {
            System.out.println("Transfer GAGAL: Saldo pengirim tidak mencukupi. (Saldo Anda: Rp "
                    + this.saldo + ", jumlah transfer: Rp " + jumlah + ")");
        }
    }

    // Method cetakMutasi() untuk menampilkan laporan rekening
    public void cetakMutasi() {
        System.out.println("===================================");
        System.out.println("       LAPORAN MUTASI REKENING     ");
        System.out.println("===================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo Saat ini : Rp " + String.format("%,.2f", saldo));
        System.out.println("===================================");
    }
}
