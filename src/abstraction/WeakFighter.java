package abstraction;

public class WeakFighter extends Fighter {
private String kimonoColor;
    public WeakFighter(int strength, int energy, String name) {
        super(strength, energy, name);
        kimonoColor = "white";
    }

    @Override
    public void punch(Fighter enemy) {
        enemy.energy -= 1;
    }

    public String getKimonoColor() {
        return kimonoColor;
    }
}
