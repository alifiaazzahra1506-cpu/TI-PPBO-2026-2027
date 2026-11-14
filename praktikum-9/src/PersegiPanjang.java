public class PersegiPanjang extends BangunDatar {

    // Atribut penjang dan lebar
    private double panjang;
    private double lebar;

    // Constructor Persegi Panjang
    public PersegiPanjang(String namaBangun, double panjang, double lebar){
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Override method menghitung luas
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Override ,ethod menghitung keliling
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
