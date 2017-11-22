package extensions;

public class Fighter {

    protected int strength;
    protected int energy;
    protected String name;

    public Fighter(int strength, int energy, String name) {
        this.strength = strength;
        this.energy = energy;
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }


    public void punch(Fighter enemy) {
        enemy.energy -= 5;
    }

    @Override
    public String toString(){
        return name;
    }
}
