import java.util.Scanner;

public class Latihan5 {
    static int hitungTotal(int[] data) {
        int total = 0;

        for (int n : data)
            total += n;

        return total;
    }

    static int[] filterDiatasRataRata(int[] data) {
        double rata = (double) hitungTotal(data) / data.length;

        int jumlah = 0;

        for (int n : data)
            if (n > rata) jumlah++;

        int[] hasil = new int[jumlah];
        int j = 0;

        for (int n : data)
            if (n > rata) hasil[j++] = n;

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah nilai: ");
        int n = input.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ":");
            data[i] = input.nextInt();
        }
        System.out.println("Total: " + hitungTotal(data));

        int[] hasil = filterDiatasRataRata(data);

        System.out.print("Di atas rata-rata: ");

        for (int x : hasil)
            System.out.print(x + " ");

    }
}