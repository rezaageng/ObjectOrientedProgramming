package assignment6.task;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Himmel", "Male", "Hero's Blade");
        System.out.println("Name: " + human.getName() +
                "\nGender: " + human.getGender() +
                "\nRace: " + human.getRace() +
                "\nJob: " + human.getJob() +
                "\nWeapon: " + human.getWeapon() +
                "\nSword: " + human.getSword());

        Elf elf = new Elf("Frieren", "Female", "Magic Wand");
        System.out.println("\nName: " + elf.getName() +
                "\nGender: " + elf.getGender() +
                "\nRace: " + elf.getRace() +
                "\nJob: " + elf.getJob() +
                "\nWeapon: " + elf.getWeapon() +
                "\nWand: " + elf.getWand());
    }
}
