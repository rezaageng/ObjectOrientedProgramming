package assignment5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private final List<KartuHasilStudi> kartuHasilStudi;
    private Date tanggalCetak;
    private double ipk = 0.0;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;

        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tanggalCetak = new Date();
    }

    public void hitungIPK() {
        double temp = 0.0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            temp += khs.getIps();
        }
        ipk = temp / kartuHasilStudi.size();
    }

    public void addKhs(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        hitungIPK();
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tanggalCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public Date getTanggalCetak() {
        return tanggalCetak;
    }

    public void setTanggalCetak(Date tanggalCetak) {
        this.tanggalCetak = tanggalCetak;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }
}
