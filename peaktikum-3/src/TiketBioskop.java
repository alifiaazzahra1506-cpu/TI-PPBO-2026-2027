import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("Apakah Anda mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int hargatiket;

        if(mahasiswa && umur < 25) {
            hargatiket = 25000;
            System.out.println("Anda mendapatkan harga khusus mahasiswa");
        }else {
            hargatiket = 40000;
            System.out.println("Anda mendapatkan harga tiket normal");
        }

        System.out.println("Harga tiket: Rp" + hargatiket);

        input.close();
    }
}
