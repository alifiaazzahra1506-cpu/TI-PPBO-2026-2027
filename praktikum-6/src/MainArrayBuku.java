public class MainArrayBuku {
    public static void main(String[] args) {
        Buku[] buku = {
                new Buku("Laskar Pelangi", "Andrea Hirata", 2005),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2018),
                new Buku("Ayat-Ayat Cinta", "Habiburrahman EL Shirazy", 2004),
        };

        for (int i = 0; i < buku.length; i++) {
            if (buku[i].tahunTerbit > 2015) {
                System.out.println("Judul: " + buku[i].judul);
            }
        }
    }
}
