package assignment3;

public class LingkaranMain1 {
    public static void main(String[] args) {
        // membuat variable l1, l2, dan l3 dimana l2 mengacu ke l1
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        // menampilkan jari-jari l1, l2, dan l3
        System.out.println(l1.getJariJari());
        System.out.println(l2.getJariJari());
        System.out.println(l3.getJariJari());

        // mengubah jari-jari l2
        l2 = l3;

        // menampilkan jari-jari l1, l2, dan l3
        System.out.println(l1.getJariJari());
        System.out.println(l2.getJariJari());
        System.out.println(l3.getJariJari());
    }
}
