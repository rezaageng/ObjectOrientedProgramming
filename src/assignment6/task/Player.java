package assignment6.task;

public class Player {
    private final String name;
    private final String gender;
    private final String race;
    private final String job;
    private final String weapon;

    public Player(String name, String gender, String race, String job, String weapon) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.job = job;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getJob() {
        return job;
    }

    public String getWeapon() {
        return weapon;
    }
}
