public class BukuMain {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar Pelangi", "Andrea Hinata", 2005);

        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Pengarang: " + buku.getPengarang());
        System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
    }
}
