import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nArray sebelum diurutkan: ");

        for (int i =0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        for (int i = 0; i < angka.length -1; i++) {
            for (int j = 0; j < angka.length -1 -i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
                input.close();
            }
        }
        System.out.print("\nArray setelah diurutkan: ");

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        input.close();
    }
}
