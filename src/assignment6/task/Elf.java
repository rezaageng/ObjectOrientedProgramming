package assignment6.task;

public class Elf extends Player {
    private final String wand;

    public Elf(String name, String gender, String wand) {
        super(name, gender, "Elf", "Mage", "Wand");
        this.wand = wand;
    }

    public String getWand() {
        return wand;
    }
}
