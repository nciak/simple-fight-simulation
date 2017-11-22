package abstraction;

public class RoundOne {

    public static void main(String[] args) {

        Fighter andrzej = new SuperFighter(100,1000,"Andrew");
        Fighter kingBruceLee = new WeakFighter(10,100,"Franek");

        Fighter winner;



        //fight
        andrzej.punch(kingBruceLee);
        kingBruceLee.punch(andrzej);
        // andrzej.underTheBeltPunch(seba);

        if (kingBruceLee.energy<andrzej.energy){
            winner = andrzej;
        } else {
            winner=kingBruceLee;
        }
        System.out.println("And the winner is "+ winner.getName());
        System.out.println(kingBruceLee.getName()+" condition: " +kingBruceLee.energy);
        System.out.println(andrzej.getName()+" condition: " +andrzej.energy);


    }


}
