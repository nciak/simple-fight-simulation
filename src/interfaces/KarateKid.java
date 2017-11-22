package interfaces;

public class KarateKid implements Fighter{

    private int strength;
    private int energy;
    private String name;

    public KarateKid(int strength, int energy, String name) {
        this.strength = strength;
        this.energy = energy;
        this.name = name;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void punch(Fighter enemy) {

        enemy.takeHit(10);

    }

    @Override
    public void kick(Fighter enemy) {
        enemy.takeHit(20);
        energy -= 1;
    }


    @Override
    public void takeHit(int dmg) {
        energy -= dmg*2;
    }
    public int getStrength() {
        return strength;
    }
}
