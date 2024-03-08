package assignment4;

public class MatakuliahMain {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Object", "B", 3);

        System.out.println("--- Daftar Matakuliah ---");
        System.out.println((mk1.display()));
        System.out.println((mk2.display()));
        System.out.println((mk3.display()));

        System.out.println("Nilai IPK");
        System.out.println("IPK: " + hitungIPK(new Matakuliah[]{mk1, mk2, mk3}));

    }

    static double hitungIPK(Matakuliah[] mk) {
        double totalSks = 0;
        double totalNilai = 0;
        for (Matakuliah matakuliah : mk) {
            totalSks += matakuliah.getSks();
            totalNilai += matakuliah.getSks() * matakuliah.nilaiIndex();
        }
        return totalNilai / totalSks;
    }
}
