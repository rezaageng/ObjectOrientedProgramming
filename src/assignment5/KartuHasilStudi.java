package assignment5;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private final List<Matakuliah> daftarMatakuliah;
    private String semester;
    private double ips;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah matakuliah : daftarMatakuliah) {
            sb.append(matakuliah.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalSks = 0;
        double totalNilai = 0;
        for (Matakuliah matakuliah : daftarMatakuliah) {
            totalSks += matakuliah.getSks();
            totalNilai += matakuliah.getSks() * matakuliah.nilaiIndex();
        }
        this.ips = totalNilai / totalSks;
    }

    public String getSmester() {
        return semester;
    }

    public void setSmester(String smester) {
        this.semester = smester;
    }

    public double getIps() {
        return ips;
    }
}
