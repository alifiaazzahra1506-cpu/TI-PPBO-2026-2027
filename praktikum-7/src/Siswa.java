public class Siswa {
    private double nilai;

    public Siswa(double nilai) {
        setNilai(nilai);
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai ditolak! Harus antara 0-100.");
        }
        ;
    }

    public String getNilaiHuruf() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 55) {
            return "C";
        } else if (nilai >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
}
