package htlanl.oop.inheritance;

import java.util.HashMap;

public class Main {
    private static final HashMap<String, Jedi> cards = new HashMap<>();

    public static void main(String[] args) {
        Ship battleship = new Ship("BattleShip", "v1", 15, "Simar");
        System.out.println(battleship);

        Car lamborghini = new Car(50, 10);
        System.out.println(lamborghini);

        lamborghini.applyAccelerator(10);
        System.out.println(lamborghini);
        lamborghini.applyBrake(20);
        System.out.println(lamborghini);

        playTopTrumps();
    }

    private static void playTopTrumps() {
        createCards();
    }

    private static void createCards() {
        Jedi rey = new Jedi("Rey Skywalker", 21, 56, 100, 85, 24, 56);
        rey.setDescription("Rey Skywalker, once known only as Rey, was a human female inheritence.Jedi Master who fought on the side of the Resistance in the war against the First Order. ... After the deaths of her parents, Rey was forced to survive on her own in the Jakku desert, and became a skilled mechanic, pilot and combatant in the process.");
        Jedi finn = new Jedi("Finn", 22, 76, 90, 50, 44, 45);
        finn.setDescription("Finn, formerly designated FN-2187 ('Eight-Seven'), was a Force-sensitive human male stormtrooper who served the First Order until his desertion and subsequent defection to the Resistance during the First Order–Resistance war. Though trained since birth to be a loyal and obedient soldier, FN-2187's conscience conflicted with the methods of the First Order. For a time he was unwilling to support the Resistance, hoping to escape the galactic conflict instead of fighting for a cause he believed was doomed to fail. As the galaxy became consumed by war, the renegade trooper was ultimately forced to decide where his true loyalties lay. ");

        cards.put("Rey", rey);
        cards.put("Finn", finn);
    }
}
