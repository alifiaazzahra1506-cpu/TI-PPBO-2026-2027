/*
    * Nama Program : KalkulatorBangunDatar
    * Nama         : Alifia Az Zahra
    * NIM          : 2025573010041
    * Kelas        : TI 2A
 */

import java.util.Scanner;

public class KalkulatorBangunDatar {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima inputan dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        // Meminta pengguna memasukkan lebar persegi panjang
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas persegi panjang dan keliling persegi panjang
        double LuasPersegiPanjang = panjang * lebar;
        double KelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil perhitungan persegi panjang
        System.out.println("\n=====HASIL PERSEGE PANJANG=====");
        System.out.println("Luas      : " + LuasPersegiPanjang);
        System.out.println("Keliling  : " + KelilingPersegiPanjang);

        // Mengecek apakah luas persegi panjang lebih besar dari 100
        boolean LuasBesar = LuasPersegiPanjang > 100;

        // Menampilkan hasil penegcekan luas
        System.out.println("Luas > 100 : " + LuasBesar);

        // Meminta pengguna untuk memasukkan jari-jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas lingkaran dan keliling lingkaran menggunakan rumus
        double LuasLingkaran = Math.PI * jariJari * jariJari;
        double KelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan hasil perhitungan lingkaran
        System.out.println("\n====HASIL LINGKARAN====");
        System.out.println("Luas         : " + LuasLingkaran);
        System.out.println("Keliling     : " + KelilingLingkaran);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
