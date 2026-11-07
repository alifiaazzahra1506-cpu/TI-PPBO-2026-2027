public class Pegawai {
    private String nama;
    private String idPegawai;
    private double gajiPokok;

    // Constructor dengan validasi gajiPokok tidak boleh negatif
    public Pegawai(String nama, String idPegawai, double gajiPokok) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gajiPokok = Math.max(0, gajiPokok);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double gajiPokok() {
        return gajiPokok;
    }

    // Validasi gajiPokok, jika negatif diubah ke 0 dan tampilkan peringatan
    public void gajiPokok(double gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("[PERINGATAN] Gaji pokok untuk " + this.nama + " tidak boleh negatif! Nilai di set ke 0.");
            this.gajiPokok = 0;
        }else{
            this.gajiPokok = gajiPokok;
        }
    }

    // Method untuk menampilkan data dasar pegawai
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
    }
}
