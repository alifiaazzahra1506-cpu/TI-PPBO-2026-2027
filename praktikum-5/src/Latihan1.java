public class Latihan1 {

    // Method untuk menghitung luas persegi panjang
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // Method untuk menghitung luas lingkaran
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        // Memanggil method luas persegi panjang dengan beberapa nilai
        double luas1 = luasPersegiPanjang(10, 5);
        double luas2 = luasPersegiPanjang(15, 8);

        System.out.println("Luas Persegi Panjang : ");
        System.out.println("Panjang = 10, lebar = 5");
        System.out.println("Luas = " + luas1);

        System.out.println();

        System.out.println("Panjang = 15, lebar = 8 ");
        System.out.println("Luas = " + luas2);

        // Memanggil method luas lingkaran dengan beberapa nilai
        double luas3 = luasLingkaran(7);
        double luas4 = luasLingkaran(10);

        System.out.println();
        System.out.println("Luas Lingkaran : ");
        System.out.println("Jari-jari = 7");
        System.out.println("Luas =" + luas3);

        System.out.println();
        System.out.println("Jari-jari = 10");
        System.out.println("Luas = " + luas4);
    }
}
