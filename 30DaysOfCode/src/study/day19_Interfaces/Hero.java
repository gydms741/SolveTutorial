package study.day19_Interfaces;

public class Hero implements Character{
    public String weapon = "The Force";

    @Override
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }

    @Override
    public void heal() {
        System.out.println("The hero heals you");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }
}
