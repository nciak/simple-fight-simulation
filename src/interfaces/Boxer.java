package interfaces;

/**
 * Created by Norbert on 2017-07-29.
 */
public class Boxer implements Fighter {

    private int strength;
    private int energy;
    private String name;

    public Boxer(int strength, int energy, String name) {
        this.strength = strength;
        this.energy = energy;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void punch(Fighter enemy) {
        enemy.takeHit(20);
    }

    @Override
    public void kick(Fighter enemy) {
        enemy.takeHit(0);
        energy -= 1;
    }

    @Override
    public void takeHit(int dmg) {
        if(energy > 100){
            energy -= dmg*0.5;
        } else {
            energy -= dmg;
        }
    }

    public int getStrength() {
        return strength;
    }
@Override
    public int getEnergy() {
        return energy;
    }
}
