package assignment2;

import java.util.Scanner;

public class PersegiPanjang2 {
    // inisialisasi atribut panjang dan lebar
    static double panjang;
    static double lebar;

    // method menghitung luas
    static double hitungLuas() {
        // mengembalikan hasil perkalian panjang dan lebar
        return panjang * lebar;
    }

    // method menghitung keliling
    static double hitungKeliling() {
        // mengembalikan hasil perhitungan keliling
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        // inisialisasi scanner
        Scanner sc = new Scanner(System.in);

        // input panjang dan lebar
        System.out.print("Panjang: ");
        panjang = sc.nextInt();

        System.out.print("Lebar: ");
        lebar = sc.nextInt();

        // tampilkan hasil menggunakan method
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
