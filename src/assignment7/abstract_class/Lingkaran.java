package assignment7.abstract_class;

public class Lingkaran extends Bentuk {
    public Lingkaran(int jari2) {
        super(jari2);
    }

    @Override
    public double hitungLuas() {
        return phi * jari2 * jari2;
    }
}
