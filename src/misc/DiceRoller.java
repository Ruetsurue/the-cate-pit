package misc;

import java.util.Random;

public class DiceRoller {

    public static int attackEvasion(int agility, int incomingAttackDamage) {
        Random random = new Random();
        int statsDeduction = agility - incomingAttackDamage;
        if(statsDeduction < 1) { statsDeduction = 1; }
        int result = random.nextInt(10 ) + 1 + statsDeduction;

        if(result >= 7) {
            System.out.println("Attack evaded!");
            return 0;
        }

        if (result >= 4 && result < 7) {
            System.out.println("Partial damage taken!");
            return incomingAttackDamage - agility;
        }

        System.out.println("CRITICAL: Oooh, that hurt.");
        return incomingAttackDamage;
    }
}
