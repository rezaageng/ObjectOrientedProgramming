package assignment6;

public class Orang {
    protected String nama;
    protected String alamat;

    public Orang(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
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
