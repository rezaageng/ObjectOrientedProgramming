package assignment5;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Object", "B", 3);

        KartuHasilStudi khs = new KartuHasilStudi("2022");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        Mahasiswa mhs = new Mahasiswa("223040085", "Reza");

        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKhs(khs);
        transkrip.display();
    }
}
