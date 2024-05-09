package assignment6.task;

public class Human extends Player {
    private final String sword;

    public Human(String name, String gender, String sword) {
        super(name, gender, "Hero", "Warrior", "Sword");
        this.sword = sword;
    }

    public String getSword() {
        return sword;
    }
}
