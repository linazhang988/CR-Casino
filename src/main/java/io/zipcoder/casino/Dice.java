package io.zipcoder.casino;

import java.util.Random;

public class Dice extends Craps{

    private int diceValue;

    public int getDiceValue() {
        return diceValue;
    }

    public static int rollDice() {
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        System.out.println("Dice one is " + dice1 + ", dice two is " + dice2 +". The total value of roll dice is " +(dice1+dice2));
        return dice1 + dice2;
    }
    public DicePlayer passDice(String name, Double money){
        DicePlayer newDicePlayer = new DicePlayer(name, money);
        return newDicePlayer;
    }
}
