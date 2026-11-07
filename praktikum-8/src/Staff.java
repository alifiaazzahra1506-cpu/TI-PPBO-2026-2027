public class Staff extends Pegawai{
    private double tunjanganKinerja;

    // Constructor memanggil constructor Pegawai melalui super
    public Staff(String nama, String idPegawai, double gajiPokok, double tunjanganKinerja) {
        super(nama, idPegawai, gajiPokok);
        this.tunjanganKinerja = Math.max(0, tunjanganKinerja);
    }

    // Getter untuk tunjanganKinerja
    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }

    public void setTunjanganKinerja(double tunjanganKinerja) {
        this.tunjanganKinerja = Math.max(0, tunjanganKinerja);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
            System.out.println("Tunjangan Kinerja : Rp " + String.format("%,.2f", tunjanganKinerja));
        }
    }
