package extensions;

public class RoundOne {

    public static void main(String[] args) {
        Fighter seba = new Fighter(5,100, "Franko");
        Fighter janusz = new Fighter(5,100, "Franko");
        SuperFighter andrzej = new SuperFighter(100,1000,"Andrew");

        Fighter winner;

        seba.toString();


        //fight
        seba.punch(andrzej);
        andrzej.punch(seba);
        // andrzej.underTheBeltPunch(seba);

        if (seba.energy<andrzej.energy){
            winner = andrzej;
        } else {
            winner=seba;
        }
        System.out.println("And the winner is "+ winner.getName());
        System.out.println("Seba condition: " +seba.energy);
        System.out.println("Andrew condition: " +andrzej.energy);


    }


}
