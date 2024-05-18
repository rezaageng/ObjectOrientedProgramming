package assignment7.task;

public abstract class Creature implements Character {
    private final String name;
    private int health;

    public Creature(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public abstract int attack();
}
