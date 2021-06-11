package encounters;

import enemies.Enemy;
import misc.InputValidator;
import player.Player;

import java.util.Scanner;

public class EncounterInitiator {

    Scanner input = new Scanner(System.in);

    public void initiateEncounter(Player player, Enemy enemy) {
        System.out.println("----------------------------------");
        System.out.println(player.getPlayerName() + " encounters: "+ enemy.getEnemySubType() + " " + enemy.getEnemyType() + "!");
        showEncounterOptions(player);
        int choice = chooseEncounterOption(player);

        switch(choice) {
            case 1:
                initiateBattle(player, enemy);
                break;
        }

    }

    public void showEncounterOptions(Player player) {
        System.out.println("Boo, whatcha gonna do?");
        System.out.println("Actions:");
        System.out.println("1) BARK AT CATE, FIGHT CATE!!!!! (ATK: " + player.getAttackDamage() + ")");
        System.out.println("2) Stand up for the test of wit (INT: " + player.getAgility() + ")");
        System.out.println("3) Wait and see what Cate's up to");
        System.out.println("4) RUN LIKE THERE'S NO TOMORROW!! (AGL: " + player.getAgility() + ")");
    }

    public int chooseEncounterOption(Player player) {
        int choice = input.nextInt();

        while(!InputValidator.isValidChoice(choice, 1, 4)){
            InputValidator.invalidInput(choice);
            choice = input.nextInt();
            showEncounterOptions(player);
        }
        return choice;
    }


    public void initiateBattle(Player player, Enemy enemy){
        enemy.greetPlayer();
        System.out.println("So you choose death, Cate. Or rather, I choose it for you.");
    }

    public void initiateRiddle(Player player, Enemy enemy){
        enemy.greetPlayer();
        System.out.println("I shall accept the challenge. Bring it on.");

    }

}
