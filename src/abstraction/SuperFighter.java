package abstraction;

public class SuperFighter extends Fighter {


    public SuperFighter(int strength, int energy, String name) {
        super(strength, energy, name);
    }

    @Override
    public void punch(Fighter enemy) {
        enemy.energy -= 50;
    }

    public void underTheBeltPunch(Fighter enemy){
        enemy.energy -= 100000000;
        name = "Olo";
    }

}

