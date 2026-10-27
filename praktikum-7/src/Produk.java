public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);

        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Penolakan: stok tidak boleh negatif.");
            this.stok = 0;
        }
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Penolakan: harga tidak boleh negatif.");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambahkan.");
        } else {
            System.out.println("Penolakan: jumlah harus positif.");
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Penolakan: jumlah harus positif.");
        } else if (jumlah > stok) {
            System.out.println("Penolakan: stok tidak mencukupi.");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi.");
        }
    }

    public void tampilkanData() {
        System.out.println("Kode Produk: " + kodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
    }
}