package assignment6;

public class InheritanceMain {
    public static void main(String[] args) {
//        Mahasiswa mhs = new Mahasiswa();
//        mhs.setNama("Reza Ageng Trihandoko");
//        System.out.println(mhs.getNama());

//        Mahasiswa mhs = new Mahasiswa();
//        System.out.println(mhs.getNama() + " - " + mhs.getAlamat());

//        Mahasiswa mhs = new Mahasiswa("Reza Ageng Trihandoko", "Bandung");
//        System.out.println(mhs.getNama() + " - " + mhs.getAlamat());

        Mahasiswa mhs = new Mahasiswa("223040085", "Reza Ageng Trihandoko", "Bandung");
        System.out.println(mhs.getNrp() + " - " + mhs.getNama() + " - " + mhs.getAlamat());
    }
}
