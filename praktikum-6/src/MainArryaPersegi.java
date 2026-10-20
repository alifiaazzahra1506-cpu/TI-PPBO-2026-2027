public class MainArryaPersegi {
    public static void main(String[] args) {
        Persegi[] persegi = {
                new Persegi(4),
                new Persegi(7),
                new Persegi(3),
                new Persegi(9),
        } ;

        Persegi terbesar = persegi[0];

        for (int i = 1; i< persegi.length; i++) {
            if (persegi[i].hitungLuas() > terbesar.hitungLuas()) {
                terbesar = persegi[i];
            }
        }

        System.out.println("Persegi dengan Luas Terbesar");
        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas: " + terbesar.hitungLuas());
    }
}
