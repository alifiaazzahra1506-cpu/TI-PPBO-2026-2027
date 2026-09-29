import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen matriks 3x3: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriks[" + i + "][" + j + "] = ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriks: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        int totalMatriks = 0;

        System.out.println("\njumlah setiap baris: ");

        for (int i = 0; i < 3; i++) {
            int jumlahBaris = 0;

            for (int j = 0; j < 3; j++) {
                jumlahBaris += matriks[i][j];
            }

            System.out.println("Jumlah baris " + (i + 1) + " = " + jumlahBaris);
            totalMatriks += jumlahBaris;
        }
    }
}
