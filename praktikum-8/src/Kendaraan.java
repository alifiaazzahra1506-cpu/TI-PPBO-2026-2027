public class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;

    // Constructor berparameter (Latihan 3)
    public Kendaraan(String merek, int kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {
    private int jumlahPintu;

// Constructor memanggil super() (Latihan 3)
public Mobil(String merek, int kecepatanMaks. int jumlahPintu) {
    super(merek, kecepatanMaks);
    this.jumlahPintu = jumlahPintu;
}

    // Subclass Motor
public class Motor extends Kendaraan {
    private String jenisMotor;


// Constructor chaining memanggil super() (Latihan 3)
    public Motor(String merek, int kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }
}