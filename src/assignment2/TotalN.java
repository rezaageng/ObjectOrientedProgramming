package assignment2;

import java.util.Scanner;

public class TotalN {
    public static void main(String[] args) {
        // inisialisasi scanner
        Scanner sc = new Scanner(System.in);

        // input N
        System.out.print("N: ");
        int n = sc.nextInt();

        // validasi N tidak boleh nol atau minus
        if (n <= 0) {
            System.out.println("N tidak boleh nol atau minus");
            return;
        }

        // penampung total nilai yang diinput
        int total = 0;

        // input nilai sebanyak N kali dan tambahkan ke total
        for (int i = 0; i < n; i++) {
            total += sc.nextInt();
        }

        // tampilkan total
        System.out.println("Total: " + total);
    }
}
