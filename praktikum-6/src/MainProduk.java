public class MainProduk {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop", 1500000);
        Produk produk2 = new Produk("Mouse", 500000);
        Produk produk3 = new Produk("Keyboard", 500000);

        double batasHarga = 15000000;

        System.out.println("Nama Produk: " + produk1.namaProduk);
        System.out.println("Harga: " + produk1.harga);
        System.out.println("Mahal: " + produk1.isMahal(batasHarga));

        System.out.println();

        System.out.println("Nama Produk: " + produk2.namaProduk);
        System.out.println("Harga: " + produk2.harga);
        System.out.println("Mahal: " + produk2.isMahal(batasHarga));

        System.out.println();

        System.out.println("Nama Produk: " + produk3.namaProduk);
        System.out.println("Harga: " + produk3.harga);
        System.out.println("Mahal: " + produk3.isMahal(batasHarga));
    }
}
