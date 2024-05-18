package assignment7.task;

public class Main {
    public static void main(String[] args) {
        Player hero = new Player("Himmel", 100, 10);
        System.out.println("Name: " + hero.getName() + "\nHealth: " + hero.getHealth() + "\nAttack: " + hero.attack());


        hero.takeDamage(5);
        System.out.println(hero.getName() + " takes 5 damage. Health: " + hero.getHealth());
    }
}
