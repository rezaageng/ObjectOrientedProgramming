package assignment2;

import java.util.Scanner;

public class IndeksNilaiMatkul {
    public static void main(String[] args) {
        // inisialisasi scanner
        Scanner sc = new Scanner(System.in);

        // input nilai
        System.out.print("Nilai: ");
        String nilaiString = sc.nextLine();

        // validasi nilai kosong
        if (nilaiString.isEmpty()) {
            System.out.println("Nilai harus diisi");
            return;
        }

        // mengubah nilai dari string ke double
        double nilai = Double.parseDouble(nilaiString);

        // menentukan indeks nilai
        if (nilai > 100 || nilai < 0) {
            System.out.println("Nilai di luar jangkauan");
        } else if (nilai > 80) {
            System.out.println("A");
        } else if (nilai > 75) {
            System.out.println("AB");
        } else if (nilai > 55) {
            System.out.println("B");
        } else if (nilai > 50) {
            System.out.println("BC");
        } else if (nilai > 40) {
            System.out.println("C");
        } else if (nilai > 20) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
