import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====MENU MAKANAN====");
        System.out.println("1. Soto Ayam");
        System.out.println("2. Ikan Bakar");
        System.out.println("3. Sate Taican");
        System.out.println("4. Tomyam");

        System.out.println("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch(pilihan) {
            case 1:
                System.out.println("Anda memilih Ikan Bakar");
                break;

            case 2:
                System.out.println("Anda memilih Tomyam");
                break;

            case 3:
                System.out.println("Anda memilih Soto Ayam");
                break;

            case 4:
                System.out.println("Anda memilih Sate Taican");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }
        input.close();
    }
}
