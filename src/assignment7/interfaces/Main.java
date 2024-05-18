package assignment7.interfaces;

public class Main {
    public static void main(String[] args) {
        KartuElektronik kartuElektronik = new KartuElektronik("IF111", "123");

        System.out.println("Otentikasi: " + kartuElektronik.otentikasi("123"));
    }
}
