public class Lingkaran extends BangunDatar {

    // Atribut jari-jari Lingkaran
    private double radius;

    // Constructor Lingkaran
    public Lingkaran(String namaBangun, double radius) {
        super(namaBangun);
        this.radius = radius;
    }

    // Override method menhitung luas
    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Override menghitung keliling
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}