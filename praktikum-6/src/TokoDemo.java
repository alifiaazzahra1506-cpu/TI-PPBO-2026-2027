public class TokoDemo {

    public static void main(String[] args) {

        // Membuat array berisi lima object produk yang berbeda
        ProdukTugas[] daftarProduk = {
                new ProdukTugas("P001", "Buku Tulis", 5000.0, 20),
                new ProdukTugas("P002", "Pulpen", 3000.0, 15),
                new ProdukTugas("P003", "Pensil", 2000.0, 5),
                new ProdukTugas("P004", "Penghapus", 1500.0, 8),
                new ProdukTugas("P005", "Penggaris", 4000.0, 10)
        } ;

        // Menampilkan seluruh produk menggunkan perulangan
        System.out.println("=======DAFTAR PRODUK TOKO=======");

        for (ProdukTugas produk : daftarProduk) {
            produk.tampilkanData();
        }

        // Melakukan simulasi pembelian produk berbeda
        System.out.println("\n=======SIMULASI PEMBELIAN========");

        System.out.println("\nPembelian 1:");
        daftarProduk[0].kurangiStok(2);

        System.out.println(
                "\n=============PRODUK DENGAN HARGA TERMAHAL=============="
        );

        ProdukTugas produkTermahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].getHarga() > produkTermahal.getHarga()) {
                produkTermahal = daftarProduk[i];
            }
        }

        produkTermahal.tampilkanData();

        System.out.println("\n===========SELESAI==============");
    }

}
