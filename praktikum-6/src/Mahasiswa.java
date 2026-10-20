public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    public Mahasiswa(String nama, String nim, double ipk) {
        nama = nama; // this.nama = atribut, nama = parameter
        nim = nim;
        ipk = ipk;
    }
}

