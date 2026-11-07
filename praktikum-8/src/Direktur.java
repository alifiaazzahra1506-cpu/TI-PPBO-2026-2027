public class Direktur extends Manager {
    private double tunjanganSaham;

    // Constructor memanggil constructor Manager melalui super()
    public Direktur(String nama, String idPegawai,double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        super(nama, idPegawai, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = Math.max(0, tunjanganSaham);
    }

    // Getter dan Setter untuk tunjanganSaham
    public double getTunjanganSaham() {
        return tunjanganSaham;
    }

    // Setter (sudah ditambahkan void)
    public void setTunjanganSaham(double tunjanganSaham) {
        this.tunjanganSaham = Math.max(0, tunjanganSaham);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData(); // Menampilkan data Pegawai + Tunjangan Jabatan dari Manager
        System.out.println("Tunjangan Saham : Rp " + String.format("%,.2f", tunjanganSaham));
    }
}
