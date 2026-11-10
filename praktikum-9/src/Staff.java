public class Staff extends Pegawai {
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

    // Pada Staff.java:
    @Override
    public double hitungGaji () {
        return gajiPokok + tunjanganKinerja;
    }
}
