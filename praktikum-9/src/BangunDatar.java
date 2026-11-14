public class BangunDatar {

    // Atribut untuk menyimpan nama bangun
    protected String namaBangun;

    // Constructor untuk mengisi nama bangun
    public BangunDatar(String namaBangun) {
       this.namaBangun = namaBangun;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
       return 0;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 0;
    }

    // Method untuk menampilkan informasi bangun datar
    public void tampilkanInfo() {
      System.out.println("Nama Bangun    : " + namaBangun);
      System.out.printf("Luas           : %.2f%n", hitungLuas());
      System.out.printf("Keliling       : %.2f%n", hitungKeliling());
      System.out.println("---------------------------------------");
    }
}