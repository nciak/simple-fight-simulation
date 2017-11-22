package interfaces;

public class Fight {

    public static void main(String[] args) {

        Fighter andrzej = new Boxer(Integer.MAX_VALUE, 1000, "Andrew");
        Fighter danielSun = new KarateKid(10, 30, "Daniel");

        Fighter winner;

        while (true){

            danielSun.punch(andrzej);
            danielSun.kick(andrzej);

            andrzej.punch(danielSun);

            if(danielSun.getEnergy()<0){
                winner = andrzej;
                break;
            } else if (andrzej.getEnergy() < 0){
                winner = danielSun;
                break;
            }
        }

        System.out.println(String.format("The winner is %s", winner.getName()));

    }
}
