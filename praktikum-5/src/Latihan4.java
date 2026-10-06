import java.util.Scanner;

public class Latihan4 {

    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int n : data)
            if (n < min) min = n;

        return min;
    }
    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int n : data)
            if (n > max) max = n;

        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah nilai: ");
        int n = input.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("Minimum: " + cariNilaiMinimum(nilai));
        System.out.println("Maksimum: " + cariNilaiMaksimum(nilai));
    }
}
