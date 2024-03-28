package assignment5;

public class Mahasiswa {
    private String nrp;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String nama) {
        super();
        this.nrp = nrp;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + nrp + ", Nama: " + nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
