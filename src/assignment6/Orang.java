package assignment6;

public class Orang {
    protected String nama;
    protected String alamat;

    public Orang() {
        this.nama = "Reza Ageng Trihandoko";
        this.alamat = "Bandung";
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
