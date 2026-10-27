public class SiswaMain {
    public static void main(String[] args) {
        Siswa siswa = new Siswa(90);

        System.out.println("Nilai: " + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(65);

        System.out.println("Nilai baru: " + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(150);
    }
}
