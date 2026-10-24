public class ProdukTugas {

    // Atribut untuk menyimpan informasi produk
    private String KodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Construktor untuk mengisi seluruh atribut
    public ProdukTugas(String KodeProduk, String namaProduk, double harga, int stok) {
        this.KodeProduk = KodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Menghitung total harga pembelian
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // mengurangi stok jika stok mencukupi
    public void kurangiStok(int jumlah){
        if(jumlah <= 0) {
            System.out.println("Jumlah pembelian harus lebih dari 0.");
        } else if (stok >= jumlah) {
            stok -= jumlah;

        System.out.println("Pembelian berhasil." + namaProduk);
        System.out.println("Jumlah dibeli:  " + jumlah);
        System.out.printf("Total harga: Rp%.2f%n", hitungTotalHarga(jumlah));
        System.out.println("Sisa stok: " + stok);
        } else {
            System.out.println("Stok tidak mencukupi untuk produk " + namaProduk + ".");
            System.out.println("Stok tersedia: " + stok + ", jumlah diminta: " + jumlah);
        }
    }

    // Menampilkan seluruh informasi produk
    public void tampilkanData() {
        System.out.println("Kode Produk: " + KodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok : " + stok);
        System.out.println("--------------------------------------");
    }

    // Getter untuk mengambil harga dan nama produk
    public double getHarga() {
        return harga;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
}
