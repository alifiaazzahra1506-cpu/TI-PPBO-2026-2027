public class BukuMain {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar Pelangi", "Andrea Hinata", 2005);

        buku.setJudul("Sang Pemimpi");
        buku.setPengarang("Andrea Hinata");

        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Pengarang: " + buku.getPengarang());
        System.out.println("Tahun terbit: " + buku.getTahunTerbit());


    }

}
