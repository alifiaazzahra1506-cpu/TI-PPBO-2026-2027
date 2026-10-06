public class Latihan2 {

    // Method untuk menentukan apakah suatu bilangan adalah bilangan prima
    static boolean isPrima(int n) {

        // Bilangan kurang dari 2 bukan bilangan prima
        if (n < 2) {
            return false;
        }

        // Mengecek apakah n dapat dibagi oleh bilangan lain
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
            System.out.println("Bilangan prima dari 1 sampai 50: ");

            for (int i = 1; i <= 50; i++) {
                if ( isPrima(i)) {
                    System.out.println(i + " ");
                }
            }
        }
    }