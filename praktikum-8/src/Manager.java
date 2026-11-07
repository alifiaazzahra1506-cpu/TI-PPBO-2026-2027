public class Manager extends Pegawai {
    private double tunjanganJabatan;

    // Constructor memanggil constructor Pegawai via super()
    public Manager(String nama, String idPegawai, double gajiPokok, double tunjanganJabatan) {
        super(nama, idPegawai, gajiPokok);
        this.tunjanganJabatan = Math.max(0, tunjanganJabatan);
    }

    // Getter untuk tunjanganJabatan
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
        }
    public void setTunjanganJabatan(double tunjanganJabatan) {
            this.tunjanganJabatan = Math.max(0, tunjanganJabatan);
        }

        @Override
    public void tampilkanData() {
            super.tampilkanData();
            System.out.println("Tunjangan Jabatan : Rp " + String.format("%,.2f", tunjanganJabatan));
        }
    }

