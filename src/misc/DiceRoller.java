package misc;

import treasureitems.*;

import java.util.Random;

public class DiceRoller {

    private static Random random = new Random();

    public static int calculateAttackEvasion(int agility, int incomingAttackDamage) {
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

    public static TreasureItem generateReward() {
        int rewardTypeRoll = random.nextInt(4);
        TreasureItem reward;

        switch(rewardTypeRoll) {
            case 0:
                reward = new StrengthBone();
                break;
            case 1:
                reward = new WisdomBone();
                break;
            case 2:
                reward = new AgilityBone();
                break;
            case 3:
                reward = new VitalityBone();
                break;
            default:
                reward = new StrengthBone();
        }

        return reward;
    }
}
