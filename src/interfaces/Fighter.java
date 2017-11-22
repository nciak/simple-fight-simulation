package interfaces;

public interface Fighter {

    int getEnergy();
    void punch(Fighter enemy);
    void kick(Fighter enemy);
    void takeHit(int dmg);
    String getName();
}
