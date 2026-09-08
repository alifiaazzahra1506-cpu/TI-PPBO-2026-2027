import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu Celsius:  ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9/5 + 32;

        System.out.println("Masukkan Fahrenheit:  " + fahrenheit);

        input.close();
    }
}
