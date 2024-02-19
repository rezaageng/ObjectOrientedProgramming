package assignment2;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        // inisialisasi scanner
        Scanner sc = new Scanner(System.in);

        // input panjang dan lebar
        System.out.print("Panjang: ");
        double panjang = sc.nextInt();

        System.out.print("Lebar: ");
        double lebar = sc.nextInt();

        // hitung luas dan keliling
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // tampilkan hasil
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);
    }
}
