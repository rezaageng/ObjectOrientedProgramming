package assignment7.task;

public class Player extends Creature {
    private final int baseAttack;

    public Player(String name, int health, int baseAttack) {
        super(name, health);
        this.baseAttack = baseAttack;
    }

    @Override
    public int attack() {
        return baseAttack;
    }
}
