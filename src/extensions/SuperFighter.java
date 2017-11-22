package extensions;


public class SuperFighter extends Fighter {


    public SuperFighter(int strength, int energy, String name) {
        super(strength, energy, name);
    }

    public void underTheBeltPunch(Fighter enemy){
        enemy.energy -= 100000000;
        name = "Olo";
    }



}

