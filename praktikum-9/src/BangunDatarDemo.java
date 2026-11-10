public class BangunDatarDemo {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new Lingkaran(3),
                new Persegi(4)
        };

        double totalLuas = 0;

        for (int i = 0; i < daftarBangun.length; i++) {

            double luas = daftarBangun[i].hitungLuas();

            System.out.println("Luas bangun ke-" + (i + 1)
                    + ": " + luas);

            totalLuas += luas;
        }

        System.out.println("----------------------");
        System.out.println("TOTAL LUAS: " + totalLuas);
    }
}