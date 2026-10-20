public class MainBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku("Bumi", "Tere Liye", 2014);

        System.out.println("Buku 1");
        System.out.println("Judul: " + buku1.judul);
        System.out.println("Pengarang: " + buku1.pengarang);
        System.out.println("Tahun Terbit: " + buku1.tahunTerbit);

        System.out.println();

        System.out.println("Buku 2");
        System.out.println("Judul: " + buku2.judul);
        System.out.println("Pengarag: " + buku2.pengarang);
        System.out.println("Tahun Terbit: " + buku2.tahunTerbit);
    }
}
