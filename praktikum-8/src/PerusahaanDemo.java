public class PerusahaanDemo {
    public static void main(String[] args) {

        // Membuat Objek Manager
        Manager manager = new Manager("Budi", "M001", 8000000, 2000000);

        // Membuat Objek Staff
        Staff staff = new Staff("Raissa", "S001", 4000000, 2000000);

        // Membuat Objek Direktur
        Direktur direktur = new Direktur("Alifia", "D001", 15000000, 5000000, 3000000);

        // Menampilkan Data Manager
        System.out.println("==== DATA MANAGER ====");
        manager.tampilkanData(); //Method 'warisan' dari pegawai

        // Menampilkan Data Staff
        System.out.println("==== DATA STAFF ====");
        staff.tampilkanData();

        // Menampilkan Data Direktur
        System.out.println("==== DATA DIREKTUR ====");
        direktur.tampilkanData();

        // Menguji Validasi Gaji Negatif
        System.out.println("==== UJI VALIDASI GAJI ====");
        Pegawai pegawai = new Pegawai("Anna", "P001", -500000);

        pegawai.tampilkanData();

    }
}
