import java.util.Scanner;

public class OperatorBilangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        System.out.println("\n========Operator Aritmatika======");

        System.out.println("Penjumlahan (+): " + (bilangan1 + bilangan2));
        System.out.println("Pengurangan (-): " + (bilangan1 - bilangan2));
        System.out.println("Perkalian (*): " + (bilangan1 * bilangan2));
        System.out.println("Pembagian (/): " + (bilangan1 / bilangan2));
        System.out.println("Modulus (%): " + (bilangan1 % bilangan2));

        System.out.println("\n===Operator Perbandingan===");
        System.out.println("Bilangan pertama > bilangan kedua: " + (bilangan1 > bilangan2));
        System.out.println("Bilangan pertama < bilangan kedua: " + (bilangan1 < bilangan2));
        System.out.println("Bilangan pertama == bilangan kedua: " + (bilangan1 == bilangan2));

        input.close();

    }
}
