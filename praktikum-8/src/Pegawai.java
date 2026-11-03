public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok;

    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
