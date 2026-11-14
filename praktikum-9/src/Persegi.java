public class Persegi extends BangunDatar {

    // Atribut panjang sisi persegi
    private double sisi;

    // Constructor Persegi
    public Persegi(String namaBangun, double sisi) {
        super(namaBangun);
        this.sisi = sisi;
    }

    // Override method menghitung luas
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Overrkelilingide menghitung
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}