public class WaktuMain {
    public static void main (String[] args) {
        Waktu waktu = new Waktu();

        waktu.setJam(10);
        waktu.setMenit(30);
        waktu.setDetik(45);

        System.out.println("Jam: " + waktu.getJam());
        System.out.println("Menit: " + waktu.getMenit());
        System.out.println("Detik: " + waktu.getDetik());

        System.out.println("\nMenguji nilai tidak valid:");
        waktu.setJam(25);
        waktu.setMenit(70);
        waktu.setDetik(80);
    }
}
