public class MainPersegi {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(4);
        Persegi persegi2 = new Persegi(6);
        Persegi persegi3 = new Persegi(8);

        System.out.println("Persegi 1");
        System.out.println("Sisi: " + persegi1.sisi);
        System.out.println("Luas: " + persegi1.hitungLuas());
        System.out.println("Keliling: " + persegi1.hitungKeliling());

        System.out.println();

        System.out.println("Persegi 2");
        System.out.println("Sisi: " + persegi2.sisi);
        System.out.println("Luas: " + persegi2.hitungLuas());
        System.out.println("Keliling: " + persegi2.hitungLuas());

        System.out.println();

        System.out.println("Persegi 3");
        System.out.println("Sisi: " + persegi3.sisi);
        System.out.println("Luas: " + persegi3.hitungLuas());
        System.out.println("Keliling: " + persegi3.hitungKeliling());
    }
}
